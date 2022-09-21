package com.example.homework02.entity;

import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class PrinterFactory extends AbstractFactoryBean {
    public Printer getPrinter(String printerName){
        System.out.println("PrinterFactory create printer...");
        if (printerName.equals("HPPrinter")){
            return new HPPrinter();
        }
        else if (printerName.equals("EpsonPrinter")){
            return new EpsonPrinter();
        }
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return Printer.class;
    }

    @Override
    protected Printer createInstance() throws Exception {
        return new Printer();
    }
}
