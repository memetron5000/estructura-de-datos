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

        System.out.println("Lista normal");
        datos.mostrarList();

        datos.sort();
        System.out.println("Lista ordenada");

        datos.mostrarList();

<<<<<<< HEAD
=======
        // Lectura de datos
        leer_archivo(datos);

        datos.mostrarList();

>>>>>>> 28c799d (refactoring structure)
=======
>>>>>>> 960c569 (failure fetch)
    }
}

