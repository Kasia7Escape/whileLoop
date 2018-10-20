package zadanieFirma;

public class Pracownik {
    private static int idGenerator = 1;
    private int id;
    private String imie; //sterujemy dostepem z zewnatrz mozna pobrać imie ale nie można go zmienić - plus getter
    private String nazwisko;
    private String adres;
    private String email;
    private double pensja;

    public Pracownik(String imie, String nazwisko) {
        this.id = idGenerator++;
        this.imie = imie;
        this.nazwisko = nazwisko;

    }

    public int getId() {
        return this.id;
    }

    // klinąć alt + insert - mozna wybrać gettery i settery
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    //nadpisujemy metodę z superklasy(przedstawiamy pracownika w formie tekstowej
    @Override
    public String toString() {
        return String.format("%d, %s, %s, %s, %s,%f",
                id,
                imie,
                nazwisko,
                email,
                adres,
                pensja
        );
    }
}
