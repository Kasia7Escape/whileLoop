
import java.util.Scanner;

public class FahrenheitCalculator {
    public static void main(String[] args) {
        System.out.println(" Przelicznik stopni Celsjusza na Fahrenheita");
        Scanner odczyt = new Scanner(System.in);

        System.out.println("Podaj temperature w stopniach Celsjusza:");
        int stopnieCelsjusza = odczyt.nextInt();

        double Fahrenheit = 1.8 * stopnieCelsjusza + 32;
        System.out.println("Temperatura w stopniach Fahrenheita:" + Fahrenheit);

    }
}
