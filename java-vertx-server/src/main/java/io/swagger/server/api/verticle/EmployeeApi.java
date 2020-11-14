package io.swagger.server.api.verticle;

import io.swagger.server.api.model.Employee;
import io.swagger.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface EmployeeApi  {
    //addEmployee
    void addEmployee(Employee body, Handler<AsyncResult<Void>> handler);
    
    //deleteEmployee
    void deleteEmployee(Long employeeId, String apiKey, Handler<AsyncResult<Void>> handler);
    
    //getEmployeeById
    void getEmployeeById(Long employeeId, Handler<AsyncResult<Employee>> handler);
    
    //updateEmployee
    void updateEmployee(Employee body, Handler<AsyncResult<Void>> handler);
    
}
