package interfaces;

public class Aplication {
    public static void main(String[] args) {
        BasicCollection stos = new StringStack();
        stos.addElement("Pierwszy");
        stos.addElement("Drugi");
        stos.addElement("Trzeci");
        stos.addElement("Czwarty");
        stos.addElement("Piąty");
        stos.addElement("szosty");

        BasicCollection stringStack = new StringStack();
        String x = stringStack.removeElement();
        System.out.println(x);

    }

}
