package javaTpoint;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <=15; i++){
            if(i == 5 || i == 10){
                //continue przerywa pętlę w wybranym miejscu i od razu kontynuuje od kolejnego
                continue;
            }
            System.out.println(i);
        }
    }
}
