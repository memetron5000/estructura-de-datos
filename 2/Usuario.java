import java.util.Scanner;
public class Usuario extends ejecutar{
    private String nombre;
    private Long ID;
    private Fecha fecha_nacimiento;
    private String ciudad_nacimiento;
    private Long tel;
    private String email;
    private Direccion dir;

    Scanner scanner= new Scanner(System.in);
    public Usuario(){
    
    }

    public Usuario (String n, long id) {
        this.nombre = n;
        this.ID = id;
        
    }

    public void setNombre(String n) {
        this.nombre = n ;
    }
    public void setID(long id) {
        this.ID = id ;
    }
    public void setFecha_nacimiento(Fecha f) {
        this.fecha_nacimiento = f ;
    }
    public void setCiudad_nacimiento(String c){
        this.ciudad_nacimiento = c ; 
    }
    public void setTel (long t){
        this.tel = t ;
    }
    public void setEmail(String e){
        this.email = e ;
    }
    public void setDir(Direccion d){
        this.dir = d;
    }

    public String getNombre(){
        return nombre;
    }
    public Long getID(){
        return ID;
    }
    public Fecha getFecha_nacimiento(){
        return fecha_nacimiento;
    }
    public String getCiudad_nacimiento(){
        return ciudad_nacimiento;
    }
    public Long getTel(){
        return tel;
    } 
    public String getEmail(){
        return email;
    }
    public Direccion getDir() {
        return dir;
    }
    public String toString (){
        return "\n Aca esta su resumen de informacion, "+nombre+"\n ID= "+ID+"\n Telefono= "+tel+"\n Email= "+email;
    }
}

