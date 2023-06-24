package com.example.carsapi.repository;

import com.example.carsapi.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByMarkContaining(String mark);
    Car getCarById(Long carId);

}