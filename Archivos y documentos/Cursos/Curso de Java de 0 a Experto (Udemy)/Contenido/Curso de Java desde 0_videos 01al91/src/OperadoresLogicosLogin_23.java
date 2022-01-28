import java.util.*;

public class OperadoresLogicosLogin_23 {

    public static void main(String[] args) {

        //---------------videos 41-42-44---------------//

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "Noé";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345";*/

        String[] usernames = {"Noé", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){

            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true: esAutenticado;

            /*if( (usernames[i].equals(u) && passwords[i].equals(p)) ){

                esAutenticado = true;
                break;

            }*/

        }

        String mensaje = esAutenticado ? "Bienvenido usuario: ".concat(u).concat("!") :
                "Username o contraseña incorrecto!\nLo sentimos, requiere autenticación";
        System.out.println("mensaje = " + mensaje);
        
        /*if(esAutenticado){ //Al ser un valor booleano no es necesario escribir " == true"

            System.out.println("Bienvenido usuario: ".concat(u).concat("!"));

        }else{

            System.out.println("Username o contraseña incorrecto!");
            System.out.println("Lo siento, requiere autenticación");

        }*/

    }

}
