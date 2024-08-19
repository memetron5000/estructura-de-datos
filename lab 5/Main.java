public class Main {

    public static void main(String[] args){


        DoubleList datos = new DoubleList();
        // Lectura de datos
        Reader.leer_archivo(datos);
        datos.sort();

        Login.login();


        
    }
}



