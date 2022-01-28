import java.util.InputMismatchException;
import java.util.Scanner;

public class SentenciaSwitchCase_31 {

    public static void main(String[] args) {

        //---------------videos 53-54---------------//

        Scanner s = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("Ingrese el número del mes entre 1-12");
        System.out.println("------------------------------------");
        int mes = 0;
        mes = s.nextInt();
        String nombreMes = null;

        switch(mes){

            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";

        }

        System.out.println("El mes es = " + nombreMes);

        System.out.println("------------------------");
        System.out.println("Elija un número del 0-3");
        System.out.println("------------------------");
        byte num = 0;
        num = s.nextByte();

        switch (num) {

                case 0:
                    System.out.println("EL número es cero");
                    break;
                case 1:
                    System.out.println("EL número es uno");
                    break;
                case 2:
                    System.out.println("EL número es dos");
                    break;
                case 3:
                    System.out.println("EL número es tres");
                    break;
                default:
                    System.out.println("Número o carácter desconocido :C");

            }

        System.out.println("-------------------------------");
        System.out.println("Introduzca nombre de usuario...");
        System.out.println("-------------------------------");
            String nombre = "noé";
            nombre = s.next();

        switch(nombre){

            case "admin":
                System.out.println("Hola admin, bienvenido!");
                break;
            case "noé":
                System.out.println("Hola noé, bienvenido!");
                break;
            case "pepe":
                System.out.println("Hola pepe, bienvenido!");
                break;
            default:
                System.out.println("Lo sentimos, usted no está registrado :C");

        }

      }

}