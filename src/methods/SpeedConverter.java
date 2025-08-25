package methods;

public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(75.114);
        printConversion(25.42);
        printConversion(-5.6);
        printConversion(10.25);
        printConversion(1.5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");

    }




}

//1 mile per hour is 1.609 kilometers per hour
//calculate the value of miles per hour, round it and return it.