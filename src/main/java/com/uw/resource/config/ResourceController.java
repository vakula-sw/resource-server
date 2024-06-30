package com.uw.resource.config;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
    @GetMapping("/api/resource")
    public String resource() {
        return "Protected resource";
    }
}
