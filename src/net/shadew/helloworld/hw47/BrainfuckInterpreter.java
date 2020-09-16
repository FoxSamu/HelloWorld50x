package net.shadew.helloworld.hw47;

import java.io.IOException;

public class BrainfuckInterpreter {
    private final String code;
    private int programPointer;
    private int dataPointer;
    private final byte[] tape;

    public BrainfuckInterpreter(String code, int tapeLength) {
        this.code = code;
        this.tape = new byte[tapeLength];
    }

    public void run() {
        while(programPointer < code.length()) {
            char c = code.charAt(programPointer);
            if(c == '>') {
                dataPointer ++;
            }
            if(c == '<'){
                dataPointer --;
            }
            if(c == '+') {
                tape[dataPointer] ++;
            }
            if(c == '-') {
                tape[dataPointer] --;
            }
            if(c == '.') {
                System.out.write(tape[dataPointer] & 0xff);
            }
            if(c == ',') {
                try {
                    tape[dataPointer] = (byte) System.in.read();
                } catch (IOException ignored) {
                }
            }
            if(c == '[') {
                if(tape[dataPointer] == 0) {
                    int stack = 0;
                    programPointer ++;
                    while (true) {
                        char d = code.charAt(programPointer);
                        if(d == '[') stack ++;
                        if(d == ']') {
                            stack --;
                            if(stack < 0) break;
                        }
                        programPointer ++;
                    }
                }
            }
            if(c == ']') {
                if(tape[dataPointer] != 0) {
                    int stack = 0;
                    programPointer --;
                    while (true) {
                        char d = code.charAt(programPointer);
                        if(d == ']') stack ++;
                        if(d == '[') {
                            stack --;
                            if(stack < 0) break;
                        }
                        programPointer --;
                    }
                }
            }
            programPointer ++;
        }
    }
}
