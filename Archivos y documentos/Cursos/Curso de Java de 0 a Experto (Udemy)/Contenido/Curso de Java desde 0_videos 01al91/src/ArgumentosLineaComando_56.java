public class ArgumentosLineaComando_56 {

    public static void main(String[] args) {

        //-------------------------video 88-------------------------//

        if(args.length == 0){
            System.out.println("Debe ingresar argumentos o parámetros!");
            System.exit(-1); //El -1 es cuando sucede un Error
        }
        for(int i = 0; i < args.length; i++){

            System.out.println("Argumentos n° = " + i + ": " + args[i]);

        }

    }

}
