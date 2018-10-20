package interfaces;

//wszystko w interface jest public
//jest jak klasa abstract ale bez pól i konstruktora
// wszystko jest abstrakcyjna metodą

public interface BasicCollection {

    //sygnatury metod, ktore trzeba zaimplementować w klasie poch.
    boolean addElement(String s);

    String removeElement();

    String removeElement(int index);

}
