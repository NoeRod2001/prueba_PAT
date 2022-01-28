import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate_47 {

    public static void main(String[] args) {

        //---------------videos 74-75---------------//

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy"); //Mes(MM) va en mayúsculas porque minutos va en minúsculas (mm)
        String fechaStr = df.format(fecha);

        long j = 0;
        for(int i = 0; i < 10000000; i++){

            j += i;

        }

        System.out.println("j = " + j);

        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempo transcurrido en el for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);

    }

}
