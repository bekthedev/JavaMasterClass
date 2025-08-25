package methods;

public class TeenNumberChecker {
    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

    }

    public static boolean hasTeen(int x, int y, int z) {

        return (x >= 13 && x <= 19) ||
                (y >= 13 && y <= 19) ||
                (z >= 13 && z <= 19);

    }
}