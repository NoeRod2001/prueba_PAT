import java.io.*;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema_51 {

    public static void main(String[] args) throws FileNotFoundException {

        //---------------videos 80-del 82 (una parte del video)---------------//

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");
            System.setProperties(p);

            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(.....) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));

            ps.list(System.out);
        }catch(Exception e){
            System.err.println("No existe el archivo = " + e);
            System.exit(1);
        }

    }

}
