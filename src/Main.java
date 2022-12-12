import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main1(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your birth year: ");
        int birthYear = Integer.parseInt(sc.nextLine());
        while (birthYear < 0) {
            System.out.println("Invalid birth year, please enter again:");
            birthYear = Integer.parseInt(sc.nextLine());
        }

        int age = LocalDate.now().getYear() - birthYear;
        System.out.println(String.format("Hi %s, you are %d years old now!", name, age));

    }

}