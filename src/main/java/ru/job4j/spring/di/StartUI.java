package ru.job4j.spring.di;

public class StartUI {

    private Store store;
    private ConsoleInput input;

    public StartUI(Store store, ConsoleInput input) {
        this.store = store;
        this.input = input;
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }

    public String enterText() {
      return input.askString("Enter text: ");
    }

    public int enterNumber() {
       return input.askInt("Enter number: ");
    }
}