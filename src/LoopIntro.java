import java.util.Scanner;

// program wypisuje wszystkie liczby nieparzyste dodatnie mniejsze od podanej liczby

public class LoopIntro {
    public static void main(String[] args) {

        System.out.println("Prosty kalkulator");
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int zadanaLiczba = odczyt.nextInt();

        int licznik = 1;

        while (licznik < zadanaLiczba) {
            if(licznik % 2 == 1) {
                System.out.println(licznik);
            }
            licznik++;
        }
    }
}

