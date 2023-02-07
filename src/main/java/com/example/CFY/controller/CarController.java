package com.example.cfy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("/findAll")
    public ResponseEntity<List<Car>> findAll(){
        List<Car> cars = this.service.findAll();
        return ResponseEntity.ok().body(cars);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<Car> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(this.service.findById(id));
    }

    @PutMapping()
    public ResponseEntity<Car> update(@RequestBody Car car){
        car = this.service.save(car);
        return ResponseEntity.ok().body(car);
    }
}
