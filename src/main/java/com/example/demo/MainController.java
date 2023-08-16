package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/health")
	public ResponseEntity<?> health(){
		Map<String, Object> map = new HashMap<>();
		map.put("status", "ok");
		
		return ResponseEntity.ok(map);
	}
	
	@GetMapping({"", "/"})
	public ResponseEntity<?> index(){
		Map<String, Object> map = new HashMap<>();
		map.put("index", "hello world");
		
		return ResponseEntity.ok(map);
	}

}
