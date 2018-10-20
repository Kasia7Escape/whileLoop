package zadanieFirma;

import java.util.Scanner;

public class Program {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("CircleTest do zarzadzania firma");

        System.out.println("Podaj nazwe firmy:");
        String nazwaFirmy = scanner.nextLine();
        Firma firma = new Firma(nazwaFirmy);  //wczytujemy z konsoli


        int wybor = -1;

        //potrzebujemy instrukcji, która będzie wykowywała to w pętli while - bo nie wiemy ile razy
        while (wybor != 0) {
            System.out.println("wybierz operację");
            System.out.println("1. Wypisz wszystkich pracowników");
            System.out.println("2. Dodaj nowego pracownika");
            System.out.println("3. Usuń pracownika");
            System.out.println("4. Zapisz pracowników do pliku");
            System.out.println("3. Wczytaj pracownika do pliku");
            System.out.println("0. Wyjście z programu");
            wybor = scanner.nextInt();

            switch (wybor) {
                case 1: {
                    Pracownik[] pracownicy = firma.getPracownicy();
                    if (firma.getLiczbaPracownikow() == 0) {
                        System.out.println("Brak pracowników - wybierz inne opcje");
                        break;
                    }
                    for (int i = 0; i < firma.getLiczbaPracownikow(); i++) { //%s to string, f to float który będzie póżniej podany - po przecinku
                        Pracownik p = pracownicy[i];
                        //to jest funkcja statyczna - nazwa klasy.metoda(stąd wiemy) - i stąd, ze jest kursywą - format
                        String opisPracownika = String.format("Id: %d, Imie: %s, Nazwisko: %s, e-mail: %s, pensja: %f",
                                p.getId(),
                                p.getImie(),
                                p.getNazwisko(),
                                p.getEmail(),
                                p.getPensja()
                        );
                        System.out.println(opisPracownika);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Podaj imie");
                    String imie = scanner.next();   //dlatego bez nextLine, bo program czyta tez enter i nie zadziała
                    System.out.println("Podaj nazwisko");
                    String nazwisko = scanner.next();
                    System.out.println("Podaj email");
                    String email = scanner.next();
                    System.out.println("Podaj pensję");
                    double pensja = scanner.nextDouble();

                    //mamy dane więc tworzymy obiekt
                    //imie i nazwisko z wykorzystaniem konstruktora(newPracownik(imie, nazw)
                    //email i pensja przez setter
                    Pracownik nowyPracownik = new Pracownik(imie, nazwisko);
                    nowyPracownik.setEmail(email);
                    nowyPracownik.setPensja(pensja);

                    //obiekt pracownika jest utworzony, dodajemy do firmy
                    firma.dodajPracownika(nowyPracownik);
                    break;

                }
                case 3: {
                    System.out.println("podaj id pracownika do usunięcia:");
                    int idDoUsuniecia = scanner.nextInt();
                    Pracownik usunietyPracownik = firma.usunPracownika(idDoUsuniecia);
                    //if (usunietyPracownik)
                    System.out.println("Pracownik" + usunietyPracownik.getId()
                            + ", "
                            + usunietyPracownik.getNazwisko()
                            + "został usunięty");
                    break;
                }
                // wygenerowanie funkcji - z czerwonej żarówki - przy 1-3 mozna zmiemnić - SPROBUJ!!
                case 4:
                    zapiszDoPliku(firma);
                    break;
                case 5:
                    odczytajPracowników();
                    // System.out.println("funkcjonalność w przygotowaniu");
                    break;
                default:
                    System.out.println("nie ma takiej operacji - wybierz ponownie");
                    break;

            }
            System.out.println();
            System.out.println();
        }
    }

    private static void odczytajPracowników() {
    }
// wypisać wszystkich pracowników

    private static void odczytajPracowników(Firma firma) {
        System.out.println("podaj ścieżkę do pliku");
        String sciezka = scanner.next();
        Pracownik[] pracownicyZPliku = CompanyUtils.odczytajPracownikow(sciezka);
        for (Pracownik p : pracownicyZPliku) {
            if (p != null) {
                firma.dodajPracownika(p);
            }
        }

    }

    private static void zapiszDoPliku(Firma firma) {
        System.out.println("podaj ściękę do pliku...");
        String sciezka = scanner.next();
        boolean status = CompanyUtils.zapiszPracownikow(firma.getPracownicy(), sciezka);

        //oper.trójargumentowy - zamiast ifa
        String tekst = status ? "zapis zakończony sukcesem" : "nie udało sie zapisać do pliku";
        System.out.println(tekst);

        //inny sposób - bez tworzenia zmiennej
        //System.out.println(status ? "zapis.." : " nie udało...");


    }
}
