import java.util.*;

public class EjemploClaseMathRandom_55 {

    public static void main(String[] args) {

        //-------------------------videos 86-87-------------------------//

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};

        double random = Math.random();
        System.out.println("random1 = " + random);
        random *= colores.length;

        System.out.println("random2 = " + random);

        random = Math.floor(random);
        System.out.println("random3 = " + random);

        System.out.println("colores = " + colores[(int)random]);

        Random randomObj = new Random();
        int randomInt = 15 + randomObj.nextInt(25-15+1);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
        
    }
    
}
