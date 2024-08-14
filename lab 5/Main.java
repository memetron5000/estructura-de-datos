<<<<<<< HEAD
public class Main {


=======
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    private static void leer_archivo(List datos){

        try{
            BufferedReader lector = new BufferedReader(new FileReader("lab 5/Empleados.txt"));
            String line = "";
            while ((line=lector.readLine()) != null){
                String[] bloque = line.split(" ");
                // Retomamos los valores
                String nombre = bloque[0];
                int cedula = Integer.parseInt(bloque[1]);

                datos.addLast(nombre);
            }
            lector.close();

        }catch (IOException e){
            System.out.println("Error al leer el archivo " + e.getMessage());
        }


    }
>>>>>>> 28c799d (refactoring structure)

    public static void main(String[] args){
        List datos = new List();

<<<<<<< HEAD
        Users a = new Users("Angel", 403032);
        datos.addFirst(a);

        // Lectura de datos
        Reader.leer_archivo(datos);



        datos.mostrarList();


=======
        // Lectura de datos
        leer_archivo(datos);

        datos.mostrarList();

>>>>>>> 28c799d (refactoring structure)
    }
}
