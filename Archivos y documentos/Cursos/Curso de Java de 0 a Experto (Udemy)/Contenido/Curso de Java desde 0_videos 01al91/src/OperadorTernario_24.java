import java.util.Scanner;

public class OperadorTernario_24 {

    public static void main(String[] args) {

        //--------------------videos 43--------------------//

       //String variante = condicion ? si es verdadero: si es falso;

        String variante = 7 == 5 ? "si es verdadero": "Es totalmente falso";
        System.out.println("variante = " + variante);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la nota de matemáticas entre 4.0 - 10.0 ");
        matematicas = s.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 4.0 - 10.0 ");
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota de historia entre 4.0 - 10.0 ");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia)/3;
        System.out.println("promedio es = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado su majestad": "Rechazado por pichurria";
        System.out.println("estado = " + estado);

        /*if(promedio >= 5.49){
            estado = "Aprobado su majestad";
        }else{
            estado = "Rechazado por pichurria";
        }*/

    }

}
