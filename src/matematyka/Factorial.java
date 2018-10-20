package matematyka;

// napisz program obliczający n!
public class Factorial {

    public static void main(String[] args) {
        System.out.println("Podaj n");
        int n = 5;
        int wynik = MathHelper.factorial(n);
        System.out.println(n + "silnia to: " + wynik);
        System.out.println(MathHelper.factorial(1));
        System.out.println(MathHelper.factorial(2));
        System.out.println(MathHelper.factorial(3));
        System.out.println(MathHelper.factorial(4));
        System.out.println(MathHelper.factorial(5));
        System.out.println(MathHelper.factorial(6));

        System.out.println(MathHelper.fibonacciRecursive(0));
        System.out.println(MathHelper.fibonacciRecursive(1));
        System.out.println(MathHelper.fibonacciRecursive(2));
        System.out.println(MathHelper.fibonacciRecursive(3));
        System.out.println(MathHelper.fibonacciRecursive(4));
        System.out.println(MathHelper.fibonacciRecursive(5));
        System.out.println(MathHelper.fibonacciRecursive(6));

        //albo


        //m = pozycja liczby w ciągu zaczynając od zera
        //ciąg: 0,1,1,2,3,5,8
        //numer:0,1,2,3,4,5,6,itd
        int m = 2;
int result = MathHelper.fibonacciRecursive(m);
        System.out.println("fibonacci: " + result);
    }
}
