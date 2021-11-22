import java.util.Scanner;

public class Multi {
    public static int myMethod(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer number");
        a = sc.nextInt();
        System.out.println("Enter second integer number");
        b = sc.nextInt();
        int c = a * b;
        System.out.println(a + "*" + b + "=" + c);
        return c;
    }

    public static float myMethod1(float d, float e) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first float value");
        d = sc.nextFloat();
        System.out.println("Enter second float value");
        e = sc.nextFloat();
        float f = d * e;
        System.out.println(d + "*" + e + "=" + f);
        return f;
    }

    public static long myMethod2(long g, long h) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first long value");
        g = sc.nextLong();
        System.out.println("Enter second long value");
        h = sc.nextLong();
        long i = g * h;
        System.out.println(g + "*" + h + "=" + i);
        return i;
    }

    public static void main(String[] args) {
        myMethod(1, 1);
        myMethod1(0, 0);
        myMethod2(0, 0);
    }

}
