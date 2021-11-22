import java.util.Scanner;

public class Max {

    public static int myMethod(int a) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        return a;
    }

    public static int myMethod1(int b) {

        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        return b;
    }

    public static int myMethod2(int c) {

        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        return c;
    }

    public static void max() {
        int a = myMethod(1);
        int b = myMethod1(1);
        int c = myMethod2(1);

        if (a > b && a > c) {
            System.out.println("First number is maximum");
        } else if (b > a && b > c) {
            System.out.println("Second number is maximum");
        } else {
            System.out.println("Third number is maximum");
        }

    }

    public static void main(String[] args) {
        max();
    }

}
