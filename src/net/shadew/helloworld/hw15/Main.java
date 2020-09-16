package net.shadew.helloworld.hw15;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0) {
            args = new String[1];
        }

        args[0] = "Hello world!";

        System.out.println(args[0]);
    }
}
