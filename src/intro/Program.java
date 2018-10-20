package intro;

class Program {
    public static void main(String[] args) {
        System.out.println("hello");

        Pracownik junior = new Pracownik(); //konstr.bezparametrowy
        junior.imie = "Piotr";
        junior.nazwisko = "Kowalski";
        junior.email = "kowalski@sda.pl";

        //moge w ewnątrz nawiasu kliknąć ctr plus q
        Pracownik senior = new Pracownik("Jan", "Nowak"); //wywołanie konstruktora
        //senior.imie = "Jan";
        //senior.nazwisko = "Nowak";

        Pracownik mid = new Pracownik();
        Pracownik lead = new Pracownik("Adam", "Adamiak","adamiak@sda.pl");

        System.out.println(junior.przedstawSie());
        System.out.println(senior.przedstawSie());
        System.out.println(mid.przedstawSie());
        System.out.println(lead.przedstawSie());


    }
}
