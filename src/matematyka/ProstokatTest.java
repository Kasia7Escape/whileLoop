package matematyka;

//metoda main w klasie PT i nowy obiekt Prostokat
//na którym testujemy metody z klasy Prostokąt
import java.util.Scanner;

public class ProstokatTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość pierwszego boku:");
        double a = scanner.nextDouble();
        System.out.println("Podaj długość drugiego boku:");
        double b = scanner.nextDouble();

        Prostokat pr = new Prostokat(a, b);
        System.out.println("Pole prostokąta wynosi " + pr.obliczPole() );
        System.out.println("Obwód prostokąta wynosi " + pr.obliczObwod());

    }
}
