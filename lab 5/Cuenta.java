public class Cuenta {

    String date;
    String titulo;
    String nombre;

    public Cuenta(String data, String titulo, String nombre) {
        this.date = data;
        this.titulo = titulo;
        this.nombre = nombre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
