package net.shadew.helloworld.hw12;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.setChatOut(System.out);

        World world = new World();
        greeter.sayHello(world);
    }
}
