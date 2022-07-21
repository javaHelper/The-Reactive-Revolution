package com.example.demo.config;

import java.time.Duration;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.model.Reservation;

import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Flux;


@Log4j2
@Configuration
public class AppConfig {
	@Bean
    public WebClient http(WebClient.Builder builder) {
        return builder.build();
    }

    @Bean
    public RSocketRequester rSocket(RSocketRequester.Builder builder) {
        return builder.tcp("localhost", 7070);
    }
    
    @Bean
    public ApplicationRunner httpClient(WebClient http) {
        return args -> {
            http
                    .get()
                    .uri("http://localhost:8080/reservations")
                    .retrieve()
                    .bodyToFlux(Reservation.class)
                    .map(r -> r.getName())
                    .onErrorResume(ex -> Flux.just("EEKK!"))
                    .retry()
                    .timeout(Duration.ofSeconds(1))
                    .subscribe(log::info);
        };
    }
}
