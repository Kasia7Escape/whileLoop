package abstrakcja;

public class Kwadrat extends Figura {

    //pole: bok kwadratu
    int a;

    //konstruktor
    public Kwadrat(int a) {
        this.a = a;
    }

    //metody - zaimplementowane
    @Override
    public double obliczPole() {
        return a * a;
    }

    @Override
    public double obliczObwod() {
        return 4 * a;
    }
}
