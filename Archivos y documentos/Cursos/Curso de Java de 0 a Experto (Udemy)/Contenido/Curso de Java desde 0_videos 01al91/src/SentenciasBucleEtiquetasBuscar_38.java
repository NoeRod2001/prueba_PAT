public class SentenciasBucleEtiquetasBuscar_38 {

    public static void main(String[] args) {

        //---------------video 62---------------//

        String frase = "trigo tres tristes tigres tragan trigotrigo en un trigaltrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        int cantidad = 0;
        char letra = 'r';
        buscar:
        for(int i = 0; i <= maxFrase;){

            int k = i;

            for(int j = 0; j < maxPalabra; j++) {

                if (frase.charAt(k++) != palabra.charAt(j)) {

                    i++;
                    continue buscar;

                }

            }

            cantidad++;
            i = i + maxPalabra;

        }

        System.out.println("Encontrado = " + cantidad + " veces la palabra '"+palabra+"' en la frase :D");

    }

}
