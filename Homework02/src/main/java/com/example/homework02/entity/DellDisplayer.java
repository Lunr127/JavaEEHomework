package com.example.homework02.entity;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class DellDisplayer extends Displayer {

    private static final DellDisplayer INSTANCE = new DellDisplayer();

    private DellDisplayer() {
        name = this.getClass().getSimpleName();
    }

    public static DellDisplayer getInstance() {
        return INSTANCE;
    }

    @Override
    public void output() {
        System.out.println("DellDisplayer is outputting...");
    }
}
