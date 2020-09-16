package net.shadew.helloworld.hw44;

import java.util.Random;

public class Main {
    public static void main(String ... args) {
        System.out.println(uppercase(randomString(-229985452))+' '+randomString(-147909649)+'!');
    }

    public static String randomString(int seed) {
        Random rand = new Random(seed);
        StringBuilder sb = new StringBuilder();
        for(int i=0;;i++) {
            int n = rand.nextInt(27);
            if (n == 0) break;
            sb.append((char) ('`' + n));
        }
        return sb.toString();
    }
    private static String uppercase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
