package zadanieFirma.reader;

import zadanieFirma.Pracownik;

import java.util.Objects;

public abstract class EmployeeReader {
    private String path;

    protected EmployeeReader(String path){
     //   if (path == null){
     //      throw new NullPointerException("path cannot be null");
        // chyba: this.path = path;
     //   }
        this.path = Objects.requireNonNull(path);
    }
    public String getPath(){
        return path;
    }

    public abstract Pracownik[] odczytajPracownikow();
}
