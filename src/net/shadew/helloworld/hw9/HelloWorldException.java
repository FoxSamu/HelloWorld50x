package net.shadew.helloworld.hw9;

import java.io.PrintStream;

public class HelloWorldException extends Exception {
    @Override
    public void printStackTrace(PrintStream s) {
        s.println("Hello world!");
    }
}
