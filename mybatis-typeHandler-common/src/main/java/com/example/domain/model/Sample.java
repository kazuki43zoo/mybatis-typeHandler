package com.example.domain.model;

import lombok.Data;
import org.joda.time.DateTime;

@Data
public class Sample {
    private String todoId;
    private String todoTitle;
    private boolean finished;
    private DateTime createdAt;
}
