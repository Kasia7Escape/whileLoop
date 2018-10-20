package zadanieFirma;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//klasa Utils - narzędziowa
public class CompanyUtils {

    /**
     * Zapisuje pracowników do pliku .txt
     *
     * @param pracowniks
     * @param path
     * @return zwraca status operacji - true, jeśli się udało, false - jeśli nie
     */
    public static boolean zapiszPracownikow(Pracownik[] pracowniks, String path) {
        //do zapisu do pliku - buffer writer
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path))) {

            for (int i = 0; i < pracowniks.length; i++) {
                Pracownik pracownik = pracowniks[i];
                if (pracownik != null) {
                    writer.write(pracownik.toString() + "\n"); // \n żeby było w nowej linii
                }
            }
            return true;
        } catch (IOException e) {
            return false;
        }

    }

    public static Pracownik[] odczytajPracownikow(String sciezka) {
        Pracownik[] wynik = new Pracownik[100];
        try {
            //
            //
            //id, imie, nazwisko, email, adres, pensja
            // przecinek jest separatorem pola
            BufferedReader reader = Files.newBufferedReader(Paths.get(sciezka));
            int index = 0;
            String line = null;
            while ((line = reader.readLine()) != null) {
                //todo: delete
                System.out.println(line);
                //todo zaimpl utworzenie ok z linii Pliku
                String[] split = line.split(",");
                Pracownik pracownik = new Pracownik(split[1], split[2]);
                pracownik.setEmail(split[3]);
                pracownik.setAdres(split[4]);
                pracownik.setPensja(Double.valueOf(split[5]));

                wynik[index++] = pracownik;
            }

            return wynik;

        } catch (IOException e) {
            return new Pracownik[0];

        }
    }
}
