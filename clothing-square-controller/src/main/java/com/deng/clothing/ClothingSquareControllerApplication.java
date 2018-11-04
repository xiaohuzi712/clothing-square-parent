package com.deng.clothing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ClothingSquareControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClothingSquareControllerApplication.class, args);
	}

	@GetMapping("/demo1")
	public String demo1() {
		return "Hello Luis";
	}

    @GetMapping("/demo2")
    public String demo2() {
        return "Hello zhuhuchao";
    }
}
