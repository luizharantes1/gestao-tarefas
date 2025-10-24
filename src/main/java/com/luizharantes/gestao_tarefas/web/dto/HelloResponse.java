package com.luizharantes.gestao_tarefas.web.dto; // 👈 TEM que ser exatamente este package

public record HelloResponse(
    String message,
    String owner,
    String version,
    String timestamp
) {}
