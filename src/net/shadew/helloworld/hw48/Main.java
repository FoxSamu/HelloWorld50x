package net.shadew.helloworld.hw48;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {
    public static final int[] INDICES = {15, 37, 139, 148, 188, 191, 344, 360, 460, 843, 1167, 2564, 2566, -1};
    public static void main(String[] args) {
        try {
            Reader reader = new InputStreamReader(Main.class.getResourceAsStream("nee.txt"));
            int r;
            int i = 0;
            int g = 0;
            while ((r = reader.read()) != -1) {
                if(i == INDICES[g]) {
                    System.out.print((char) r);
                    g ++;
                }
                i ++;
            }
        } catch (IOException e) {
            // System.out.println("Hello world!");
        }
    }
}
