package methods.overloading;

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Seconds cannot be negative!";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }
    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Minutes cannot be negative!";
        }

        if (seconds < 0 || seconds > 59) {
            return "Invalid seconds, must be between 0 and 59 inclusive!";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        return hours + "h " + minutes + "m " + seconds + "s";
    }
}