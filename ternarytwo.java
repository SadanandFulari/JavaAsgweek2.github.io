import java.util.Scanner;

public class ternarytwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt(), max;

        max = (n1 > n2) ? n1 : n2;

        System.out.println("Largest number between " + n1 + " and " + n2 + " is " + max + ". ");
    }
}
