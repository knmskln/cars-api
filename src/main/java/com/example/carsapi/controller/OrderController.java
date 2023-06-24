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
import java.util.Optional;

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

    @PutMapping("/orders/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable("id") long id, @RequestBody OrderRequest orderRequest) {
        Optional<Order> orderData = orderRepository.findById(id);
        if (orderData.isPresent()) {
            Order _order = orderData.get();
            Car car = carRepository.getCarById(orderRequest.getCarId());
            _order.setName(orderRequest.getName());
            _order.setSurname(orderRequest.getSurname());
            _order.setAddress(orderRequest.getAddress());
            _order.setPhone(orderRequest.getPhone());
            _order.setCar(car);
            return new ResponseEntity<>(orderRepository.save(_order), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/orders/{id}")
    public ResponseEntity<HttpStatus> deleteOrder(@PathVariable("id") long id) {
        try {
            orderRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}