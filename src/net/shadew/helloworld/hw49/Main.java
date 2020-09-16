package net.shadew.helloworld.hw49;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.setIn(new ByteArrayInputStream("Hello world!".getBytes()));
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
