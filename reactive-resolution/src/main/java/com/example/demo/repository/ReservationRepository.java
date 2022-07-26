package com.example.demo.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.demo.model.Reservation;

public interface ReservationRepository extends ReactiveCrudRepository<Reservation, Integer> {

}