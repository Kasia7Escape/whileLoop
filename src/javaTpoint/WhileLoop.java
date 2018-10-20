package javaTpoint;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("podaj liczbę a wydrukuję wszystkie mniejsze od niej liczby parzyste");
        Scanner scanner = new Scanner(System.in);
        int podanaLiczba = scanner.nextInt();
        int Liczba = 1;
        while (Liczba < podanaLiczba){
            if(Liczba % 2 == 0)
           System.out.println(Liczba);
           Liczba++;
        }

    }
}
