package br.com.glauco.simplelogin;

import br.com.glauco.simplelogin.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleLoginApplication {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(SimpleLoginApplication.class, args);
    }

    @Bean
    InitializingBean createUser(){
        return () ->
            userService.findorCreate();
        }
}


