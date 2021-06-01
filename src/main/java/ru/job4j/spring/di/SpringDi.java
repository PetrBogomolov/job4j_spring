package ru.job4j.spring.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDi {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.spring.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add(ui.enterText());
        ui.add(ui.enterText());
        ui.print();
    }
}
