package com.au.team.simulator.controller;

import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class web {


    @RequestMapping(value = "/process", method = RequestMethod.POST)
    public JSONObject hello(@RequestBody Map<String, Object> payload){

        return  new JSONObject(payload);
    }

}
