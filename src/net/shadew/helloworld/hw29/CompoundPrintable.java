package net.shadew.helloworld.hw29;

import java.io.PrintStream;

public class CompoundPrintable implements Printable {
    private final Printable[] parts;

    public CompoundPrintable(Printable... parts) {
        this.parts = parts;
    }

    @Override
    public void print(PrintStream stream) {
        for(Printable part : parts) {
            part.print(stream);
        }
    }

    @Override
    public void println(PrintStream stream) {
        print(stream);
        stream.println();
    }
}
