package io.swagger.server.api.verticle;

import io.swagger.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface DealerApi  {
    //getAutos
    void getAutos(Handler<AsyncResult<Map<String, Integer>>> handler);
    
    //getEmployees
    void getEmployees(Handler<AsyncResult<Map<String, Integer>>> handler);
    
}
