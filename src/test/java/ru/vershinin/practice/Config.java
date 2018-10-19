package ru.vershinin.practice;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import ru.vershinin.practice.controller.ConnectionController;
import ru.vershinin.practice.service.ConnectionQueue;


@TestConfiguration
public class Config {
    @Bean
    @Scope(value = "prototype")
    public ConnectionQueue connectionQueue() {
        return new ConnectionQueue();
    }

    @Bean
    @Scope(value = "prototype")
    public ConnectionController connectionController() {
        return new ConnectionController();
    }
}
