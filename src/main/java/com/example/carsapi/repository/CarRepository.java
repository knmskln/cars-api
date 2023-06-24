package com.example.carsapi.repository;

import com.example.carsapi.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    Car getCarById(Long carId);

}