public class OperadoresIncrementales_20 {

    public static void main(String[] args) {

        //-----------Pre-Incremento-----------//

        System.out.println("-----------------");

        int i = 1;
        System.out.println("Inicial de i = " + i);
        int j = ++i; // i = i + 1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("-----------------");

        //-----------Post-Incremento-----------//

        i = 2;
        System.out.println("Inicial de i = " + i);
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("-----------------");

        //-----------Pre-Decremento-----------//

        i = 3;
        System.out.println("Inicial de i = " + i);
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("-----------------");

        //-----------Post-Decremento-----------//

        i = 4;
        System.out.println("Inicial de i = " + i);
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("++j = " + (++j));
        System.out.println("j++ = " + (j++));
        System.out.println("Valor final de j = " + j);

        System.out.println("-----------------");

    }

}
