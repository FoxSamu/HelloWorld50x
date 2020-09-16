package net.shadew.helloworld.hw26;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int x = new Random().nextInt(10);
        int y = x * 3 + x * -3 + 2;
        if(y == 2) {
            System.out.println("Hello world!");
        }
    }
}
