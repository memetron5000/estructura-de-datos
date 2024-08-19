import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Inbox {

    int cedula;
    String titulo;
    String mensaje;
    Date envio;

    public void inbox(int c, String t, String m){
        this.cedula = c;
        this.titulo = t;
        this.mensaje = m;
    }

    public static void mostrarBandejaEntrada(String c) {
        Scanner scanner = new Scanner(System.in);
        String addTxt = "lab 5/Emails/" + c + "BA.txt";
        System.out.println("\n" + "=".repeat(70));
        System.out.printf("|%-48s|\n", "Bandeja de Entrada");
        System.out.println("=".repeat(70));

        System.out.printf("| %-3s | %-19s | %-20s | %-20s |\n", "Nº", "Fecha de Recepción", "titulo", "Remitente");
        System.out.println("=".repeat(70));

        DoubleList a = Reader.mostrarBandeja(addTxt);
        DoubleNode head = a.first();

        int contador = 1;

        while(head != null){

            String fecha = ((Cuenta)head.getData()).getDate();
            String titulo = ((Cuenta)head.getData()).getTitulo();
            String remitente = ((Cuenta)head.getData()).getNombre();

            System.out.printf("| %-3s | %-19s | %-20s | %-20s |\n", contador, fecha , titulo, remitente);
            contador++;
            head = head.getNext();
        }


        System.out.println("=".repeat(50));
        System.out.println("Seleccione un mensaje para leerlo (ingrese el número): ");
        int correoSeleccionado = Integer.parseInt(scanner.nextLine());
        String response = Reader.mostrarLineaSeleccionada(addTxt,correoSeleccionado);
        System.out.printf("|%-48s|\n", "Bandeja de Entrada");
        System.out.println("=".repeat(50));
        System.out.printf("|%-48s|\n", response);

    }

    public static void enviarMensaje(String id, String title, String cuerpo, String redactor){
        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();

        String uno = format.format(date);
        System.out.println(uno);

        String addRuta ="lab 5/Emails/" +  id + "BA.txt";

        String linea = uno + "," + title + "," + redactor + "," + cuerpo;

        Reader.addEmail(addRuta, linea);



    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getEnvio() {
        return envio;
    }

    public void setEnvio(Date envio) {
        this.envio = envio;
    }
}
