package net.shadew.helloworld.hw34;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("java.lang.System");
            Field out = cls.getField("out");
            Object sysout = out.get(null);
            Class<?> printer = Class.forName("java.io.PrintStream");
            Method println = printer.getMethod("println", String.class);
            println.invoke(sysout, "Hello world!");
        } catch (Exception e) {
            System.out.println("Hello world!");
        }
    }
}
