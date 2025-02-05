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

	public ResponseEntity test() {
		log.info("commit 1");
		log.info("commit 2");
		log.info("commit 3");
		log.info("commit 4");
		log.info("commit 5");
		return ResponseEntity.ok("Success!");
	}

	public ResponseEntity test2() {
		log.info("commit 6");
		log.info("commit 7");
		log.info("commit 8");
		log.info("commit 9");
		log.info("commit 10");
		return ResponseEntity.ok("Success!");
	}

	public ResponseEntity test3() {
		log.info("commit 11");
		log.info("commit 12");
		return ResponseEntity.ok("Success!");
	}

	public ResponseEntity test3() {
		log.info("commit 16");
		log.info("commit 17";
		log.info("commit 18");
		log.info("commit 19");
		return ResponseEntity.ok("Success!");
	}
}
