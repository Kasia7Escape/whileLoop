//program podaje liczby od zera do 10 - pozniej podaje od tyłu co druga liczbe

public class LoopForIntro {
    public static void main(String[] args) {
        //some for lop examples (początek, koniec, iteracja)
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Od tylu");
        for (int i = 10; i > 0; i = i - 2) {
            System.out.println(i);
        }

    }
}
