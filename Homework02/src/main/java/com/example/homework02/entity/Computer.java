package com.example.homework02.entity;

import lombok.Data;

@Data
public class Computer {
    private String computerName;
    private Displayer displayer;
    private Printer printer;
}
