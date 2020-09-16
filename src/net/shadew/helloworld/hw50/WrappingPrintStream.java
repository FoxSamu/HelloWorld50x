package net.shadew.helloworld.hw50;

import java.io.*;

public class WrappingPrintStream extends PrintStream {
    private final PrintStream stream;
    public WrappingPrintStream(PrintStream out) {
        super(out);
        stream = out;
    }

    @Override
    public void println(String x) {
        stream.println("Hello world!");
    }
}
