public class EjemploStringMétodos_15 {

    public static void main(String[] args) {

        //--------------------------------------Métodos String (videos 29-30-31)--------------------------------------//

        String nombre = "Noé";

        System.out.println("Longitud del nombre = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Noé\") = " + nombre.equals("Noé"));
        System.out.println("nombre.equals(\"noé\") = " + nombre.equals("noé"));
        System.out.println("nombre.equalsIgnoreCase(\"Noé\") = " + nombre.equalsIgnoreCase("Noé"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(0) = " + nombre.substring(0));
        System.out.println("nombre.substring(0,3) = " + nombre.substring(0,3));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());


    }

}