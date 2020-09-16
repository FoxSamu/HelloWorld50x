package net.shadew.helloworld.hw7;

public class Main {
    public static final char[] HELLO_WORLD_CHARS = {
        'd', 'e', 'H', 'l', 'o', 'r', 'w', '!', ' ', '\n'
    };

    public static final int[] HELLO_WORLD_INDICES = {
        2, 1, 3, 3, 4, 8, 6, 4, 5, 3, 0, 7, 9
    };

    public static void main(String[] args) {
        for( int i : HELLO_WORLD_INDICES) {
            System.out.print(HELLO_WORLD_CHARS[i]);
        }
    }
}
