package matematyka;

//tworzymy klasę testową z metodą main i nowym obiektem
//na którym sprawdzamy, czy działają metody z klasy Circle

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj długośc promienia:");
        double r = scanner.nextDouble();

        //można to zrobić lepiej  - ifem
       // try {
            Circle c = new Circle(r); //tworzymy nowy obiekt
       // } catch (IllegalArgumentException ex){
        //    System.out.println("nie da się stworzyc obiektu"); - gdy chcemy złapać wyjątek
       // }


        System.out.println("Pole koła o promieniu " + c.radius + " wynosi: " + c.calculateArea());
        System.out.println("Obwód koła o promieniu " + c.radius + " wynosi: " + c.calculateCircumference());

    }
}
