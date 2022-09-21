package com.example.homework02.entity;

import lombok.Data;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component
@Data
public class LenovoComputer extends Computer {

    private static final LenovoComputer INSTANCE;

    static {
        try {
            System.out.println("computer create by single instance...");
            INSTANCE = new LenovoComputer();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private LenovoComputer() throws Exception {
        setComputerName(this.getClass().getSimpleName());
        System.out.println("this computer is " + this.getComputerName() + "...");

        DellDisplayerFactoryBean dellDisplayerFactoryBean = new DellDisplayerFactoryBean();
        DellDisplayer dellDisplayer = dellDisplayerFactoryBean.getObject();
        setDisplayer(dellDisplayer);
        System.out.println("its displayer is " + this.getDisplayer().getName() + "...");
        getDisplayer().output();

        PrinterFactory printerFactory = new PrinterFactory();
        setPrinter(printerFactory.getPrinter("HPPrinter"));
        System.out.println("its printer is " + this.getPrinter().getName() + "...");
        getPrinter().output();
    }

    public static LenovoComputer getInstance() {
        return INSTANCE;
    }


}
