package com.example.cfy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cfy.model.Car;
import com.example.cfy.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
    
    @Autowired
    private CarService service;

    @PostMapping()
    public ResponseEntity<Car> save(@RequestBody Car car){
        car = this.service.save(car);
        return ResponseEntity.ok().body(car);
    }
}
