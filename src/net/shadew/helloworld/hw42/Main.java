package net.shadew.helloworld.hw42;

public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        for (long l = 4946144450195624L; l > 0; l >>= 5)
            out.append((char) ((l & 31 | 64) % 95 + 32));
        out.replace(0, 1, "H");
        System.out.print(out);
        System.out.println("!");
    }
}
