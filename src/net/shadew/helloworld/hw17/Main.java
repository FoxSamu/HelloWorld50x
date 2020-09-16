package net.shadew.helloworld.hw17;

public class Main {
    public static final D D = new D();

    public static void main(String[] args) {
        L l = new L();
        Letter[] letters = {
            new H(), new E(), l, l, new O(), new Space(), createW(), new O(), new R(), l, D, ExclamationMark.INSTANCE
        };

        for(Letter letter : letters) {
            System.out.print(letter.getChar());
        }
        System.out.println();
    }

    /**
     * Creates a letter w: an instance of {@link W}. Using this method is equivalent to using {@code new W()}.
     * @return The created {@link W}.
     */
    private static W createW() {
        return new W();
    }
}
