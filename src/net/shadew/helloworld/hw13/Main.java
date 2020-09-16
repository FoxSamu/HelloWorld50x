package net.shadew.helloworld.hw13;

import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    private static final AtomicBoolean HELLO_PRINTED_FLAG = new AtomicBoolean(false);
    public static void main(String[] args) {
        Thread helloThread = new Thread(() -> {
            System.out.print("Hello");
            HELLO_PRINTED_FLAG.set(true);
        });
        Thread worldThread = new Thread(() -> {
            while(!HELLO_PRINTED_FLAG.get()) {
            }
            System.out.println(" world!");
        });

        worldThread.start();
        helloThread.start();
    }
}
