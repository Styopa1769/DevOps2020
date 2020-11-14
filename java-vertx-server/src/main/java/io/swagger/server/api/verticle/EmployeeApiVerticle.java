package io.swagger.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import io.swagger.server.api.model.Employee;
import io.swagger.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class EmployeeApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(EmployeeApiVerticle.class); 
    
    final static String ADDEMPLOYEE_SERVICE_ID = "addEmployee";
    final static String DELETEEMPLOYEE_SERVICE_ID = "deleteEmployee";
    final static String GETEMPLOYEEBYID_SERVICE_ID = "getEmployeeById";
    final static String UPDATEEMPLOYEE_SERVICE_ID = "updateEmployee";
    
    final EmployeeApi service;

    public EmployeeApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("io.swagger.server.api.verticle.EmployeeApiImpl");
            service = (EmployeeApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("EmployeeApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for addEmployee
        vertx.eventBus().<JsonObject> consumer(ADDEMPLOYEE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "addEmployee";
                JsonObject bodyParam = message.body().getJsonObject("body");
                if (bodyParam == null) {
                    manageError(message, new MainApiException(400, "body is required"), serviceId);
                    return;
                }
                Employee body = Json.mapper.readValue(bodyParam.encode(), Employee.class);
                service.addEmployee(body, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "addEmployee");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("addEmployee", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteEmployee
        vertx.eventBus().<JsonObject> consumer(DELETEEMPLOYEE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteEmployee";
                String employeeIdParam = message.body().getString("employeeId");
                if(employeeIdParam == null) {
                    manageError(message, new MainApiException(400, "employeeId is required"), serviceId);
                    return;
                }
                Long employeeId = Json.mapper.readValue(employeeIdParam, Long.class);
                String apiKeyParam = message.body().getString("api_key");
                String apiKey = (apiKeyParam == null) ? null : apiKeyParam;
                service.deleteEmployee(employeeId, apiKey, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteEmployee");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteEmployee", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getEmployeeById
        vertx.eventBus().<JsonObject> consumer(GETEMPLOYEEBYID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getEmployeeById";
                String employeeIdParam = message.body().getString("employeeId");
                if(employeeIdParam == null) {
                    manageError(message, new MainApiException(400, "employeeId is required"), serviceId);
                    return;
                }
                Long employeeId = Json.mapper.readValue(employeeIdParam, Long.class);
                service.getEmployeeById(employeeId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getEmployeeById");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getEmployeeById", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateEmployee
        vertx.eventBus().<JsonObject> consumer(UPDATEEMPLOYEE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateEmployee";
                JsonObject bodyParam = message.body().getJsonObject("body");
                if (bodyParam == null) {
                    manageError(message, new MainApiException(400, "body is required"), serviceId);
                    return;
                }
                Employee body = Json.mapper.readValue(bodyParam.encode(), Employee.class);
                service.updateEmployee(body, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateEmployee");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateEmployee", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }
    
    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause); 
        }
            
        message.fail(code, statusMessage);
    }
    
    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
