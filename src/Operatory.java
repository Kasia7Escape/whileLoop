public class Operatory {
    public static void main(String[] args){
        int a = 20;
        int b = 20;
        int c = 50;

        boolean czyRowne = a == b;
        System.out.println("Czy a rowne b? " + czyRowne);

        System.out.println("Nieprawda, ze a rowne b " + !czyRowne);

        boolean czyRozne = a != c;
        System.out.println("Czy a rozne od c? " + czyRozne);

        boolean czyWieksze = a > c;
        System.out.println("Czy a wieksze od c? " + czyWieksze);

        boolean czyWiekszeLubRowne = a >= b;
        System.out.println("Czy a wieksze lub rowne b? " + czyWiekszeLubRowne);

    }

}
