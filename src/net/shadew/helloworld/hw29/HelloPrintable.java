package net.shadew.helloworld.hw29;

import java.io.PrintStream;

public class HelloPrintable implements Printable {
    @Override
    public void print(PrintStream stream) {
        stream.print("Hello");
    }

    @Override
    public void println(PrintStream stream) {
        stream.println("Hello");
    }
}
