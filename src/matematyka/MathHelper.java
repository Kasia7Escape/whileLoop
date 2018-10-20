package matematyka;

public class MathHelper {
    //iteracyjne oblicznie silnia
    public static int factorial(int n) {
        //return 0;
        int wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik = wynik * i;

        }
        return wynik;
    }
//funkcja wywołuje samą siebie aż do końcowego(początkowego) warunku
    public static int factorialRecursive(int n) {
        if (n== 0 || n == 1){
            return 1;
        } else {
            return n * factorialRecursive(n-1);
        }

        //iteracja pętla for
    }
    public static int fibIter(int m){
        int result = 0;
        int temp1 = 0;
        int temp2 = 1;

        for(int i = 0; i < m; i++){
        result = temp1 + temp2;
        temp1 = temp2;
        temp2 = result;
        }
        return result;
    }

    public static  int fibonacciRecursive(int m){
        if (m == 0){
            return 0;
        } else if (m == 1){
            return 1;
        } else {
            return fibonacciRecursive(m-1) + fibonacciRecursive(m-2);
        }
    }
}
