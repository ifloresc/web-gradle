package cl.sysnet.web.controller;

import java.io.File;
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
            File file = resource.getFile();
            log.info("Filename : {}" , resource.getFilename());
            log.info("exists : {}" , file.exists());
            
            log.info("Content : {} ", resource.getInputStream().toString());
        } catch (IOException ex) {
        	log.error(ex.toString());
        }
		
		return "Greetings from Spring Boot!";
	}

}
