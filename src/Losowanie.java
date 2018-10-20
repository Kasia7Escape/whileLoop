import java.util.Random;
import java.util.Scanner;

public class Losowanie {
    public static void main(String[] args) {
        System.out.println("Wylosuje liczbe z zakresu 0-10. Sprobuj zgadnac,");

        Scanner odczyt = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Podaj swoją liczbę:");
        int pobranaLiczba = odczyt.nextInt();

        int wylosowanaLiczba = generator.nextInt( 11);
        System.out.println("Wylosowano liczbę:" + wylosowanaLiczba);

      /*  int pobranaLiczba = odczyt.nextInt();

        //pobieramy od użytkownika liczbe */
        if(wylosowanaLiczba == pobranaLiczba){
            System.out.println("Brawo! Wygrana!");
        } else {
           System.out.println("Nie zgadles. Sprobuj jeszcze raz.");
        }





    }
}
