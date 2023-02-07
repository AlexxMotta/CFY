package com.example.cfy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cfy.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Long>{
    
}
