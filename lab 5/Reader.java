import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class Reader {

    // Leer los datos de los empleados

    static void leer_archivo(List datos){

        try{
            BufferedReader lector = new BufferedReader(new FileReader("lab 5/Empleados.txt"));
            String line = "";
            while ((line=lector.readLine()) != null){
                String[] bloque = line.split(" ");


                // Retomamos los valores
                String nombre = bloque[0];
                int cedula = Integer.parseInt(bloque[1]);

                // agregamos el usuario desde el txt
                User temp = new User(nombre, cedula);

                datos.addLast(temp);
            }
            lector.close();

        }catch (IOException e){
            System.out.println("Error al leer el archivo " + e.getMessage());
        }


    }


    //Comprobante de inicio de sesion
    static String comprobar_pass(int c, String p){

        try{
            BufferedReader lector = new BufferedReader(new FileReader("lab 5/Password.txt"));
            String line = "";
            while ((line=lector.readLine()) != null){
                String[] bloque = line.split(" ");

                //Recopilamos los datos
                int id = Integer.parseInt(bloque[0]);
                String pass = bloque[1];
                String cargo = bloque[2];

                if (c == id && Objects.equals(p, pass)){
                    return "true";
                }
            }
            lector.close();

        }catch (IOException e){
            System.out.println("Error al leer el archivo " + e.getMessage());
        }

        return "false";
    }

}
