import javax.imageio.IIOException;
import java.io.*;
import java.util.Objects;

public class Reader {

    // Leer los datos de los empleados

    static void leer_archivo(DoubleList datos){

        try{
            // Para vscode
            String empleados =System.getProperty("user.home")+File.separator+"Desktop"+"/estructura-de-datos-main/lab 5/"+"Empleados.txt";
            BufferedReader lector = new BufferedReader(new FileReader(empleados));
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
            // Para vscode
            String contra =System.getProperty("user.home")+File.separator+"Desktop"+"/estructura-de-datos-main/lab 5/"+"Password.txt";
            BufferedReader lector = new BufferedReader(new FileReader(contra));
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

    static void agregarUsuario(String name, int id, String pass, String c){
        try{

            // Se crea su bandeja de entrada
            String ruta =System.getProperty("user.home")+File.separator+"Desktop"+"/estructura-de-datos-main/lab 5/"+String.valueOf(id) + "BA.txt";
            File file = new File(ruta);
            file.createNewFile();
            String empleados =System.getProperty("user.home")+File.separator+"Desktop"+"/estructura-de-datos-main/lab 5/"+"Empleados.txt";
            String contra =System.getProperty("user.home")+File.separator+"Desktop"+"/estructura-de-datos-main/lab 5/"+"Password.txt";
            BufferedWriter escritor1 = new BufferedWriter(new FileWriter(empleados, true));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(contra, true));

            String names = name.replace(" ", "-");
            escritor1.write(names + " " + id );
            escritor1.newLine();
            escritor1.close();

            if (c.equals("0")){
                escritor.write(id + " " + pass + " " + "empleado");

                escritor.newLine();
                System.out.println("Usuario agregado correctamente.");
            }else{
                escritor.write(id + " " + pass + " " + "administrador");
                escritor.newLine();
                System.out.println("Nuevo administrador añadido.");
            }
            escritor.close();
        }catch (IOException e){
            System.out.println("Error al agregar el usuario " + e);

        }

    }

    static void cambiarPass(String id, String nuevaPass) {
        try {
            //actualizar contenido en password
            String contra =System.getProperty("user.home")+File.separator+"Desktop"+"/estructura-de-datos-main/lab 5/"+"Password.txt";
            BufferedReader leer = new BufferedReader(new FileReader(contra));
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
            BufferedWriter writer = new BufferedWriter(new FileWriter(contra, false));
            writer.write(contenido.toString());
            writer.close();

            System.out.println("Contraseña cambiada exitosamente.");

        }catch (IOException e){
            System.out.println("Error al cambiar la contraseña: " + e);
        }


    }
    static void elimiarUsuario(String u){
        try{
            // actualizar el archivo password
            String contra =System.getProperty("user.home")+File.separator+"Desktop"+"/estructura-de-datos-main/lab 5/"+"Password.txt";
            String empleados =System.getProperty("user.home")+File.separator+"Desktop"+"/estructura-de-datos-main/lab 5/"+"Empleados.txt";
            BufferedReader lector = new BufferedReader(new FileReader(contra));
            StringBuilder contenido = new StringBuilder();
            String line;
            while ((line= lector.readLine()) != null){
                if (!line.startsWith(u)){
                    contenido.append(line).append("\n");
                }
            }
            lector.close();

            BufferedWriter escribir = new BufferedWriter(new FileWriter(contra));
            escribir.write(contenido.toString());
            escribir.close();


            // actualizar archivo Empleados
            BufferedReader lector1 = new BufferedReader(new FileReader(empleados));
            StringBuilder contenido1 = new StringBuilder();
            String line1;
            while ((line1=lector1.readLine()) != null){
                String[] bloque = line1.split(" ");
                if (!bloque[1].startsWith(u)){
                    contenido1.append(line1).append("\n");
                }
            }
            lector1.close();
            BufferedWriter escribir1 = new BufferedWriter(new FileWriter(empleados));
            escribir1.write(contenido1.toString());
            escribir1.close();
            System.out.println("Usuario eliminado correctamente.");

        }catch (IOException e){
            System.out.println("Error al eliminar el usuario: " + e);
        }

    }


    static DoubleList mostrarBandeja(String c){
        DoubleList recibidos = new DoubleList();
        try{
            BufferedReader banjedaEspecific = new BufferedReader(new FileReader(c));
            String linea;
            while ((linea = banjedaEspecific.readLine()) != null){
                String[] bloque = linea.split(",");
                String data = bloque[0];
                String titulo = bloque[1];
                String nombre = bloque[2];

                Cuenta cuenta = new Cuenta(data, titulo, nombre);

                recibidos.addLast(cuenta);

            }
            banjedaEspecific.close();

        }catch (IOException e){
            System.out.println("Hubo un error en la operación: " + e);
        }

        return recibidos;
    }

    static String mostrarLineaSeleccionada(String archivo, int linea){
        try{
            BufferedReader banjedaEspecifica = new BufferedReader(new FileReader(archivo));
            int contadorLineas = 1;
            String mensaje;
            String readline;
            while ((readline = banjedaEspecifica.readLine()) != null){
                if(linea == contadorLineas){
                    String[] bloque = readline.split(",");
                    mensaje = bloque[bloque.length-1];
                    return mensaje;
                }
                contadorLineas++;

            }
            banjedaEspecifica.close();


        }catch (IOException e){
            System.out.println("Hubo un error en la operación: " + e);
        }
        return "";
    }

    static void addEmail(String ruta, String linea){
        try{
            BufferedWriter escribir = new BufferedWriter(new FileWriter(ruta, true));
            escribir.write(linea);
            escribir.newLine();
            System.out.println("Mensaje enviado correctamente.");
            escribir.close();

        }catch (IOException e){
            System.out.println("Ha ocurrido un error al enviar mensaje");
        }

    }

}
