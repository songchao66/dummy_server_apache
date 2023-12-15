package com.example.dummy_server_apache;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResController {
	@GetMapping("/test")
	public Res greeting(@RequestParam(value = "code", defaultValue = "001") String code, @RequestParam(value = "systemCode", defaultValue = "system001") String systemCode) {
		File[] files = new File[2];

		files[0] = new File("001", "1", "test1", 210, "001", "tokyo", "123", LocalDate.now());
		files[1] = new File("002", "2", "test2", 220, "001", "tokyo", "456", LocalDate.now());

		return new Res(code, systemCode, new Result(0, systemCode, 10, files));
	}
}
