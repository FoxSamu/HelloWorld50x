package net.shadew.helloworld.hw24;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("!dlrow olleH"));
    }

    private static String reverse(String str) {
        if (str.length() == 0 || str.length() == 1) return str;
        int mid = str.length()/2;
        return reverse(str.substring(mid)) + reverse(str.substring(0, mid));
    }
}
