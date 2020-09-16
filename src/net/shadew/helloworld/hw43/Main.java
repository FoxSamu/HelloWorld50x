package net.shadew.helloworld.hw43;

import java.util.Random;

public class Main {
    private static final char[] HW = {'H', 'e', 'l', 'l', 'o', 'w', 'o', 'r', 'l', 'd'};
    public static void main(String[] args) {
        Random random = new Random(-6732303926L);
        for(int i=0;i<5;i++)
            System.out.print(HW[random.nextInt(10)]);
        System.out.print(" ");
        for(int i=0;i<5;i++)
            System.out.print(HW[random.nextInt(10)]);
        System.out.print("!");
        System.out.println();
    }
}
