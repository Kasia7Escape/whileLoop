package pliki;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PlikIntro {
    private static final String PATH_TO_FILE = "lorem-ipsum.txt";
    //private static BufferedReader reader;

    public static void main(String[] args) {
        //   C:\Users\kkowa\IdeaProjects\projekt 1\src\lorem-ipsum.txt  //ścieżka bezwzględna
        // najeżdzam na File Reader i alt plus enter - wywołuję blok try-catch
        //ścieżka względna - najeżdzam na plik i copy relative path
        try { //buffered reader - czyta większą ilośc danych
            BufferedReader reader = new BufferedReader(new FileReader(PATH_TO_FILE));
            // metoda readLine: czyta jedną linie i przestawia sie na kolejną linię i odczyt !!!
            String line = reader.readLine();
            String newLine = null;

            //odczytujemy zawartość linii i sprawdzamy, czy nie jest pusta - null
            //jeśli będzie null, to metoda się nie wykona ani razu
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
           e.printStackTrace();  //ścieżka dostępu - czy poprawna?
           // zamknięcie plku
        } finally {

        }

    }
}
