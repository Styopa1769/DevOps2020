/*
 * Autodealer
 * This is a sample server Petstore server.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Auto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AutoApi
 */
@Ignore
public class AutoApiTest {

    private final AutoApi api = new AutoApi();

    
    /**
     * Add a new auto to the dealer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAutoTest() throws ApiException {
        Auto body = null;
        api.addAuto(body);

        // TODO: test validations
    }
    
    /**
     * Deletes a auto
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAutoTest() throws ApiException {
        Long autoId = null;
        String apiKey = null;
        api.deleteAuto(autoId, apiKey);

        // TODO: test validations
    }
    
    /**
     * Find auto by ID
     *
     * Returns a single auto
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAutoByIdTest() throws ApiException {
        Long autoId = null;
        Auto response = api.getAutoById(autoId);

        // TODO: test validations
    }
    
    /**
     * Update an existing auto
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAutoTest() throws ApiException {
        Auto body = null;
        api.updateAuto(body);

        // TODO: test validations
    }
    
}
