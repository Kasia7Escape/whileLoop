package javaTpoint;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        //B - profil biologiczno-chemiczny
        //M - profil matematyczno - fizyczny
        //H - profil humanistyczny
System.out.println("Lista zajęć dla poszczególnych klas");
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj numer klasy:");
        int year = scanner.nextInt();
        System.out.println("podaj symbol profilu:");
        char profil = scanner.next().charAt(0);


        switch (year) {
            case 1:
                switch (profil) {
                    case 'B':
                        System.out.println("polski, matematyka, biologia, chemia, język do wyboru");
                        break;
                    case 'M':
                        System.out.println("polski, matematyka, fizyka, chemia, język do wyboru");
                        break;
                    case 'H':
                        System.out.println("polski, matematyka, historia, łacina, język do wyboru");
                        break;
                        default:
                            System.out.println("nieprawidłowy symbol");
                }
                break;
            case 2:
                switch (profil){
                    case 'B':
                        System.out.println("przedmioty specjalistyczne w języku obcym, inżynieria genetyczna");
                        break;
                    case 'M' :
                        System.out.println("przedmioty specjalistyczne w języku obcym, podstawy programowania");
                        break;
                    case 'H':
                        System.out.println("przedmioty specjalistyczne w języku obcym, literaturoznawstwo");
                        break;
                    default:
                        System.out.println("nieprawidłowy symbol");
                }
                break;
            case 3:
                switch(profil){
                    case 'B':
                        System.out.println("zajęcia w instytucie PAN");
                        break;
                    case 'M':
                        System.out.println("zajęcia na Uniwersytecie Ekonomicznym");
                        break;
                    case 'H':
                        System.out.println("zajęcia w Instytucie Lingwistyki Stosowanej");
                        break;
                    default:
                        System.out.println("nieprawidłowy symbol");
                }
                break;
                default:
                    System.out.println("podano nieprawidłowy numer klasy");
        }
    }
}
