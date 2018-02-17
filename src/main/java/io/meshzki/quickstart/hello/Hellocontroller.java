package io.meshzki.quickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
	
@RequestMapping("/hello")
	public String sayhii() {
		return"Hello This is Spring Boot";
	}
}
