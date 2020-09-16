package net.shadew.helloworld.hw36;

public class Main {
    private static final int[] HELLO = {
        8, 5, 12, 12, 15
    };

    private static final int[] WORLD = {
        23, 15, 18, 12, 4
    };

    public static void main(String[] args) {
        print(HELLO, true);
        System.out.print(" ");
        print(WORLD, false);
        System.out.println("!");
    }

    private static void print(int[] alphabetical, boolean capital) {
        int x = 0;
        for(int i : alphabetical) {
            System.out.print((char)((capital && x == 0 ? 'A' : 'a') - 1 + i));
            x ++;
        }
    }
}
