package file;

public class Circle {

    //find and return square of circle
    public static double sq(int r) {
        double sq = 2 * r * Math.PI;
        return (double) Math.round(sq * 10) / 10;

    }

    //return random radius of circle
    public static int radius() {
        int r = Rand.number(20);
        return r;
    }
}
