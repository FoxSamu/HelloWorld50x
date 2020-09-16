package net.shadew.helloworld.hw39;

public class Main {
    public static void main(String[] args) {
        String hw = "Hello world!";
        int i = 0;
        while(true) {
            System.out.print(hw.charAt(i));
            i ++;
            if(i >= hw.length()) {
                System.out.println();
                return;
            }
        }
    }
}
