public class SentenciaWhile_35 {

    public static void main(String[] args) {

        int i = 0;
        while(i <= 5){

            System.out.println("--------");
            System.out.println("i = " + i);
            i++;

        }

        int j = 0;
        boolean prueba = true;

        while(prueba){

            if(j == 7){

                prueba = false;

            }

            System.out.println("--------");
            System.out.println("j = " + j);
            j++;

        }

        prueba = false;
        do{

            System.out.println("Se ejecuta al menos una vez");

        }while(prueba);

        prueba = true;
        i = 0;

        do{

            if(i == 10){

                prueba = false;

            }
            System.out.println("i = " + i);
            i++;

        }while(prueba);

    }

}
