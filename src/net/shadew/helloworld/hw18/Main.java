package net.shadew.helloworld.hw18;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        System.out.println(new String(Base64.getDecoder().decode("SGVsbG8gd29ybGQh")));
    }
}
