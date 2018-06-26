package com.au.team.simulator.controller;

import net.minidev.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class web {

    private static final Logger logger = LoggerFactory.getLogger(web.class);



    @RequestMapping(value = "/process", method = RequestMethod.POST)
    public JSONObject hello(@RequestBody Map<String, Object> payload){

        return  new JSONObject(payload);
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public JSONObject get(){

        JSONObject obj = new JSONObject();

        obj.put("Halo", "World");

        return new JSONObject(obj);
    }


    @RequestMapping(value = "/display", method = RequestMethod.POST)
    public JSONObject displayHeaders(@RequestBody Map<String, Object> payload,
                                     @RequestHeader("Content-Type") String encode,
                                     @RequestHeader("Accept-Charset") String accept){

        JSONObject obj = new JSONObject();
        logger.info(String.format(" :: Content-Type :: %s", encode));
        logger.info(" :: Accept-Charset :: "+ accept);
        logger.info(" :: Body :: "+ payload);
        obj.put("Content-Type", encode);
        obj.put("Accept_charset",accept);
        obj.put("Request Body",payload);
        return new JSONObject(obj);
    }
}


