public class FunkcjaIntro {

    public static int dodaj(int a, int b){ //a i b istnieją tylko w obrębie tej funkcji, to są identyfikatory
        int wynik = a + b;
        return  wynik; // lub krócej: return a+b (zamiast tych d linijek
    }

    public static void main(String[] args) {
        int a = 10; //a i b to przypadek - one są spoza pierwszej klamry - można nazwac inaczej, ważna kolejnośc
        int b = 5;

        int wynikDodawania = dodaj(a, b);
        System.out.println("wynik dodawania to:"  + wynikDodawania);



        System.out.println(dodaj(2, 4));
        System.out.println(dodaj(5, 4));
        System.out.println(dodaj(8, 6));
        System.out.println(dodaj(2, 8)); //itd


    }
}
