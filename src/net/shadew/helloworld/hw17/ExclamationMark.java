package net.shadew.helloworld.hw17;

public enum ExclamationMark implements Letter {
    INSTANCE;

    @Override
    public char getChar() {
        return '!';
    }
}
