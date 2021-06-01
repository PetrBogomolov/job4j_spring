package ru.job4j.spring.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
@Scope("prototype")
public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);

    public String askString(String text) {
        System.out.println(text);
        return scanner.nextLine();
    }

    public int askInt(String text) {
        return Integer.parseInt(askString(text));
    }
}
