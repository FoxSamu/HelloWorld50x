package net.shadew.helloworld.hw30;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        OutputStream stream = new FilterOutputStream(System.out);

        try {
            stream.write('H');
            stream.write('e');
            stream.write('l');
            stream.write('l');
            stream.write('o');
            stream.write(' ');
            stream.write('w');
            stream.write('o');
            stream.write('r');
            stream.write('l');
            stream.write('d');
            stream.write('!');
            stream.write('\n');
            stream.close();
        } catch (IOException e) {
            System.out.println("Hello world!");
        }
    }
}
