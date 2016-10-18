package com.example.entity;

import com.example.IWorker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Getter
@AllArgsConstructor
public class Manager implements IWorker {

    private String name;
    private String position;
    private Integer id;

    @Override
    public Integer getId()
    {return id;
    }
}
