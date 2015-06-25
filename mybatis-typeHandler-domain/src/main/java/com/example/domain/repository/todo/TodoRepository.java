package com.example.domain.repository.todo;

import com.example.domain.model.Todo;

public interface TodoRepository {

    Todo findOne(String todoId);
}
