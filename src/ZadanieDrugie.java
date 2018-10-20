import java.util.Scanner;

//przechodzimy przez wyrazy sprawdzamy wielkosc liter i zamieniamy
public class ZadanieDrugie {
    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj tekst a zmienie wielkosc jego liter");
        //pobieramy tekst od usera
        String text = czytnik.nextLine();
        System.out.println("------MENU------");

        System.out.println(("Wszystkie male na duze"));
        System.out.println("Wszystkie duze na male");
        System.out.println("");
        System.out.println();
        int wybor = czytnik.nextInt();

        switch (wybor) {
            case 1: {
                //przechodzimy przez cały napis
            String wynik;
            for (int i = 0; i < text.length(); i++) {
                //pobieramy znak na i-tej pozycji
            char znak = text.charAt(i);
                //rozpoznajemy czy to mala litera czy duza (zakres 90-122)
                //jesli mała - robimy, jak duza - nie robimy nic
             if(znak >= 90 && znak <= 122) {
                    //jezeli true -> to mamy mala litere
                 //aby uzyskac duza = musimy odjac 32 - patrz tablica ASCII
             znak-=32;
                }
             System.out.println();
            }
            break;
            }
        }
        // String text = czytnik.nextLine;
        // Piotr
        //pietr
        //PIOTR

        char znak = 'A' + 32;
        System.out.println();

    }
}
