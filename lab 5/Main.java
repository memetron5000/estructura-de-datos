import java.util.Scanner;

public class Main {

<<<<<<< HEAD
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
<<<<<<< HEAD
>>>>>>> 28c799d (refactoring structure)

=======
>>>>>>> 960c569 (failure fetch)
=======
>>>>>>> b6e1ae9 (update in files reader and show list in main)
    public static void main(String[] args){
        List datos = new List();

        // Lectura de datos
        Reader.leer_archivo(datos);

        // Datos de prueba
        datos.sort();
        System.out.println("Lista ordenada");
        datos.mostrarList();

<<<<<<< HEAD
<<<<<<< HEAD
=======
        // Lectura de datos
        leer_archivo(datos);

        datos.mostrarList();

>>>>>>> 28c799d (refactoring structure)
=======
>>>>>>> 960c569 (failure fetch)
=======

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







>>>>>>> c7ac9d2 (add test in main verified)
    }
}

