import java.util.Scanner;

class Scores {

    public static int myScores(int a) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a >= 90 && a < 100) {
            System.out.println("A grade");
        } else if (a >= 80 && a < 90) {
            System.out.println("B grade");
        } else if (a >= 70 && a < 80) {
            System.out.println("C grade");
        } else if (a >= 60 && a < 70) {
            System.out.println("D grade");
        } else if (a >= 50 && a < 60) {
            System.out.println("E grade");
        } else if (a < 50) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid input");
        }
        return a;
    }

    public static void main(String[] args) {
        myScores(1);
    }
}