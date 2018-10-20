package dziedziczenie;

public class Pracownik extends Osoba { //najedz na Pracownik i alt plus enter - wywołuje konstruktor
    private String stanowisko;

    public Pracownik() {
        System.out.println("konstruktor bazowy Pracownik");

        /* do poprawy
        public Pracownik(String imie, String nazwisko, int wiek){
            super(imie, nazwisko, wiek);}

        } */
    }
}