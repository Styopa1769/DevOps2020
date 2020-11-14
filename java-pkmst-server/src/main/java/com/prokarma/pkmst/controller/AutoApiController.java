package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.Auto;

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
public class AutoApiController implements AutoApi {
    private final ObjectMapper objectMapper;
@Autowired
    public AutoApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Void> addAuto(@ApiParam(value = "Auto object that needs to be added to the autodealer" ,required=true )   @RequestBody Auto body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteAuto(@ApiParam(value = "Auto id to delete",required=true ) @PathVariable("autoId") Long autoId,
        @ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Auto> getAutoById(@ApiParam(value = "ID of auto to return",required=true ) @PathVariable("autoId") Long autoId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/xml")) {
            return new ResponseEntity<Auto>(objectMapper.readValue("", Auto.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Auto>(objectMapper.readValue("", Auto.class), HttpStatus.OK);
        }

        return new ResponseEntity<Auto>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateAuto(@ApiParam(value = "Auto object that needs to be updated" ,required=true )   @RequestBody Auto body,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
