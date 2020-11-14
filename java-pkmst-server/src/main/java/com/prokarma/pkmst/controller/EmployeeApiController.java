package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Employee;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPKMSTServerCodegen", date = "2020-11-14T17:17:21.195Z")

@Controller
public class EmployeeApiController implements EmployeeApi {
    private final ObjectMapper objectMapper;
@Autowired
    public EmployeeApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Void> addEmployee(@ApiParam(value = "Employee object that needs to be added to the autodealer" ,required=true )   @RequestBody Employee body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteEmployee(@ApiParam(value = "Employee id to delete",required=true ) @PathVariable("employeeId") Long employeeId,
        @ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Employee> getEmployeeById(@ApiParam(value = "ID of employee to return",required=true ) @PathVariable("employeeId") Long employeeId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/xml")) {
            return new ResponseEntity<Employee>(objectMapper.readValue("", Employee.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Employee>(objectMapper.readValue("", Employee.class), HttpStatus.OK);
        }

        return new ResponseEntity<Employee>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateEmployee(@ApiParam(value = "Employee object that needs to be updated" ,required=true )   @RequestBody Employee body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
