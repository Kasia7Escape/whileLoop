package javaTpoint;

public class ContinueEx2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j) {
                    continue;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
