import java.util.Random;

//zliczanie liczb z tablicy
public class TabliceZad2 {
    public static final int ARRAY_SIZE = 20;

    public static void main(String[] args) {

        Random random = new Random();
        int[] liczby = new int[ARRAY_SIZE];
        int[] wynik = new int[11];//dla uproszczenia, w indeksie o bedzie 0, w indeksie 5 bedzie 5

        for (int i = 0; i < liczby.length; i++){
            liczby[i] = random.nextInt(10) + 1;
        }
        System.out.println("wylosowane liczby:");
        for (int i : liczby) {
            System.out.print(i + ", ");
        }
        System.out.print("\n"); //przeniesienie do kolejnej linii
        for (int i =0; i < liczby.length; i++) {
            int index = liczby[i];
            wynik[index]++;

            //wynik[liczby[i]]++;

        }
        System.out.println("wystąpienia:");
        for (int i =0; i < wynik.length; i++){
            System.out.println(i + " -> " + wynik[i]);
        }
    }
}
