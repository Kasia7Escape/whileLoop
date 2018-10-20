
import java.util.Scanner;

public class BmiCalculator {

    public static final double GORNA_GRANICA_NIEDOWAGI = 18.50;
    public static final double DOLNA_GRANICA_NADWAGI = 24.90;

    public static void main(String[] args) {

        System.out.println("Oblicz BMI");
        Scanner odczyt = new Scanner(System.in);

        System.out.println("Podaj wage ciała w kg");
        float waga = odczyt.nextFloat();

        System.out.println("Podaj wzrost w metrach");
        float wzrost = odczyt.nextFloat();

        // wzrost*wzrost mozna zapisac: Math.pow(wzrost, 2)
        float wynikBmi = waga / (wzrost * wzrost);
        System.out.println("BMI wynosi:" + wynikBmi);

        if (wynikBmi < GORNA_GRANICA_NIEDOWAGI) {
            System.out.println("Przy wzroscie" + wzrost + "masz niedowage");
        } else if (wynikBmi > DOLNA_GRANICA_NADWAGI) {
            System.out.println("Masz nadwagę");
        } else {
            System.out.println("Waga prawidłowa");
        }


    }

}
