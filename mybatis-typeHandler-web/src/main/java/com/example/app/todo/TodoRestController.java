package com.example.app.todo;

import com.example.domain.model.Todo;
import com.example.domain.repository.sample.SampleRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RequestMapping("/todos")
@RestController
public class TodoRestController {

    @Inject
    SampleRepository repository;

    @RequestMapping("{todoId}")
    public Todo getTodo(@PathVariable("todoId") String todoId) {
        return repository.findOne(todoId);
    }

}
