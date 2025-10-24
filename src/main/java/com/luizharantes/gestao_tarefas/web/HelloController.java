package com.luizharantes.gestao_tarefas.web;

import java.time.OffsetDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizharantes.gestao_tarefas.web.dto.HelloResponse;

@RestController
public class HelloController {

    @Value("${app.owner}")
    private String owner;

    @Value("${app.version}")
    private String version;

    @GetMapping("/hello")
    public HelloResponse hello() {
        return new HelloResponse(
            "API on!",
            owner,
            version,
            OffsetDateTime.now().toString()
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }
}
