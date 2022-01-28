import javax.swing.*;

public class SentenciaForArreglo_34 {

    public static void main(String[] args) {

        //---------------videos 58---------------//

        String[] nombres = {"Andrés", "Pepe", "María", "Noé", "Thiago", "Josué", "Gloria", "Elio"};
        int count = nombres.length;
        for(int i = 0; i < count; i++){

            if( nombres[i].toLowerCase().contains("ANDRÉS".toLowerCase()) ||
                    nombres[i].toLowerCase().contains("PEPE".toLowerCase())){

                continue;

            }

            System.out.println( i + ".- " + nombres[i]);

        }

        String buscar_nombre = JOptionPane.showInputDialog("Ingresa un nombre, ejemplo \"Pepe\" o \"María\":");
        System.out.println("buscar_nombre = " + buscar_nombre);

        boolean encontrado = false;

        for(int i = 0; i < count; i++){

            if(nombres[i].equalsIgnoreCase(buscar_nombre)){

                encontrado = true;
                break;

            }

            System.out.println("nombres = " + nombres[i]);

        }

        if(encontrado){

            JOptionPane.showMessageDialog(null, buscar_nombre + " fue encontrado :D");

        }else{

            JOptionPane.showMessageDialog(null, buscar_nombre + " no existe en el sistema :c");

        }

    }

}
