package javaTpoint;

public class BreakExample {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 4; j++){
                //break of inner loop
                if(i == j && i > 2){
                    break;
                }
                System.out.println(i +" " + j);
            }
        }
    }
}
