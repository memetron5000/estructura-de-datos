import java.util.Scanner;
public class ejecutar {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Usuario u = new Usuario();
        Direccion d = new Direccion();
        Fecha f = new Fecha();

        System.out.println("Ingrese su nombre de usuario");
        String nombre = scanner.nextLine();
        u.setNombre(nombre);

        System.out.println("Ingrese su ID");
        Long ID = scanner.nextLong();
        u.setID(ID);

        // fecha
        System.out.println("Fecha de Nacimiento");
        System.out.println("Ingrese el dia de nacimiento");
        short dd = scanner.nextShort();
        f.setDia(dd);

        System.out.println("Ingrese el mes de nacimiento");
        short mm= scanner.nextShort();
        f.setDia(mm);

        System.out.println("Ingrese el año de nacimiento");
        short aa = scanner.nextShort();
        f.setA(aa);
        
        System.out.println("Ingrese su calle de nacimiento");
        scanner.nextLine();
        String calle = scanner.nextLine();
        d.setCalle(calle);

        System.out.println("Ingrese su barrio de nacimiento");
        String barrio = scanner.nextLine();
        d.setBarrio(barrio);

        System.out.println("Ingrese su nomenclatura de nacimiento");
        String nomenclatura = scanner.nextLine();
        d.setNomenclatura(nomenclatura);
        
        System.out.println("Ingrese su ciudad de nacimiento");
        String ciudad = scanner.nextLine();
        d.setCiudad(ciudad);

        System.out.println("Ingrese su edificio de nacimiento");
        String edificio = scanner.nextLine();
        d.setEdificio(edificio);

        System.out.println("Ingrese su Apartamento de nacimiento");
        String apto = scanner.nextLine();
        d.setApto(apto);
        
        System.out.println("Ingrese telefono");
        Long tel = scanner.nextLong();
        u.setTel(tel);
        
        System.out.println("ingrese su email");
        scanner.nextLine();
        String email = scanner.nextLine();
        u.setEmail(email);

        System.out.println(u.toString());
        System.out.println(f.toString());
        System.out.println(d.toString());
        
        scanner.close();
        
    }
}
