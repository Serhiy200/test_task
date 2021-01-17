package file;

public class Trapeze {

    //find square of the trapeze
    public static double sq(int a, int b, int h) {

        double s = ((a + b) / 2) * h;

        return (double) Math.round(s * 10) / 10;
    }

    //return tree random sides of the trapeze
    public static int[] lines() {

        int a = Rand.number(20);
        int b = Rand.number(20);
        int h = Rand.number(20);

        return new int[]{a, b, h};
    }

    //find fourth side of the trapeze
    public static double side(int a, int b, int h) {
        int d = Math.abs(a - b);
        double side = Math.sqrt(Math.pow(d, 2) + Math.pow(h, 2));

        return (double) Math.round(side * 10) / 10;
    }

}
