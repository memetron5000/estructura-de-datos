public class Usuario {

    String nombre;
    int id;

    Usuario(String n, int i){
        this.nombre = n;
        this.id = i;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
