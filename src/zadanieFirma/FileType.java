package zadanieFirma;

//od razu definiujemy możliwe obiekty
public enum FileType {
    TXT("txt"), XML("xml"), JSON("json");  //pola - nazwy enum dużymi literami-a jak stałe, instancje enuma
    private String extension;


    //definiujemy konstruktor - ZAWSZE JEST PRYWATNY W ENUMIE!!!
    FileType(String extension){
        this.extension = extension;
    }
    //metoda
    public String getExtension(){
        return this.extension;
    }
}
