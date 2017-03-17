package cl.sysnet.web.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {

	@PostConstruct
	public void init() {
		log.info("Cargamos Controller !!! >>>>>>>>>>>>>>");
	}

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
