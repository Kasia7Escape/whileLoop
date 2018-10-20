package przestrzen;

class Point {
    private double wspolrzednaX;
    private double wspolrzednaY;

    public Point(){
        System.out.println("Obliczam odległośc:");
    }

    public Point(double wspolrzednaX, double wspolrzednaY){
        this.wspolrzednaX = wspolrzednaX;
        this.wspolrzednaY = wspolrzednaY;
    }

    public double distanceFromOrigin(){

        double d = Math.sqrt(Math.pow(wspolrzednaX, 2) + Math.pow(wspolrzednaY, 2));

        return d;


    }


}
