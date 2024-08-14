import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectStreamException;

public class Reader {

    static void leer_archivo(List datos){

        try{
            BufferedReader lector = new BufferedReader(new FileReader("lab 5/Empleados.txt"));
            String line = "";
            while ((line=lector.readLine()) != null){
                String[] bloque = line.split(" ");
                // Retomamos los valores

                String nombre = bloque[0];
                int cedula = Integer.parseInt(bloque[1]);

                //Object temp = new Users(nombre, cedula);

                datos.insertar(nombre, cedula);
            }
            lector.close();

        }catch (IOException e){
            System.out.println("Error al leer el archivo " + e.getMessage());
        }


    }

}