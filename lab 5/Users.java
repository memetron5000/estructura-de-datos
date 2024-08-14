public class Users {

    private String name;
    private int cedula;

    public Users(String n, int c){
        this.name = n;
        this.cedula = c;
    }

    public String getName() {
        return name;
    }

    public int getCedula() {
        return cedula;
    }

    public String toString() {
        return "Name: " + name + ", Cedula: " + cedula;
    }

}
