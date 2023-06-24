package com.example.carsapi.repository;

import com.example.carsapi.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Order getOrderById(Long id);
}
