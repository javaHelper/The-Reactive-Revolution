package com.example.demo.service;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.Stream;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.dto.GreetingRequest;
import com.example.demo.dto.GreetingResponse;

import reactor.core.publisher.Flux;

@Controller
public class GreetingService {

	@MessageMapping("greetings")
	Flux<GreetingResponse> greet(GreetingRequest request) {
		return Flux
				.fromStream(Stream.generate(
						() -> new GreetingResponse("Hello " + request.getName() + " @ " + Instant.now().toString())))
				.delayElements(Duration.ofSeconds(1));
	}
}