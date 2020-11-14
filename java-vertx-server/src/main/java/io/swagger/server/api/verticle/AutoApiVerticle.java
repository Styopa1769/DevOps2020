package io.swagger.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import io.swagger.server.api.model.Auto;
import io.swagger.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class AutoApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(AutoApiVerticle.class); 
    
    final static String ADDAUTO_SERVICE_ID = "addAuto";
    final static String DELETEAUTO_SERVICE_ID = "deleteAuto";
    final static String GETAUTOBYID_SERVICE_ID = "getAutoById";
    final static String UPDATEAUTO_SERVICE_ID = "updateAuto";
    
    final AutoApi service;

    public AutoApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("io.swagger.server.api.verticle.AutoApiImpl");
            service = (AutoApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("AutoApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for addAuto
        vertx.eventBus().<JsonObject> consumer(ADDAUTO_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "addAuto";
                JsonObject bodyParam = message.body().getJsonObject("body");
                if (bodyParam == null) {
                    manageError(message, new MainApiException(400, "body is required"), serviceId);
                    return;
                }
                Auto body = Json.mapper.readValue(bodyParam.encode(), Auto.class);
                service.addAuto(body, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "addAuto");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("addAuto", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteAuto
        vertx.eventBus().<JsonObject> consumer(DELETEAUTO_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteAuto";
                String autoIdParam = message.body().getString("autoId");
                if(autoIdParam == null) {
                    manageError(message, new MainApiException(400, "autoId is required"), serviceId);
                    return;
                }
                Long autoId = Json.mapper.readValue(autoIdParam, Long.class);
                String apiKeyParam = message.body().getString("api_key");
                String apiKey = (apiKeyParam == null) ? null : apiKeyParam;
                service.deleteAuto(autoId, apiKey, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteAuto");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteAuto", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getAutoById
        vertx.eventBus().<JsonObject> consumer(GETAUTOBYID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getAutoById";
                String autoIdParam = message.body().getString("autoId");
                if(autoIdParam == null) {
                    manageError(message, new MainApiException(400, "autoId is required"), serviceId);
                    return;
                }
                Long autoId = Json.mapper.readValue(autoIdParam, Long.class);
                service.getAutoById(autoId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getAutoById");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getAutoById", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateAuto
        vertx.eventBus().<JsonObject> consumer(UPDATEAUTO_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateAuto";
                JsonObject bodyParam = message.body().getJsonObject("body");
                if (bodyParam == null) {
                    manageError(message, new MainApiException(400, "body is required"), serviceId);
                    return;
                }
                Auto body = Json.mapper.readValue(bodyParam.encode(), Auto.class);
                service.updateAuto(body, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateAuto");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateAuto", e);
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
