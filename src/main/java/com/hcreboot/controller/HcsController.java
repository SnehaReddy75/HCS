package com.hcreboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by sneha.dontireddy on 11/12/17.
 */
@RestController
@RequestMapping("/data")
public class HcsController {

    @RequestMapping("/patient")
    public ResponseEntity getPatientData(){
        return ResponseEntity.ok("Hello Sneha Reddy!!!");
    }

}
