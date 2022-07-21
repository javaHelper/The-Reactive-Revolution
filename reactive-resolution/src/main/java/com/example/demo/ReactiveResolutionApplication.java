package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.demo.model.Reservation;
import com.example.demo.repository.ReservationRepository;

@SpringBootApplication
public class ReactiveResolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveResolutionApplication.class, args);
	}

	@Bean
    public RouterFunction<ServerResponse> routes(ReservationRepository rr) {
        return RouterFunctions.route()
                .GET("/reservations", request -> ServerResponse.ok().body(rr.findAll(), Reservation.class))
                .build();
    }
}
