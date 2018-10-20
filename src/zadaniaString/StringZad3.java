package zadaniaString;

import java.util.Scanner;

//palindrom (tez można zrobic jak w drugim zadaniu)

public class StringZad3 {

    public static boolean isPalindrome(String text) {
        boolean result = false;
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - i)) {
                return false;    //lub napisać result, potem break i wtedy przy boolean result wstawić true
            }
        }
        return true;
    }


    public static void main(String[] args) {
      /*  String napis;
        System.out.println("Napisz dowolny wyraz:");
        Scanner scanner = new Scanner(System.in);
        napis = scanner.nextLine();
        System.out.println(isPalindrome(napis)); */
        System.out.println(isPalindrome("anna"));

    }
}
