package cl.sysnet.web.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {
	
	@Value("${file.path}")
	private Resource resource;

	@RequestMapping("/")
	public String index() {
		log.info("Leemos el archivo");
		try {
            resource.getFile();
            log.info("Found the resource " + resource.getFilename());
        } catch (IOException ex) {
        	log.error(ex.toString());
        }
		
		return "Greetings from Spring Boot!";
	}

}
