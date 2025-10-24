package com.luizharantes.gestao_tarefas.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.luizharantes.gestao_tarefas.domain.Task;

@Service
public class TaskService {

    // "Banco de dados" em memória
    private final Map<Long, Task> tasks = new HashMap<>();
    private Long nextId = 1L;

    // Lista todas as tarefas
    public List<Task> findAll() {
        return new ArrayList<>(tasks.values());
    }

    // Adiciona uma nova tarefa
    public Task add(String title) {
        Task task = new Task(nextId++, title);
        tasks.put(task.getId(), task);
        return task;
    }

    // Busca uma tarefa pelo ID
    public Optional<Task> findById(Long id) {
        return Optional.ofNullable(tasks.get(id));
    }

    // Marca tarefa como concluída
    public boolean markAsDone(Long id) {
        Task task = tasks.get(id);
        if (task != null) {
            task.markAsDone();
            return true;
        }
        return false;
    }

    // Exclui uma tarefa
    public boolean delete(Long id) {
        return tasks.remove(id) != null;
    }
}
