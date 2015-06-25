package com.example.domain.repository.sample;

import com.example.domain.model.Todo;

public interface SampleRepository {

    Todo findOne(String todoId);
}
