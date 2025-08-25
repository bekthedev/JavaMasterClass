package methods;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));    // false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));        // true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));   // false
    }

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        int a = (int)(x * 1000);
        int b = (int)(y * 1000);

        return a == b;
    }
}