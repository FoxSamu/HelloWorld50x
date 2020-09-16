package net.shadew.helloworld.hw9;

public class Main {
    public static void main(String[] args) throws HelloWorldException {
        Thread.currentThread()
              .setUncaughtExceptionHandler((t, e) -> e.printStackTrace(System.out));
        throw new HelloWorldException();
    }
}
