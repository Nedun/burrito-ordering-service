package com.generali.burritoorderingservice.service;

import com.generali.burritoorderingservice.models.BurritoOrder;
import com.generali.burritoorderingservice.repository.BurritoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BurritoService {

    @Autowired
    private BurritoRepository burritoRepository;

    //TODO: return meaningful success and handle exception for duplicate orders.
    public BurritoOrder getOrderDetails(Long orderId){
        BurritoOrder burritoOrder = burritoRepository.findById(orderId).orElse(null);
        return burritoOrder;
    }

    //TODO: Error handling
    public String addOrder(BurritoOrder burritoOrder){
        burritoOrder.getVegetables().setId(burritoOrder.getId());
        burritoOrder.getExtras().setId(burritoOrder.getId());
        burritoRepository.save(burritoOrder);
        return "Order "+burritoOrder.getId().toString()+" created.";
    }
}
