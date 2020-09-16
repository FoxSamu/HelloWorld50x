package net.shadew.helloworld.hw14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(Hel{2}o) .+ (wo[rld]{3})!$");
        Matcher matcher = pattern.matcher("Hello (not so) beautiful world!");
        if(matcher.matches()) {
            System.out.printf("%s %s!", matcher.group(1), matcher.group(2));
            System.out.println();
        } else {
            // Fallback, for when java patterns break
            System.out.println("Hello world!");
        }
    }
}
