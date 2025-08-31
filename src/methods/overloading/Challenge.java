package methods.overloading;

public class Challenge {
    public static void main(String[] args) {

        System.out.println("68 in = " + convertToCentimeters(68) + " cm");
        System.out.println("5 ft, 8 in = " + convertToCentimeters(5, 8) + " cm");
    }

    public static double convertToCentimeters(int inches) {
//    height in centimeters
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
    return ((feet * 12) + inches) * 2.54;
    }
}