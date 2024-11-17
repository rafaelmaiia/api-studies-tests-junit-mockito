package com.rafaelmaia.api_studies_tests_junit_mockito.config;

import com.rafaelmaia.api_studies_tests_junit_mockito.domain.User;
import com.rafaelmaia.api_studies_tests_junit_mockito.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void startDB() {
        User u1 = new User(null, "Rafael", "rafael@gmail.com", "123");
        User u2 = new User(null, "Luiz", "luiz@gmail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }
}
