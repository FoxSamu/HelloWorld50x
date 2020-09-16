package net.shadew.helloworld.hw8;

public class Main {
    public static void main(String[] args) {
        try {
            throw new HelloWorldException();
        } catch (HelloWorldException e) {
            e.printStackTrace(System.out);
        }
    }
}
