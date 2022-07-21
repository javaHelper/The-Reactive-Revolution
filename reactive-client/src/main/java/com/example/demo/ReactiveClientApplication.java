package com.example.demo;

import java.io.IOException;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.rsocket.RSocketRequester;

import com.example.demo.dto.GreetingRequest;
import com.example.demo.dto.GreetingResponse;

import lombok.extern.log4j.Log4j2;


@Log4j2
@SpringBootApplication
public class ReactiveClientApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ReactiveClientApplication.class, args);
		System.in.read();
	}

	@Bean
    public ApplicationRunner rSocketClient(RSocketRequester rSocketRequester) {
        return args -> {
            rSocketRequester.route("greetings")
                    .data(new GreetingRequest("All the Talks"))
                    .retrieveFlux(GreetingResponse.class)
                    .subscribe(log::info);
        };
    }
}
