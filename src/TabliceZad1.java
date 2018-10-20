import java.util.Random;

public class TabliceZad1 {

    private static final int ARRAY_SIZE = 10;
    private static final int RANDOM_MIN_BOUND = -10;

    public static void main(String[] args) {
        int[] liczby = new int[ARRAY_SIZE];

        Random random = new Random();
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = random.nextInt(21) + RANDOM_MIN_BOUND;
        }

        //iteracja przez tablicę w celu wyswietlenia jej zawartości
        for (int i = 0; i < liczby.length; i++) {
            System.out.println("Indeks:" + i + ", wartość:" + liczby[i]);
        }
        //znajdownie największego elementu
        int max = liczby[0];
        for (int i = 0; i < liczby.length; i++) {
            if (max < liczby[i]) {
                max = liczby[i];
            }
        }
        System.out.println("Największa liczba to: " + max);

        int min = liczby[0];
        for (int i = 0; i < liczby.length; i++) {
            if (min > liczby[i]) {
                min = liczby[i];
            }
        }
        System.out.println("Najmniejsza liczba to: " + min);

        //suma elementów
        int suma = 0;
        for (int i = 0; i < liczby.length; i++) {
            suma = suma + liczby[i];

            //alternatywny krótszy zapis:
            // suma += liczby[i];
        }
        System.out.println("Suma liczb wynosi:" + suma);

        //musimy zrobic rzutowanie, bo suma jest typu int
        double srednia = (double) suma / liczby.length; //rzutowanie (inaczej system zaokrągli)-wystarczy 1 zmienna
        System.out.println("Srednia to: " + srednia);

        int mniejsza = 0;
        int wieksza = 0;
        for (int i = 0; i < liczby.length; i++) {
            if (mniejsza < srednia) {
                mniejsza++;
            }
            if (wieksza > srednia) {
                wieksza++;
            }


        }
        System.out.println("Ilosc Mniejsza od średniej to: " + mniejsza);
        System.out.println("ilosc większych od średniej to: " + wieksza);

        //wypisanie od tyłu:
        for (int i = liczby.length; i >= 0; i--) {
            System.out.println("Element na pozycji " + i + " wynosi: " + liczby[i]);
        }

        //pętle for-each - przy prostych funkcjach - wyświetlenie lub suma
        for (int liczba : liczby) {
            System.out.println(liczba);
        }
    }

}

