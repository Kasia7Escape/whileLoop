package interfaces;

import java.util.EmptyStackException;

public class StringStack implements BasicCollection {

    //
    private static final int INITIAL_CAPACITY = 5;
    private String[] elements;
    private int index = 0;

    public StringStack() {
        this.elements = new String[INITIAL_CAPACITY];
    }

    //metody zaimplementowane  z BasicCollection :
    @Override
    public boolean addElement(String text) {
        if (index < INITIAL_CAPACITY) {
            elements[index++] = text;
            System.out.println("dodano element");
            return true;
        } else {
            //todo: delete this
            System.out.println("stos pełny, nie mozna dodać, zwracam false");

            return false;
        }
    }

    /**
     * Usuwa element ze szczytu stosu i go zwraca
     *
     * @return zwraca usunięty element
     */
    @Override
    public String removeElement() {
        if (index == 0) {
            throw new EmptyStackException();
        }
                String elementToRemove = elements[index];
                elements[index] = null;//oznaczamy elem do usunięcia przez garbage collector
                index--;
                return elementToRemove;
            }



        @Override
        public String removeElement ( int index){
            throw new UnsupportedOperationException();
        }
    }

