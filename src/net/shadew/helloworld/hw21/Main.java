package net.shadew.helloworld.hw21;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Base64;
import java.util.stream.BaseStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Main {
    public static void main(String[] args) {
        try {
            byte[] gzipped = Base64.getDecoder().decode("H4sIAAAAAAAAAPNIzcnJVyjPL8pJUeTlAgC2SP98DgAAAA==");
            ByteArrayInputStream bais = new ByteArrayInputStream(gzipped);
            GZIPInputStream gzip = new GZIPInputStream(bais);
            byte[] out = new byte[13];
            int r = 0;
            while (r < 13) {
                int g = gzip.read(out, r, 13 - r);
                if (g == -1) break;
                else r += g;
            }
            System.out.println(new String(out));
        } catch (IOException e) {
            // Fallback when GZIP or Base64 is broken
            System.out.println("Hello world!");
        }
    }
}
