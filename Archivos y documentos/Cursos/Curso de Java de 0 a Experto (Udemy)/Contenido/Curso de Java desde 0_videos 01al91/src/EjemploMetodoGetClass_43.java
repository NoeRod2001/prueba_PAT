import java.lang.reflect.Method;

public class EjemploMetodoGetClass_43 {

    public static void main(String[] args) {

        //---------------video 70---------------//

        System.out.println("-------------------------------------------");

        String texto = "Hola qué tal!";

        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackageName());
        System.out.println("strClass.getName() = " + strClass);

        System.out.println("-------------------------------------------");

        for(Method metodo: strClass.getMethods()){

            System.out.println("metodo.getName() = " + metodo.getName());

        }

        System.out.println("----------------------------------");

        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass());
        System.out.println("intClass.getSuperclass().getSuperclass() = " + objClass);

        System.out.println("----------------------------------");

        for(Method metodo: objClass.getMethods()){

            System.out.println("metodo.getName() = " + metodo.getName());

        }

        System.out.println("----------------------------------");

    }

}
