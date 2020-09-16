package net.shadew.helloworld.hw29;

import java.io.PrintStream;

public class WorldPrintable implements Printable {
    @Override
    public void print(PrintStream stream) {
        stream.print("world");
    }

    @Override
    public void println(PrintStream stream) {
        stream.println("world");
    }
}
