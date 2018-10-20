package zadanieFirma;

public class Firma {
    private static final int MAKSYMALNA_LICZBA_PRACOWNIKOW = 100;
    private String nazwaFirmy;
    private Pracownik[] pracownicy;
    private int liczbaPracownikow; //pokazuje aktualny stan prac i index w tablicy gdzie wstawić pracownika

    //tworzymy konstruktor
    public Firma(String nazwaFirmy) {
        this.liczbaPracownikow = 0;
        this.nazwaFirmy = nazwaFirmy;
        this.pracownicy = new Pracownik[MAKSYMALNA_LICZBA_PRACOWNIKOW];
    }

    //getter dla pola nazwaFirmy -  bez settera
    public String getNazwaFirmy() {
        return this.nazwaFirmy;
    }

    //getter bez settera dla pola liczbaPracownikow
    public int getLiczbaPracownikow() {
        return liczbaPracownikow;
    }

    //getter dla pracowników
    public Pracownik[] getPracownicy() {
        return this.pracownicy;
    }

    //mamy już stan(nazwe i pracowników) i chcemy wykonywac metody np dodawać pracowników
    public boolean dodajPracownika(Pracownik nowyPracownik) {
        if (liczbaPracownikow < MAKSYMALNA_LICZBA_PRACOWNIKOW) {
            pracownicy[liczbaPracownikow++] = nowyPracownik; //pierwszego pracownika wstawiam na pozycję o indeksie zero
            return true;
        }
        return false;
    }

    /**
     * usuwa pracownika i zwraca referencje pracownika lub
      * @param id
     * @return
     */
//chcemy zrobić tak, zeby usuwanie nie zepsuło wyświetlania pracowników
    public Pracownik usunPracownika(int id){
        //todo:zaimplementuj kiedy pracownicy będa mieli swoje id
        Pracownik pracownikDoUsuniecia = null;
        for(int i = 0; i < liczbaPracownikow; i++ ){
            if (pracownicy[i].getId() == id){
                //znależliśmy pracownika
                pracownikDoUsuniecia = pracownicy[i];
                pracownicy[i] = null;
                liczbaPracownikow--; //bo usuneliśmy pracownika i zmniejszylismy liczbe pracownikow
                break;
            }
        }

        //todo: napraw tablice
        Pracownik[] nowaTablica = new Pracownik[MAKSYMALNA_LICZBA_PRACOWNIKOW];
        //index - wskażnik w nowej tablicy na pierwsze wolne miejsce
        //zwiększamy tylko gdy w starej tablicy spotkamy pracownika a nie null
        int index = 0;
        for(int i = 0; i < pracownicy.length; i++){
            if(pracownicy[i] != null){
                nowaTablica[index] = pracownicy[i];
                index++;
            }
        }
        pracownicy = nowaTablica;
        return pracownikDoUsuniecia;
    }
}
