package file;

import java.util.Random;

public class Rand {

    //return random number in range from 0 to n
    public static int number(int n) {
        Random rnd = new Random();

        return rnd.nextInt(n);
    }

    //return random array with random count of figure
    public String[] array() {
        String[] arr = new String[number(15)];
        int n = arr.length;//the length of the array
        while (n == 0) {
            arr = new String[number(15)];
            n = arr.length;
        }
        int countQuad = number(n / 2); // number of quadrates in the array
        int countCircle = number(n - countQuad);// number of circles in the array
        int countTriag = number(n - countQuad - countCircle);// number of triangles in the array
        int countTrapez = n - countCircle - countQuad - countTriag;// number of trapezes in the array

        int i = 0;

        while (i != n) {
            //add count quadrates in the array
            for (int j = i; j < countQuad; j++) {
                Quadrate quadrate = new Quadrate();
                int line = quadrate.line();
                arr[j] = "Площа квадрата: " + Integer.toString(quadrate.sq(line)) + " Сторона квадрата " + line + " Колір " + color();

            }
            //point for started next number figures
            i = countQuad;

            //add count circles in the array
            for (int j = i; j < countCircle + countQuad; j++) {
                Circle circle = new Circle();
                int radius = circle.radius();
                arr[j] = "Площа кола: " + Double.toString(circle.sq(radius)) + " Радіус кола " + radius + " Колір " + color();

            }
            i = i + countCircle;

            //add count triangles in the array
            for (int j = i; j < countTriag + countCircle + countQuad; j++) {
                Triangle triangle = new Triangle();
                int[] lines = triangle.lines();
                arr[j] = "Площа тркутника: " + Double.toString(triangle.sq(lines[0], lines[1])) + " довжина гіпотенузи " + triangle.hypoten(lines[0], lines[1]) + " Колір " + color();

            }
            i = i + countTriag;

            //add count trapezes in the array
            for (int j = i; j < countTrapez + countTriag + countCircle + countQuad; j++) {
                Trapeze trapeze = new Trapeze();
                int[] trap = trapeze.lines();
                arr[j] = "Площа трапеції: " + Double.toString(trapeze.sq(trap[0], trap[1], trap[2])) + " Бічна сторона прямокутної трапеції " + trapeze.side(trap[0], trap[1], trap[2]) + " Колір " + color();

            }
            i = i + countTrapez;

        }

        return arr;
    }

    //return random color
    public String color() {
        String[] col = {"Зелений", "Червоний", "Синій", "Жовтий", "Фіолетовий", "Оранжевий"};
        return col[number(col.length - 1)];
    }

}
