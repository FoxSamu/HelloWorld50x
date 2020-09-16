package net.shadew.helloworld.hw33;

public class Main {
    public static void main(String[] args) {
        sequence("H");
        System.out.println();
    }
    private static void sequence(String str) {
        System.out.print(str);
        switch (str) {
            case "H": sequence("e");
                break;
            case "e": sequence("ll");
                break;
            case "ll": sequence("o ");
                break;
            case "o ": sequence("w");
                break;
            case "w": sequence("o");
                break;
            case "o": sequence("rl");
                break;
            case "rl": sequence("d");
                break;
            case "d": sequence("!");
                break;
        }
    }
}
