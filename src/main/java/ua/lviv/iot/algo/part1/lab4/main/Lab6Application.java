package ua.lviv.iot.algo.part1.lab4.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"ua.lviv.iot.algo.part1.lab4.controller",
        "ua.lviv.iot.algo.part1.lab4.service",
        "ua.lviv.iot.algo.part1.lab4.repository"})
public class Lab6Application {
    public static void main(String[] args) {
        SpringApplication.run(Lab6Application.class, args);
    }

}
