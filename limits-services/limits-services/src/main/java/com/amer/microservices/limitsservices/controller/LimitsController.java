package com.amer.microservices.limitsservices.controller;

import com.amer.microservices.limitsservices.config.Configuration;
import com.amer.microservices.limitsservices.entity.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping(value = "/limits")
    public LimitConfiguration retrieveLimits()
    {
        return new LimitConfiguration(configuration.getMaximum() , configuration.getMinimum());
    }

}
