package net.shadew.helloworld.hw22;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        PrintStream wrapper = new PrintStream(System.out);
        wrapper.println("Hello world!");
    }
}
