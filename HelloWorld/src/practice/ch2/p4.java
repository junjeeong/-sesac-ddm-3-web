package practice.ch2;

public class p4 {
    public static void main(String[] args) {
        double d = 3.14;
        int i = 300;
        char c = 'A';
        int i2 = 65;

        System.out.printf("%f -> %d (소수점 손실)\n", d, (int)d);
        System.out.printf("%d -> %d (바이트 손실)\n", i, (byte)i);
        System.out.printf("%c -> %d (ASCII 코드)\n", c, (int)c);
        System.out.printf("%d -> %c (ASCII 문자)\n ", i2, (char)i2);

    }
}
