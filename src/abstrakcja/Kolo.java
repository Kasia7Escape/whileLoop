package abstrakcja;

public class Kolo extends Figura {

    int r; //pole: promień koła

    public Kolo(int r) {
        this.r = r;
    } //konstruktor

    //metody: pole i obwód
    @Override
    public double obliczPole() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double obliczObwod() {
        return 2 * Math.PI * r;
    }
}
