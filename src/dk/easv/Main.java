package dk.easv;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = fetchName();
        LocalDate birthday = fetchBirthday();
        long age = ChronoUnit.YEARS.between(birthday, LocalDate.now());

        System.out.println("Hello " + name + "! I have found out that you are " + age + " years old!");
    }

    private static String fetchName() {
        System.out.print("Please enter your name: ");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        return name;
    }

    private static LocalDate fetchBirthday() {
        Scanner s = new Scanner(System.in);

        System.out.print("What year were you born? ");
        int year = s.nextInt();

        System.out.print("What month were you born? ");
        int month = s.nextInt();

        System.out.print("What day were you born? ");
        int day = s.nextInt();

        return LocalDate.of(year, month, day);
    }
}
