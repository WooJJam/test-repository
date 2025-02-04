package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping
public class TestController {

	@GetMapping
	public ResponseEntity test() {
		log.info("commit 1");
		log.info("commit 2");
		return ResponseEntity.ok("Success!");
	}
}
