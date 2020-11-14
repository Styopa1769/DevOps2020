package io.swagger.server.api.verticle;

import io.swagger.server.api.MainApiException;

public final class DealerApiException extends MainApiException {
    public DealerApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    

}