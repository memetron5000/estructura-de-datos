import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Inbox {

    int cedula;
    String titulo;
    String mensaje;
    Date envio;

    public void inbox(int c, String t, String m){
        this.cedula = c;
        this.titulo = t;
        this.mensaje = m;
        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        this.envio = new Date();



    }

    public static void mostrarBandejaEntrada(String c) {

        System.out.println("\n" + "=".repeat(50));
        System.out.printf("|%-48s|\n", "Bandeja de Entrada");
        System.out.println("=".repeat(50));

        System.out.printf("| %-3s | %-19s | %-20s |\n", "Nº", "Fecha de Recepción", "Remitente");
        System.out.println("=".repeat(50));

        System.out.println("=".repeat(50));
        System.out.println("Seleccione un mensaje para leerlo (ingrese el número): ");
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
