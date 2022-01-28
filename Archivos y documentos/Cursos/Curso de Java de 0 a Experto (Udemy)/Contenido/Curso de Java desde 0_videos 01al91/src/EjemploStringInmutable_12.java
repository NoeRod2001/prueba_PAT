public class EjemploStringInmutable_12 {

    public static void main(String[] args) {

        String curso = "Programación en Java";
        String profesor = "Andrés Guzmán";

        String resultado = curso.concat(", con el instructor: " + profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c -> {
            return c + ", con el profesor " + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a","A");

        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }

}