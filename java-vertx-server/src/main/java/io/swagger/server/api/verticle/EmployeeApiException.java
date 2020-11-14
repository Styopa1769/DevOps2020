package io.swagger.server.api.verticle;

import io.swagger.server.api.model.Employee;
import io.swagger.server.api.MainApiException;

public final class EmployeeApiException extends MainApiException {
    public EmployeeApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final EmployeeApiException Employee_addEmployee_405_Exception = new EmployeeApiException(405, "Invalid input");
    public static final EmployeeApiException Employee_deleteEmployee_400_Exception = new EmployeeApiException(400, "Invalid ID supplied");
    public static final EmployeeApiException Employee_deleteEmployee_404_Exception = new EmployeeApiException(404, "Employee not found");
    public static final EmployeeApiException Employee_getEmployeeById_400_Exception = new EmployeeApiException(400, "Invalid ID supplied");
    public static final EmployeeApiException Employee_getEmployeeById_404_Exception = new EmployeeApiException(404, "Employee not found");
    public static final EmployeeApiException Employee_updateEmployee_400_Exception = new EmployeeApiException(400, "Invalid ID supplied");
    public static final EmployeeApiException Employee_updateEmployee_404_Exception = new EmployeeApiException(404, "Employee not found");
    public static final EmployeeApiException Employee_updateEmployee_405_Exception = new EmployeeApiException(405, "Validation exception");
    

}