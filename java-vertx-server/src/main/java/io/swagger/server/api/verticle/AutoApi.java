package io.swagger.server.api.verticle;

import io.swagger.server.api.model.Auto;
import io.swagger.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface AutoApi  {
    //addAuto
    void addAuto(Auto body, Handler<AsyncResult<Void>> handler);
    
    //deleteAuto
    void deleteAuto(Long autoId, String apiKey, Handler<AsyncResult<Void>> handler);
    
    //getAutoById
    void getAutoById(Long autoId, Handler<AsyncResult<Auto>> handler);
    
    //updateAuto
    void updateAuto(Auto body, Handler<AsyncResult<Void>> handler);
    
}
