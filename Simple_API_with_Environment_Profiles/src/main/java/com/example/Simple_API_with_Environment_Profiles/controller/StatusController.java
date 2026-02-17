package com.example.Simple_API_with_Environment_Profiles.controller;

import com.example.Simple_API_with_Environment_Profiles.service.WelcomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class StatusController {
    private final WelcomeService welcomeService;

    @GetMapping("/api/status")

    public Map<String, String> getStatus() {
        Map<String, String> status = new HashMap<>();

        status.put("message : ",welcomeService.getMessage());
        status.put("apiUrl : ",welcomeService.getApiUrl());

        return status;
    }

}
