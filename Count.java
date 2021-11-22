import java.util.Scanner;

class Count {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        for (; num != 0; num /= 10, ++count) {
        }

        System.out.println("Number of digits: " + count);
    }
}
