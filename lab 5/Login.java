import java.util.Scanner;

public class Login {

    public static void login(){
        Scanner scanner = new Scanner(System.in);


        int id;
        String pass;

        System.out.println("=============================");
        System.out.println("   BIENVENIDO AL SISTEMA     ");
        System.out.println("=============================");
        

        int intentos = 0;
        while (intentos < 3){
            
            System.out.println("Por favor ingrese su Identificación");
            id = Integer.parseInt(scanner.nextLine());
            System.out.println("Por favor ingresar Contraseña");
            pass = scanner.nextLine();
            String comp=Reader.comprobar_pass(id, pass);

            if (comp=="administrador")  {
                System.out.println("Bienvenido Administrador");
                int ingresado;
                System.out.println("Escribe el número \n0 para salir del sistema \n1 para revisar bandeja de entrada \n2 para enviar mensajes \n3 para registrar nuevos usuarios al sistema \n4 para cambiar contraseñas \n5 para eliminar usuarios");
                ingresado = scanner.nextInt();
                
                switch (ingresado) {
                    case 0:
                    System.out.println("Saliendo...");
                    case 1:
                        break;
                    case 2:
                    
                    case 3:
                        
                    case 4:
                    
                    case 5:
                    
                    default:
                        System.out.print("error");
                }
            }
            else if (comp=="empleado"){
                System.out.println("Bienvenido Empleado ");
                int ingresado;
                System.out.println("Escribe el número \n0 para salir del sistema \n1 para revisar bandeja de entrada \n2 para enviar mensajes");
                ingresado = scanner.nextInt();
                
                switch (ingresado) {
                    case 0:
                    System.out.println("Saliendo...");
                    break;
                    case 1:
                        break;
                    case 2:

                        break;
                    default:
                        System.out.print("error");
                }
            }
        scanner.close();
        }
    

    }
}



        // Scanner sc = new Scanner(System.in);
        // int id;
        // String pass;
        // System.out.println("INICIO DEL PROGRAMA \nPOR FAVOR INGRESE SU IDENTIFICACION");
        // id = Integer.parseInt(sc.nextLine());
        // System.out.println("POR FAVOR INGRESE SU CONTRASEÑA");
        // pass = sc.nextLine();

        // int intentos = 0;

        // while (intentos < 3){
        //     if (!Reader.comprobar_pass(id, pass).equals("true")){
        //         System.out.println("POR FAVOR INGRESE SU IDENTIFICACION");
        //         id = Integer.parseInt(sc.nextLine());
        //         System.out.println("POR FAVOR INGRESE SU CONTRASEÑA");
        //         pass = sc.nextLine();
        //         Reader.comprobar_pass(id, pass);
        //         intentos ++;
        //     } else {
        //         System.out.println("BIENVENIDO AL SISTEMA");
        //         intentos = 3;
        //     }

        // }

