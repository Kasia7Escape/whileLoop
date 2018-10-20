package zadaniaString;

import java.util.Scanner;

//program liczy ile razy w danym słowie występuje jego ostatnia litera

public class Strig1Piotr {

    public static int countNumberOfLastChar(String text) {

        char lastChar = text.charAt(text.length() - 1);
        int counter = 0;
        for(int i = 0; i < text.length();i++){
            if(text.charAt(i) == lastChar){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("POdaj słowo:");
        String word = scanner.nextLine();
        int count = countNumberOfLastChar(word);
        System.out.println("w słowie " + word + " ostatnia litera występuje " + count + "razy.");

    }

}
