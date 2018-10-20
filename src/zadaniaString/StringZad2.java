package zadaniaString;

import java.util.Scanner;

public class StringZad2 {

    public static String revertString(String textToRevert) {
        StringBuilder builder = new StringBuilder();
        for (int i = textToRevert.length() - 1; i >= 0; i--) {
            builder.append(textToRevert.charAt(i));  //buduje w pamięci wynikowy zapis
            //    System.out.println(textToRevert.charAt(i));
        }
        return builder.toString();  //metoda toString zwraca obiekt typu string - jak skończymy prace na builderze
    }

    public static void main(String[] args) {

        System.out.println("Podaj dowolny wyraz: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        revertString(line);
        String odwrotny = revertString(line);
        System.out.println("na odwrót: " + odwrotny);

    }
}
