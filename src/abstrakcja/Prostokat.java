package abstrakcja;

import matematyka.DimensionNotPositiveException;

public class Prostokat extends Figura {

    // pola - boki
    int a;
    int b;

    // konstruktor
    public Prostokat(int a, int b) {
        if(a<=0 || b <=0)
        this.a = a;
        this.b = b;
        throw new DimensionNotPositiveException("bok figury nie może = 0");
    }

    //metody
    @Override
    public double obliczPole() {
        return a * b;
    }

    @Override
    public double obliczObwod() {
        return 2 * (a + b);
    }
}
