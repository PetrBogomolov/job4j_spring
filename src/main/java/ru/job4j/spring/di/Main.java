package ru.job4j.spring.di;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(ConsoleInput.class);
        context.reg(Store.class);
        context.reg(StartUI.class);
        StartUI ui = context.get(StartUI.class);
        String text = ui.enterText();
        ui.add(text);
        ui.print();
    }
}
