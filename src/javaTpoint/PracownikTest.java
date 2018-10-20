package javaTpoint;

public class PracownikTest {
    public static void main(String[] args) {
        Pracownik p1 = new Pracownik(1,"Jan Nowak", 1234);
        Pracownik p2 = new Pracownik(2, "Piotr Kowalski", 2345);
        Pracownik p3 = new Pracownik(3, "Adam Adamiak", 3456);

        System.out.println("Nazywam się " + p1.getName());
        System.out.println("Nazywam się " + p2.przedstawSie());
        System.out.println("Nazywam się " + p3.przedstawSie());
        
    }

}
