package com.example.carsapi.controller;

import com.example.carsapi.entity.Car;
import com.example.carsapi.entity.Order;
import com.example.carsapi.payload.OrderRequest;
import com.example.carsapi.repository.CarRepository;
import com.example.carsapi.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    CarRepository carRepository;

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders() {

        try {
            List<Order> orders = new ArrayList<Order>(orderRepository.findAll());

            if (orders.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(orders, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/orders")
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequest orderRequest) {
        try {
            Long carId = orderRequest.getCarId();
            Car car = carRepository.getCarById(carId);
            Order _order = orderRepository
                    .save(new Order(orderRequest.getName(), orderRequest.getSurname(), orderRequest.getAddress(), orderRequest.getPhone(), car));
            return new ResponseEntity<>(_order, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}