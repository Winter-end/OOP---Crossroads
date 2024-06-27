package com.example.demo.api;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.sign.Sign;
import com.example.demo.models.sign.SpeedLimitSign;
import com.example.demo.service.DemoService;

@RequestMapping("sign")
@RestController
public class SignController {

    private final DemoService service;

    @Autowired
    public SignController(DemoService service) {
        this.service = service;
    }
    
    @PostMapping
    public void addSign(@RequestBody SpeedLimitSign sign) {
        service.addSign(sign);
    }

    @GetMapping
    public Set<Sign> getAllSigns() {
        return service.getAllSigns();
    }
}
