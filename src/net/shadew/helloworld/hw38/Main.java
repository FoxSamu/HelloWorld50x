package net.shadew.helloworld.hw38;

public class Main {
    public static void main(String[] args) {
        String[] words = {
            "Has", "every", "little", "liar", "once", " eaten", "watery", "original", "random", "lemons", "days", "!ago"
        };
        for(String str :words) {
            System.out.print(str.charAt(0));
        }
        System.out.println();
    }
}
