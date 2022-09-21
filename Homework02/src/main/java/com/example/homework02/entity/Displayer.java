package com.example.homework02.entity;

import com.example.homework02.entity.impl.Output;
import lombok.Data;

@Data
public class Displayer implements Output {
    String name;

    @Override
    public void output() {
        System.out.println("Displayer is outputting...");
    }
}
