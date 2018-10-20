package zadaniaString;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        String imie = "Katarzyna";


        Scanner scanner = new Scanner(System.in);

        //oblicza liczbe liter w napisie

        System.out.println("Długość napisu: " + imie.length());

        //zamienia okreslona litere na inna okreslona litere
        String replace = imie.replace('a', 'A');
        System.out.println(imie);
        System.out.println(replace);

        //zamienia wszystkie litery na male
        System.out.println(imie.toLowerCase());

        //zamienia jeden ciag liter na inny
        System.out.println(imie.replace("ta", "TTA"));

        //wypisuje to co konczy sie na...
        imie.endsWith(".txt");

        //sprawdza czy napis zawiera jakis okreslony znak lub ciag znakow
        imie.contains("@");//dopisac metode true - false
        if (imie.contains("@")) {
            System.out.println("To jest adres email");
        } else {
            System.out.println("To nie jest poprawny adres");
        }

        //wypisuje z wyrazu litery na danej pozycji
        System.out.println(imie.substring(0, 4)); //ciag liter - poczatek od pozycji zero do pozycji poprzedzajacej koniec ciagu


    }
}
