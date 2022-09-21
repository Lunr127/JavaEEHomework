package com.example.homework02.entity;

import com.example.homework02.entity.impl.Output;
import lombok.Data;

@Data
public class Printer implements Output {
    private String name;

    @Override
    public void output() {
        System.out.println("Printer is outputting...");
    }
}
