package com.example.demo.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.demo.model.Reservation;
import com.example.demo.repository.ReservationRepository;

import reactor.core.publisher.Flux;

@Component
public class SampleDataInit {
    @Autowired
    private ReservationRepository reservationRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void go() {
        Flux<Reservation> reservationFlux = Flux.just("Neha", "Aravind", "Laxmi", "Rajesh", "Anosh", "Sam", "Alex")
                .map(name -> Reservation.builder().name(name).build())
                .flatMap(r -> this.reservationRepository.save(r));

        this.reservationRepository.deleteAll()
                .thenMany(reservationFlux)
                .thenMany(this.reservationRepository.findAll())
                .subscribe(System.out::println);
    }
}