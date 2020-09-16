package net.shadew.helloworld.hw23;

public class Main {
    public static void main(String[] args) {
        binaryPrint("Hello world!");
        System.out.println("\n");
    }

    private static void binaryPrint(String string) {
        if(string.length() == 0) return; // Do not print if empty
        if(string.length() == 1) {
            // If we're only one char, print that char
            System.out.print(string.charAt(0));
        } else {
            // If we're more than one char, split up and binary-print both halfs
            int mid = string.length() >> 1;
            binaryPrint(string.substring(0, mid));
            binaryPrint(string.substring(mid));
        }
    }
}
