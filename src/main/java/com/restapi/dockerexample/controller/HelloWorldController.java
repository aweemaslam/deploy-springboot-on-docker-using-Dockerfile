package com.restapi.dockerexample.controller;

import com.google.common.collect.ImmutableMap;
import com.restapi.dockerexample.dto.DtoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HelloWorldController {

    @GetMapping(value = "/hello")
    public DtoResponse hello() {
        DtoResponse response = DtoResponse.builder().body(ImmutableMap.of("message", "Hello Docker!!")).build();
        response.setStatus(HttpStatus.OK.name());
        response.setMessage("Success");
        return response;
    }


}
