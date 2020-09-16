package net.shadew.helloworld.hw37;

public class Main {
    public static void main(String[] args) {
        String str = "Haeslylyon swoolrelady!";
        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
