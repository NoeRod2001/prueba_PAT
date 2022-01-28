public class ArgumentosLineaComandoCalculadora_57 {

    public static void main(String[] args) {

        //-------------------------video 89-------------------------//

        if(args.length != 3){

            System.out.println("Por favor ingresar una operación (suma, resta, multi, div) y 2 números enteros");
            System.exit(-1);

        }
        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;

        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        }catch(NumberFormatException e){
            System.err.println("¡¡Cuidado, a y b deben ser enteros!!" + "\nVuelva a intentarlo...");
            System.exit(-1);
        }
        switch(operacion){

            case "suma":
                resultado = a+b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "multi":
                resultado = a*b;
                break;
            case "div":
                if(b == 0){
                    System.err.println("¡¡No se puede dividir por 0, es una indeterminación del tipo INFINITO!!");
                    System.exit(-1);
                }
                resultado = (double)a/b;
                break;
            default:
                resultado = a+b;

        }

        System.out.println("Resultado de la operación '" + operacion + "' es: " + resultado);

    }

}
