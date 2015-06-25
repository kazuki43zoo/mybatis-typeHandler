package com.example.domain.repository.sample;

import com.example.domain.model.Sample;

public interface SampleRepository {

    Sample findOne(String todoId);
}
