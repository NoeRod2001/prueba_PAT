public class EjemploString_10 {

    public static void main(String[] args) {

        String curso = "Programación en Java";
        String curso2 = new String("Programación en Java");

        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        String curso3 = "Programación en Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);

    }

}