package net.shadew.helloworld.hw47;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(Main.class.getResourceAsStream("helloworld.bfck"));
        StringBuilder builder = new StringBuilder();
        while(scanner.hasNextLine()) builder.append(scanner.nextLine()).append("\n");
        BrainfuckInterpreter interpreter = new BrainfuckInterpreter(builder.toString(), 64);
        interpreter.run();
    }
}
