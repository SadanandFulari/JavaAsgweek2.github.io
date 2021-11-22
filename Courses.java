import java.util.Scanner;

public class Courses {

    public static void myCourses(int year, String course) {

        String FE = "English, Maths, Science";
        String SECSE = "Operating System, Java , Data Structures";
        String SEECE = "Microprocessor, Logic Switching theory";
        String SEMECH = "Drawing , Manufacturing Machines";
        String TECSE = "Computer Organization, Multimedia";
        String TEECE = "Fundamentals of Logic Design, Microelectronics";
        String TEMECH = "Internal Combution engines, Mechanical Vibration";
        String BECSE = "Data Communication and Networks, Multimedia";
        String BEECE = "Embedded System, Image Processing";
        String BEMECH = "Production Technology, Thermal Enggineering";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        year = sc.nextInt();
        System.out.println("Enter the course");
        course = sc.next();

        if ((year == 1) && (course == FE)) {
            System.out.println(FE);
        } else if (year == 2 && course == SECSE) {
            System.out.println(SECSE);
        } else if (year == 2 && course == SEECE) {
            System.out.println(SEECE);
        } else if (year == 2 && course == SEMECH) {
            System.out.println(SEMECH);
        } else if (year == 3 && course == TECSE) {
            System.out.println(TECSE);
        } else if (year == 3 && course == TEECE) {
            System.out.println(TEECE);
        } else if (year == 3 && course == TEMECH) {
            System.out.println(TEMECH);
        } else if (year == 4 && course == BECSE) {
            System.out.println(BECSE);
        } else if (year == 4 && course == BEECE) {
            System.out.println(BEECE);
        } else if (year == 4 && course == BEMECH) {
            System.out.println(BEMECH);
        } else {
            System.out.println("Invalid input");
        }

    }

    public static void main(String[] args) {
        myCourses(1, "s");
    }

}
