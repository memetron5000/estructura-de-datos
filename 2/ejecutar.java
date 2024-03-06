import java.util.Scanner;
import java.io.File;
import java.math.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ejecutar {

    
    public static void main(String[] args) throws IOException{

        Scanner scanner =new Scanner(System.in);
        Usuario u = new Usuario();
        Direccion d = new Direccion();
        Fecha f = new Fecha();
        Agenda a = new Agenda(5);

        
        //base de usuarios
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();
        Usuario u3 = new Usuario();
        Usuario u4 = new Usuario();
        Usuario u5 = new Usuario();

        //primer usuario
        String[] usuario1={"Santiago Ramos","1233332","30-11-2003","Calle23 29-21 barrio Sabaneta - Medallo","314223322","san@gmail.com"};
        u1.setNombre(usuario1[0]);
        u1.setID(Long.valueOf(usuario1[1]));
        f.setDia((short)30);
        f.setMes((short)11);
        f.setA((short)2003);
        d.setCalle("23");
        d.setBarrio("29-21");
        d.setBarrio("Sabaneta");
        d.setCiudad("Medallo");
        u1.setCiudad_nacimiento("calle: "+d.getCalle()+" "+d.getNomenclatura()+ " barrio: " + d.getBarrio()+" ciudad: "+d.getCiudad());
        u1.setFecha_nacimiento(f);
        u1.setTel(Long.valueOf(usuario1[4]));
        u1.setEmail(usuario1[5]);
        a.agregar(u1);


        //segundo usuario
        String[] usuario2={"Nicole Guarana","4335332","11-04-2005","Calle15 23-76 barrio Arkadia - Medallo", "3206383389", "ngua@gmail.com"};
        u2.setNombre(usuario2[0]);
        u2.setID(Long.valueOf(usuario2[1]));
        f.setDia((short)11);
        f.setMes((short)05);
        f.setA((short)2005);
        d.setCalle("15");
        d.setBarrio("23-76");
        d.setBarrio("Arkadia");
        d.setCiudad("Medallo");
        u2.setCiudad_nacimiento("calle: "+d.getCalle()+" "+d.getNomenclatura()+ " barrio: " + d.getBarrio()+" ciudad: "+d.getCiudad());
        u2.setFecha_nacimiento(f);
        u2.setTel(Long.valueOf(usuario2[4]));
        u2.setEmail(usuario2[5]);
        a.agregar(u2);


        String[] usuario3={"Angel Cachon","5137382","20-06-2004","Calle65 12-2 barrio Volador - Medallo", "3132958063", "angca@gmail.com"};
        u3.setNombre(usuario3[0]);
        u3.setID(Long.valueOf(usuario3[1]));
        f.setDia((short)20);
        f.setMes((short)06);
        f.setA((short)2004);
        d.setCalle("65");
        d.setBarrio("12-02");
        d.setBarrio("Volador");
        d.setCiudad("Medallo");
        u3.setCiudad_nacimiento("calle: "+d.getCalle()+" "+d.getNomenclatura()+ " barrio: " + d.getBarrio()+" ciudad: "+d.getCiudad());
        u3.setFecha_nacimiento(f);
        u3.setTel(Long.valueOf(usuario3[4]));
        u3.setEmail(usuario3[5]);
        a.agregar(u3);


        String[] usuario4={"Jesus Armando","9266472","04-07-2000","Call63 42-21 barrio Volador - Medallo", "3132958063", "yisus@gmail.com"};
        u4.setNombre(usuario4[0]);
        u4.setID(Long.valueOf(usuario4[1]));
        f.setDia((short)04);
        f.setMes((short)07);
        f.setA((short)2000);
        d.setCalle("63");
        d.setBarrio("42-21");
        d.setBarrio("Volador");
        d.setCiudad("Medallo");
        u4.setCiudad_nacimiento("calle: "+d.getCalle()+" "+d.getNomenclatura()+ " barrio: " + d.getBarrio()+" ciudad: "+d.getCiudad());
        u4.setFecha_nacimiento(f);
        u4.setTel(Long.valueOf(usuario4[4]));
        u4.setEmail(usuario4[5]);
        a.agregar(u4);


        String[] usuario5 ={"Jesus Armando","1306332","04-07-2000","Call63 42-21 barrio sabaneta - medallo", "313234063", "chimbo@gmail.com"};
        u5.setNombre(usuario5[0]);
        u5.setID(Long.valueOf(usuario5[1]));
        f.setDia((short)20);
        f.setMes((short)06);
        f.setA((short)2004);
        d.setCalle("65");
        d.setBarrio("12-02");
        d.setBarrio("Volador");
        d.setCiudad("Medallo");
        u5.setCiudad_nacimiento("calle: "+d.getCalle()+" "+d.getNomenclatura()+ " barrio: " + d.getBarrio()+" ciudad: "+d.getCiudad());
        u5.setFecha_nacimiento(f);
        u5.setTel(Long.valueOf(usuario5[4]));
        u5.setEmail(usuario5[5]);
        a.agregar(u5);




        System.out.println("para cargar prueba 1 escriba 1, para cargar prueba 2 escriba 2, o para continuar con el progarma original digite cualquier otra cosa");
        int sel = scanner.nextInt();

        if (sel==1) {
            System.out.println("ingrese el id del usuario que desee buscar");
            Long busc =scanner.nextLong();
            System.out.println(a.search_id(busc));
            a.toFileS();
            
        }
        else if (sel==2) {
            a.importar();
            a.printUsers();
            System.out.println("ingrese el id de la persona a eliminar");
            int id= scanner.nextInt();
            System.out.println(a.eliminar(id));
            a.toFile();
        }
        else if (sel==3) {
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
}
