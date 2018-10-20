import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {

        System.out.println("Prosty kalkulator");
        Scanner odczyt = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe:");
        int pierwszaLiczba = odczyt.nextInt();
        System.out.print("Podaj druga liczbe:");
        int drugaLiczba = odczyt.nextInt();

        int suma = pierwszaLiczba + drugaLiczba;
        System.out.println("Dodawanie:" + suma);

        int roznica = pierwszaLiczba - drugaLiczba;
        System.out.println("Odejmowanie: " + roznica);

        int iloczyn = pierwszaLiczba * drugaLiczba;
        System.out.println("Mnozenie: " + iloczyn);

      // od razu wypisujemy mechanizm try - catch
        try {
            int iloraz = pierwszaLiczba / drugaLiczba;
            System.out.println("Dzielenie: " + iloraz);
        } catch (ArithmeticException e) {
            System.out.println("nie dzielimy przez 0");
        }


        int resztaDzielenia = pierwszaLiczba % drugaLiczba;
        System.out.println("Reszta:" + resztaDzielenia);
    }

}
