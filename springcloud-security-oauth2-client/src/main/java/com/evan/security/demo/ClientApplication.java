package com.evan.security.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by Evan on 2017-07-08.
 */

@EnableAutoConfiguration
@Configuration
@EnableOAuth2Sso
@RestController
public class ClientApplication {

    @RequestMapping("/client")
    public String home(Principal user) {
        return "Hello " + user.getName();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(ClientApplication.class).run(args);
    }

}
