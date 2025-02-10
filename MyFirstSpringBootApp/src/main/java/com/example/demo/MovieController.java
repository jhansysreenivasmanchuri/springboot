package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MovieController {
	private static final String template = "Hello, %s!. Your Favorite Movie is %s!";
	private final AtomicLong atomicLong = new AtomicLong();

	@GetMapping("/movie")
	public String getMovie(@RequestParam String name, @RequestParam String favmovie) {
		return String.format(atomicLong.incrementAndGet() + " . " + template, name, favmovie);
	}

}
