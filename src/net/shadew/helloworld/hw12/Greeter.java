package net.shadew.helloworld.hw12;

import java.io.PrintStream;

public class Greeter {
    private PrintStream chatOut;

    public void sayHello(Greetable greetable) {
        if(chatOut != null) {
            chatOut.println("Hello " + greetable.getName() + "!");
        }
    }

    public void setChatOut(PrintStream chatOut) {
        this.chatOut = chatOut;
    }
}
