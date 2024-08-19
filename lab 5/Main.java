public class Main {
    static DoubleList datos = new DoubleList();

    public static void main(String[] args){


        // Lectura de datos
        Reader.leer_archivo(datos);
        datos.sort();

        Login.login();


        
    }
}



