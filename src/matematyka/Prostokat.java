package matematyka;

//klasa bez maina - tylko pola, konstruktor i metody

public class Prostokat {

    public double bokA; //pola
    public double bokB;

    public Prostokat(double a, double b) { //konstruktor
        this.bokA = a;  //stan
        this.bokB = b;
    }

    //metody:
    public double obliczPole() {

        return bokA * bokB;
    }

    public double obliczObwod() {
        return 2 * bokA + 2 * bokB;
    }


}
