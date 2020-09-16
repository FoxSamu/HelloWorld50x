package net.shadew.helloworld.hw32;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(Main.class.getResourceAsStream("helloworld.txt"));
        int r;
        StringBuilder out = new StringBuilder();
        try {
            while ((r = reader.read()) != -1) {
                out.append((char) r);
            }
            System.out.print(out);
        } catch (IOException e) {
            System.out.println("Hello world!");
        }
    }
}
