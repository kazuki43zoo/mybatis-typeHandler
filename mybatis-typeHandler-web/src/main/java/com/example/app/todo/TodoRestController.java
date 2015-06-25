package com.example.app.todo;

import com.example.domain.model.Todo;
import com.example.domain.repository.sample.SampleRepository;
import com.example.domain.repository.todo.TodoRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RequestMapping("/todos")
@RestController
public class TodoRestController {

    @Inject
    SampleRepository sampleRepository;

    @Inject
    TodoRepository todoRepository;

    @RequestMapping("{todoId}")
    public Todo getTodo(@PathVariable("todoId") String todoId) {
        sampleRepository.findOne(todoId);
        return todoRepository.findOne(todoId);
    }

}
