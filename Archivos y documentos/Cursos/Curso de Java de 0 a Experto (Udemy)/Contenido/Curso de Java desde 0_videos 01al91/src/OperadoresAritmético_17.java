import javax.swing.*;

public class OperadoresAritmético_17 {

    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);

        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i - j));

        int multi = i * j;
        System.out.println("multiplicación = " + multi);

        float div = (float) i / j;
        System.out.println("división = " + div);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int resto2 = 8 % 5;
        System.out.println("resto2 = " + resto2);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        if(numero % 2 == 0){

            System.out.println("numero par = " + numero);

        }else{

            System.out.println("numero impar = " + numero);

        }

    }

}
