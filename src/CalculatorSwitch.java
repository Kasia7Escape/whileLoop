import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {


        Scanner odczyt = new Scanner(System.in);
        char operacja;
        double a;
        double b;
        double wynik = 0;/* musi byc =0, ponieważ jest mozliwe, ze wprowadzimy bledny symbol,
        przy a i b nie musi byc zera, bo system wie, ze na pewno cos wpiszemy do konsoli */


        System.out.println("Kalkulator");

        System.out.println("Podaj pierwsza liczbe:");
        a = odczyt.nextDouble();

        System.out.println("Podaj operacje");
        operacja = odczyt.next().charAt(0);

        System.out.print("Podaj druga liczbe:");
        b = odczyt.nextDouble();




        switch (operacja) {
            case '+':
                wynik = a + b;
                break;
            case '-':
                wynik = a - b;
                break;
            case '*':
               wynik = a * b;
                break;
            case '/':
              wynik = a / b;

                if(b == 0) {
                    System.out.println("Nie mozna dzielic przez zero!");
                }
            default:
                System.out.println("Nie mozna wykonac operacji");


        }
        System.out.println("Wynik:" + a +"" + operacja + "" + b + "=" + wynik);
    }

}
