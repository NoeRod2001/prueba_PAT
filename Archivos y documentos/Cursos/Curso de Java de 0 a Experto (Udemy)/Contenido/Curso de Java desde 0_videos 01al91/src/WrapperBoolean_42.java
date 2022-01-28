public class WrapperBoolean_42 {

    public static void main(String[] args) {

        //---------------video 69---------------//

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        //Cuando un tipo de dato como "Boolean" comienza
        // en minúsculas es primitivo y si comienza
        // en mayúsculas es de referencia
        boolean primBoolean = num1 > num2; //Es False xD
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        System.out.println("Comparando dos objetos boolean => " + (objBoolean == objBoolean2));
        System.out.println("Comparando dos objetos boolean => " + (objBoolean.equals(objBoolean2)));
        System.out.println("Comparando dos objetos boolean => " + (objBoolean2 == objBoolean3));
        System.out.println("Comparando dos objetos boolean => " + (objBoolean == objBoolean3));

        boolean primBoolean2 = objBoolean2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);


    }

}
