import java.util.Scanner;
public class ejec {


    //creacion de usuario
    public Object user(){
        Scanner scanner =new Scanner(System.in);
        Usuario u = new Usuario();
        
        System.out.println("Ingrese su nombre de usuario");
        String nombre = scanner.nextLine();
        u.setNombre(nombre);

        System.out.println("Ingrese su ID");
        Long ID = scanner.nextLong();
        u.setID(ID);

        System.out.println("Ingrese telefono");
        Long tel = scanner.nextLong();
        u.setTel(tel);
        
        System.out.println("ingrese su email");
        scanner.nextLine();
        String email = scanner.nextLine();
        u.setEmail(email);

        return u;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Para ingresar a la primera prueba escriba 1, o escriba 2 para la segunda prueba");
        int prueba =sc.nextInt();
        if (prueba == 1) {
            List list = new List();

            for(int i=1;i<=20;i++){
                list.addLast(i);
            }

            System.out.println("\n  Lista sin modificar");
            Node temp= list.First();
            while (temp!=null){
                System.out.println(temp.getData());
                temp = temp.getNext();
            }

            list.removeFirst();
            list.removeLast();

            temp= list.First();
            Node prev=null;
            while (temp!=null){
                if (temp.getData().equals(10)){
                    prev.setNext(temp.getNext());
                    temp.setNext(null);
                    temp= prev.getNext();
                }
                else{
                    prev=temp;
                    temp= temp.getNext();
                }
                

            }
            System.out.println("\n  Lista modificada");
            temp= list.First();
            while (temp!=null){
                System.out.println(temp.getData());
                temp = temp.getNext();
            }

    }
        else if (prueba == 2) {
        Scanner scanner =new Scanner(System.in);
        Usuario u = new Usuario();
        Direccion d = new Direccion();
        Fecha f = new Fecha();

        
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

        DoubleList dolist = new DoubleList();
        dolist.addLast(u1);
        dolist.addLast(u2);
        dolist.addLast(u3);
        dolist.addLast(u4);
        dolist.addLast(u5);


        DoubleNode temp = dolist.first();
        while (temp!=null){
            System.out.println(temp.getData());
            temp =temp.getNext();
        }


        Usuario user = new Usuario();
        dolist.addFirst(user.user());
        dolist.addLast(user.user());
        
        temp = dolist.first();
        for(int i =0;i<3;i++){

            if (i==2){
                dolist.addAfter(temp, user.user());
            }
            temp=temp.getNext();
        }

        temp = dolist.first();
        while (temp!=null){
            System.out.println(temp.getData());
            temp =temp.getNext();
        }
        }

        sc.close();


}
}
