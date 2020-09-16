package net.shadew.helloworld.hw50;

public class Main {
    public static void main(String[] args) {
        System.setOut(new WrappingPrintStream(System.out));
        System.out.println("The world sucks and I'm not gonna say hello to it!");
    }
}
