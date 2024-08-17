import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

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

                User u = new User(nombre, cedula);

                datos.addLast(u);
            }
            lector.close();

        }catch (IOException e){
            System.out.println("Error al leer el archivo " + e.getMessage());
        }


    }

    public static void main(String[] args){
        List datos = new List();

        // Lectura de datos
        Reader.leer_archivo(datos);

        // Datos de prueba
        datos.sort();
        System.out.println("Lista ordenada");
        datos.mostrarList();

        // Lectura de datos
        leer_archivo(datos);

        datos.mostrarList();


        Scanner sc = new Scanner(System.in);
        int id;
        String pass;
        System.out.println("INICIO DEL PROGRAMA \nPOR FAVOR INGRESE SU IDENTIFICACION");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("POR FAVOR INGRESE SU CONTRASEÑA");
        pass = sc.nextLine();

        int intentos = 0;

        while (intentos < 3){
            if (!Reader.comprobar_pass(id, pass).equals("true")){
                System.out.println("POR FAVOR INGRESE SU IDENTIFICACION");
                id = Integer.parseInt(sc.nextLine());
                System.out.println("POR FAVOR INGRESE SU CONTRASEÑA");
                pass = sc.nextLine();
                Reader.comprobar_pass(id, pass);
                intentos ++;
            } else {
                System.out.println("BIENVENIDO AL SISTEMA");
                intentos = 3;
            }

        }

    }
}

