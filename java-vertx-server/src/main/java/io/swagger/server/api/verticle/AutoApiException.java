package io.swagger.server.api.verticle;

import io.swagger.server.api.model.Auto;
import io.swagger.server.api.MainApiException;

public final class AutoApiException extends MainApiException {
    public AutoApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final AutoApiException Auto_addAuto_405_Exception = new AutoApiException(405, "Invalid input");
    public static final AutoApiException Auto_deleteAuto_400_Exception = new AutoApiException(400, "Invalid ID supplied");
    public static final AutoApiException Auto_deleteAuto_404_Exception = new AutoApiException(404, "Auto not found");
    public static final AutoApiException Auto_getAutoById_400_Exception = new AutoApiException(400, "Invalid ID supplied");
    public static final AutoApiException Auto_getAutoById_404_Exception = new AutoApiException(404, "Auto not found");
    public static final AutoApiException Auto_updateAuto_400_Exception = new AutoApiException(400, "Invalid ID supplied");
    public static final AutoApiException Auto_updateAuto_404_Exception = new AutoApiException(404, "Auto not found");
    public static final AutoApiException Auto_updateAuto_405_Exception = new AutoApiException(405, "Validation exception");
    

}