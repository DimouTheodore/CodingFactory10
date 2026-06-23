package gr.aueb.cf.ch2;

import java.util.Scanner;


public class HoursToMinutesAndSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hours = 0;
        int min = 0;
        int sec= 0;

        System.out.println("insert hours");
        hours = scanner.nextInt();
        min = hours*60;
        sec = hours*3600;
        System.out.printf("%d hours equal to %d minutes or %d seconds ", hours, min, sec);
    }
}
