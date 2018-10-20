package intro;

public class Pracownik {
    String imie; //  gdyby było private, byłoby widoczne tylko w obrębie klasy
    String nazwisko;  //widoczne dla pakietu - tzw default
    public String email;
    public double pensja;

    //java nazwe konstruktora pobiera z klasy
    public Pracownik() {
        System.out.println("Tworze nowy obiekt intro.Pracownik");
    }

    //przeciązęnie konstruktora
    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;  //jeśli w klasie odnosze sie do pola
        this.nazwisko = nazwisko;
    }

    public Pracownik(String imie, String nazwisko, String email) {
        this(imie, nazwisko);
        this.email = email;


    }

    public String getImie() {  //to jest metoda - getImie to nazwa funkcji
        return this.imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String przedstawSie() {
        return "Nazywam się " + imie + " " + nazwisko;
    }
}

