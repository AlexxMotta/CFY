package com.example.cfy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cfy.model.Car;
import com.example.cfy.repository.CarRepository;

@Service
public class CarService {
    
    @Autowired
    private CarRepository repository;

    public Car save(Car car){
        return repository.save(car);
    }
    
    public Car findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Car> findAll(){
        return repository.findAll();
    }
}
