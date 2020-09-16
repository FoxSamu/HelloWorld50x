package net.shadew.helloworld.hw29;

public class Main {
    public static void main(String[] args) {
        HelloPrintable hello = new HelloPrintable();
        WorldPrintable world = new WorldPrintable();
        CompoundPrintable hello_ = new CompoundPrintable(hello, new SpacePrintable());
        CompoundPrintable helloworld = new CompoundPrintable(hello_, world, new ExclamationMarkPrintable());
        helloworld.println(System.out);
    }
}
