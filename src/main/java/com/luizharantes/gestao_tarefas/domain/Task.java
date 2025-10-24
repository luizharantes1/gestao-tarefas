package com.luizharantes.gestao_tarefas.domain;

import java.time.LocalDateTime;

public class Task {

    private Long id;
    private String title;
    private boolean done;
    private LocalDateTime createdAt;

    // Construtor
    public Task(Long id, String title) {
        this.id = id;
        this.title = title;
        this.done = false;
        this.createdAt = LocalDateTime.now();
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return done;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // Setters e ações
    public void setTitle(String title) {
        this.title = title;
    }

    public void markAsDone() {
        this.done = true;
    }
}
