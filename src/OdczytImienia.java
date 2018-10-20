import java.util.Scanner;

public class OdczytImienia {
    public static void main(String[] args) {
        System.out.println("Podaj swoje imie: ");

        System.out.print("Oblicz wyniki działan:");

        //tworzymy nowy obiekt typu Scanner o nazwie skaner i przypisujemy nowy obiekt
        Scanner skaner = new Scanner(System.in);
        //utworz zmiennej name i przypisanie wartości, która przyjdzie z komputera
        String name = skaner.nextLine();
        //dodawanie napisów - konkatenacja
        System.out.println("Witaj, " + name);

        /*System.out.print("Oblicz wyniki dzialan:");*/

        System.out.println("Podaj liczbe pierwsza");
        int liczba1 = skaner.nextInt();
        System.out.println("Podaj liczbe druga");
        int liczba2 = skaner.nextInt();

        System.out.println("Suma wynosi:");
        System.out.println(liczba1 + liczba2);

        System.out.println("Różnica wynosi:");
        System.out.println(liczba1 - liczba2);

        System.out.println("Iloczyn wynosi: ");
        System.out.println(liczba1 * liczba2);

        System.out.println("Iloraz wynosi: ");
        System.out.println(liczba1 / liczba2);

        System.out.println("Reszta z dzielenia wynosi:");
        System.out.println(liczba1 % liczba2);












    }
}
