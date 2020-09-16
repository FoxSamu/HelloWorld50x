# Hello world, 50 times

This repository contains 50 different ways to print `Hello world!`, followed by a newline, in Java. Possibilities
go from just a `System.out.println` call to running complete brainfuck scripts or even looking up specific chars in
a part the script of Monty Python and the Holy Grail, or even filling such seeds into `java.util.Random` that it makes
the words of 'Hello world!'.

## Previews

`hw13`:
```java
public class Main {
    private static final AtomicBoolean HELLO_PRINTED_FLAG = new AtomicBoolean(false);
    public static void main(String[] args) {
        Thread helloThread = new Thread(() -> {
            System.out.print("Hello");
            HELLO_PRINTED_FLAG.set(true);
        });
        Thread worldThread = new Thread(() -> {
            while(!HELLO_PRINTED_FLAG.get()) {
            }
            System.out.println(" world!");
        });

        worldThread.start();
        helloThread.start();
    }
}
```

`hw40` (yes it works):
```java
public class Main { public static void main(String...args){\u0066or(int
\u0020$:"r¬ººÀ\"ÐÀÆºª$".to\u0043h\u0061rArray()
)System./*goto/*$/%\u0126//^\u002A\u002Fout.print((char)(($>>
+(~'"'&'#'))+('<'>>('\\'/'.')/\u002Array.const(~1)\*\u002F)));
System.out.println();}}
```

`hw44`:
```java
public class Main {
    public static void main(String ... args) {
        System.out.println(uppercase(randomString(-229985452))+' '+randomString(-147909649)+'!');
    }

    public static String randomString(int seed) {
        Random rand = new Random(seed);
        StringBuilder sb = new StringBuilder();
        for(int i=0;;i++) {
            int n = rand.nextInt(27);
            if (n == 0) break;
            sb.append((char) ('`' + n));
        }
        return sb.toString();
    }
    private static String uppercase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
```

`hw24`:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("!dlrow olleH"));
    }

    private static String reverse(String str) {
        if (str.length() == 0 || str.length() == 1) return str;
        int mid = str.length()/2;
        return reverse(str.substring(mid)) + reverse(str.substring(0, mid));
    }
}
```

Find out many other possibilities by looking through the code in this repository.
