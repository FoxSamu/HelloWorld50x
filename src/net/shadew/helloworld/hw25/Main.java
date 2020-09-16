package net.shadew.helloworld.hw25;

public class Main {
    public static final char[] HELLO_WORLD_CHARS = {
        'd', 'e', 'H', 'l', 'o', 'r', 'w', '!', ' ', '\n'
    };

    public static final long MAGIC = 2656648909042450L;

    public static void main(String[] args) {
        long l = MAGIC;
        while(l > 0) {
            long i = l & 15;
            System.out.print(HELLO_WORLD_CHARS[(int) i]);
            l >>= 4;
        }
    }
}
