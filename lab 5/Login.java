import java.io.IOException;
import java.util.Scanner;

public class Login {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void welcome() {
        System.out.println("=".repeat(70));
        System.out.println(" ".repeat(10) + "Bienvenido al Sistema de Gestión de Empleados");
        System.out.println("=".repeat(70));
        System.out.printf("| %-3s | %-60s |\n", "0", "Salir del sistema");
        System.out.printf("| %-3s | %-60s |\n", "1", "Ingresar al sistema");
        System.out.println("=".repeat(70));
        System.out.println("Opción: ");

    }

    public static void displayAdmin() {
        System.out.println("\n" + "=".repeat(50));
        System.out.printf("|%-48s|\n", "Menú Administrador");
        System.out.println("=".repeat(50));
        System.out.printf("| %-3s | %-40s |\n", "0", "Volver al inicio");
        System.out.printf("| %-3s | %-40s |\n", "1", "Registrar nuevo usuario");
        System.out.printf("| %-3s | %-40s |\n", "2", "Cambiar contraseña");
        System.out.printf("| %-3s | %-40s |\n", "3", "Eliminar usuario");
        System.out.printf("| %-3s | %-40s |\n", "4", "Consultar bandeja de entrada");
        System.out.printf("| %-3s | %-40s |\n", "5", "Redactar mensaje");
        System.out.println("=".repeat(50));
        System.out.println("Opción: ");
    }

    public static void displayEmpleado() {
        System.out.println("\n" + "=".repeat(50));
        System.out.printf("|%-48s|\n", "Menú Empleado");
        System.out.println("=".repeat(50));
        System.out.printf("| %-3s | %-40s |\n", "0", "Salir del sistema");
        System.out.printf("| %-3s | %-40s |\n", "1", "Consultar bandeja de entrada");
        System.out.printf("| %-3s | %-40s |\n", "2", "Redactar mensaje");
        System.out.println("=".repeat(50));
        System.out.println("Opción: ");
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        int id;
        String pass;

        boolean w = true;
        while (w){
            welcome();
            int verif = Integer.parseInt(scanner.nextLine());
            if (verif == 1){
                System.out.println("Por favor ingrese su Identificación:");
                id = Integer.parseInt(scanner.nextLine());
                System.out.println("Por favor ingresar Contraseña:");
                pass = scanner.nextLine();
                String comp = Reader.comprobar_pass(id, pass);

                if (comp.equals("administrador"))  {
                    boolean a = true;
                    while (a){
                        int ingresado;
                        displayAdmin();
                        ingresado = Integer.parseInt(scanner.nextLine());
                        switch (ingresado) {
                            case 0:
                                System.out.println("Saliendo...");
                                a = false;
                                break;
                            case 1:
                                System.out.println("Ingrese la identificacion del nuevo usuario:");
                                int i = Integer.parseInt(scanner.nextLine());
                                System.out.println("Ingrese la nueva contraseña:");
                                String p = scanner.nextLine();
                                System.out.println("Cargo del nuevo usuario: (0) empleado (1) administrador");
                                String c = scanner.nextLine();
                                Reader.agregarUsuario(i, p, c);
                                break;
                            case 2:
                                System.out.println("Ingrese el id del usuario: ");
                                String  d = scanner.nextLine();
                                System.out.println("Ingresar la nueva contraseña: ");
                                String n = scanner.nextLine();
                                Reader.cambiarPass(d,n);
                                break;
                            case 3:

                            case 4:

                            case 5:

                            default:
                                System.out.print("error");
                        }

                    }

                }
                else if (comp.equals("empleado")){
                    int ingresado;
                    displayEmpleado();
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
                } else {
                    System.out.println(ANSI_RED + "Usuario o contraseña incorrecta." + ANSI_RESET);
                }
            }else{
                System.out.println("Saliendo...");
                w = false;

            }
        }
        scanner.close();

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

