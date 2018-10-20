package przestrzen;

import java.util.Scanner;

public class ProgramPoint {
    public static void main(String[] args) {
        System.out.println("podaj współrzędną x");

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println("podaj współrzedną y");
        double y = scanner.nextDouble();

        Point p = new Point(x, y);
        System.out.println("Odległosć od początku układu współrzędnych wynosi " + p.distanceFromOrigin());
    }
}
