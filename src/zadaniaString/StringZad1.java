package zadaniaString;

import java.util.Scanner;

public class StringZad1 {
    public static void main(String[] args) {
        String wyraz;

        System.out.println("Podaj dowolny wyraz:");
        Scanner scanner = new Scanner(System.in);
        wyraz = scanner.nextLine();

        int ileLiter = wyraz.length();
        int ileRazyWystepuje = 0;
        char ostatniaLitera = wyraz.charAt(ileLiter - 1);
        System.out.println(ostatniaLitera);

        for (int i = 0; i < ileLiter; i++) {
            if (wyraz.charAt(i) == ostatniaLitera) {
                ileRazyWystepuje++;

            }

        }
        System.out.println(ileRazyWystepuje);
    }
}