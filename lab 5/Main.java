public class Main {



    public static void main(String[] args){
        List datos = new List();

        Users a = new Users("Angel", 403032);
        datos.addFirst(a);

        // Lectura de datos
        Reader.leer_archivo(datos);



        datos.mostrarList();


    }
}
