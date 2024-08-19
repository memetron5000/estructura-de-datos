import java.io.*;
import java.util.Objects;

public class Reader {

    // Leer los datos de los empleados

    static void leer_archivo(DoubleList datos){

        try{
            // solo vscode
            //String carpetadescargas =System.getProperty("user.home")+File.separator+"Desktop"+"/lab 5/"+"Empleados.txt";
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
            // Solo vscode
            //String contra =System.getProperty("user.home")+File.separator+"Desktop"+"/lab 5/"+"Password.txt";
            BufferedReader lector = new BufferedReader(new FileReader("lab 5/Password.txt"));
            String line = "";
            while ((line=lector.readLine()) != null){
                String[] bloque = line.split(" ");

                //Recopilamos los datos
                int id = Integer.parseInt(bloque[0]);
                String pass = bloque[1];
                String cargo = bloque[2];

                if (c == id && Objects.equals(p, pass)){
                    return cargo;
                }
            }
            lector.close();

        }catch (IOException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return "false";
    }

    static void agregarUsuario(int id, String pass, String c){
        try{
            BufferedWriter escritor = new BufferedWriter(new FileWriter("lab 5/Password.txt", true));
            escritor.newLine();
            if (c.equals("0")){
                escritor.write(id + " " + pass + " " + "empleado");
                System.out.println("Usuario agregado correctamente.");
            }else{
                escritor.write(id + " " + pass + " " + "administrador");
                System.out.println("Nuevo administrador añadido.");
            }
            escritor.close();
        }catch (IOException e){
            System.out.println("Error al agregar el usuario " + e);

        }

    }

    static void cambiarPass(String id, String nuevaPass) {
        try {
            BufferedReader leer = new BufferedReader(new FileReader("lab 5/Password.txt"));
            StringBuilder contenido = new StringBuilder();
            String line = "";
            while ((line=leer.readLine()) != null){
                if (line.startsWith(id)){
                    String[] p = line.split(" ");
                    contenido.append(id + " " + nuevaPass + " " + p[2]).append("\n");
                }else{
                    contenido.append(line).append("\n");
                }
            }
            leer.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter("lab 5/Password.txt", false));
            writer.write(contenido.toString());
            writer.close();

            System.out.println("Contraseña cambiada exitosamente.");

        }catch (IOException e){
            System.out.println("Error al cambiar la contraseña: " + e);
        }


    }

}
