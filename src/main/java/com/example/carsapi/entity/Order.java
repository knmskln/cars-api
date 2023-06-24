package com.example.carsapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @ManyToOne()
    @JoinColumn(name = "car_id")
    private Car car;

    public Order() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Order(String name, String surname, String address, String phone, Car car) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.car = car;
    }
}