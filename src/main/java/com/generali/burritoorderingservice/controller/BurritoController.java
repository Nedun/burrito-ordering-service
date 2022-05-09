package com.generali.burritoorderingservice.controller;

import com.generali.burritoorderingservice.models.*;
import com.generali.burritoorderingservice.service.BurritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BurritoController {

    @Autowired
    BurritoService burritoService;

    //TODO: Error Handling. Authentication
    @GetMapping("/orders/{orderId}")
    public BurritoOrder getBurritoOrderDetails(@PathVariable("orderId") Long orderId){
        return burritoService.getOrderDetails(orderId);
    }

    //TODO: return meaningful success and handle exception. Authentication
    @RequestMapping(method=RequestMethod.POST, value="/orders")
    public String addOrder(@RequestBody BurritoOrder burritoOrder){
        return burritoService.addOrder(burritoOrder);
    }
}
