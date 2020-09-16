package net.shadew.helloworld.hw29;

import java.io.PrintStream;

public class SpacePrintable implements Printable {
    @Override
    public void print(PrintStream stream) {
        stream.print(" ");
    }

    @Override
    public void println(PrintStream stream) {
        stream.println(" ");
    }
}
