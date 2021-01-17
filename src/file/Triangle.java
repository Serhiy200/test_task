package file;

public class Triangle {

    //find square of triangle
    public static double sq(int a, int b) {

        double s = (a * b) / 2;

        return (double) Math.round(s * 10) / 10;
    }

    //return random two sides of the triangle
    public static int[] lines() {

        int a = Rand.number(20);
        int b = Rand.number(20);

        return new int[]{a, b};
    }

    //find and return hypotenuse of the triangle
    public static double hypoten(int a, int b) {
        double c;
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return (double) Math.round(c * 10) / 10;
    }

}
