package practice.ch2;

public class p3 {
    public static void main(String[] args) {
        byte b = 10;
        int i = b;        // byte → int
        long l = i;       // int → long
        float f = l;      // long → float
        double d = f;

        System.out.printf("byte b = %d\n", b);
        System.out.printf("int i = %d\n", i);
        System.out.printf("long l = %d\n", l);
        System.out.printf("float f = %.1f\n", f);
        System.out.printf("double d = %.1f\n", d);
    }
}
