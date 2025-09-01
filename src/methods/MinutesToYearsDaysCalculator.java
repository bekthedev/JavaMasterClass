package methods;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {

        final int minPerHour = 60;
        final int hoursPerDay = 24;
        final int daysPerYear = 365;

        final int minutesPerDay = minPerHour * hoursPerDay;
        final int minutesPerYear= minutesPerDay * daysPerYear;

        long years = minutes / minutesPerYear;
        long days = (minutes / minutesPerDay) % daysPerYear;

        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }
}