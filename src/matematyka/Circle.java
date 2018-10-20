package matematyka;

//tworzymy klase z polami i metodami ale bez konkretnego obiektu
// i bez maina
public class Circle {
    public double radius; //pole

    public Circle(double radius) { //konstruktor, wrzucamy wyjątek(ale możemy tez zabezpieczyc ifem)
        if(radius <= 0){
            throw new IllegalArgumentException("radiuscannot be less or equal zero!");
        }
        this.radius = radius;
    }

    public double calculateArea() {  //metoda
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference() { //metoda
        return 2 * Math.PI * radius;
    }
}

