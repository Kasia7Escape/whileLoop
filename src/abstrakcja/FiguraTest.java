package abstrakcja;

import java.util.Scanner;

public class FiguraTest {
    public static void main(String[] args) {
        System.out.println("Wybierz opcję:");
        System.out.println("1. oblicz pole i obwód prostokąta");
        System.out.println("2. oblicz pole i obwód kwadratu");
        System.out.println("3. oblicz pole i obwód koła");

        Prostokat pr = new Prostokat(1,2);
        Kwadrat kw = new Kwadrat(2);
        Kolo k = new Kolo(3);

        char opcja;

        Scanner scanner = new Scanner(System.in);
        opcja = scanner.next().charAt(0);


        switch (opcja) {
            case '1':
                System.out.println("pole prostokąta = " + pr.obliczPole() + ", a jego obwód = " + pr.obliczObwod());
                break;
            case '2':
                System.out.println("pole kwadratu = " + kw.obliczPole() + ", a jego obwód = " + kw.obliczObwod());
                break;
            case '3':
                System.out.println("pole koła = " + k.obliczPole() + ", a jego obwód = " + k.obliczObwod());
                break;
            default:
                System.out.println("nieprawidłowa operacja. wybierz ponownie");
                break;

        }
    }

}

