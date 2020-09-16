package net.shadew.helloworld.hw16;

public class Main {
    public static void main(String[] args) {
        String a = null;
        for (int i = 0; i < 100; i++) {
            if (i == 77) {
                System.out.println();
            }
            if (i == 17) {
                System.out.print("o");
                a = " wor";
            }
            if (i == 68) {
                System.out.print("ld!");
            }
            if (i == 34) {
                System.out.print(a);
            }
            if (i == 3) {
                System.out.print("Hell");
            }
        }
    }
}
