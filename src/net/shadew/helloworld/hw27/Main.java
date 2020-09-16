package net.shadew.helloworld.hw27;

public class Main {
    @SuppressWarnings("ConstantConditions")
    public static void main(String[] args) {
        String words = "Hello, this is a message for the whole world!";
        int hi = words.indexOf("Hello");
        int wi = words.indexOf("world");
        int space = words.indexOf(' ');
        int excl = words.indexOf('!');
        System.out.println(words.substring(hi, hi+5) + words.charAt(space) + words.substring(wi, wi+5) + words.charAt(excl));
    }
}
