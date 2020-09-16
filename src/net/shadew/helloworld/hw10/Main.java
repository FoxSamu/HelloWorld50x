package net.shadew.helloworld.hw10;

public class Main {
    public static void main(String[] args) {
        System.setErr(System.out);
        try {
            throwHelloWorldException();
        } catch (HelloWorldException e) {
            e.printStackTrace();
        }
    }

    private static void throwHelloWorldException() throws HelloWorldException {
        throw new HelloWorldException();
    }
}
