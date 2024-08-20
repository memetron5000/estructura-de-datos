import java.util.Scanner;

public class Login {
    
    

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void welcome() {
        String formateo="";
        for (int i = 0; i < 7;i++){
            formateo += "==========";
        }
        String formateo1="";
        for (int i = 0; i < 10;i++){
            formateo1 += " ";
        }
        System.out.println(formateo);
        System.out.println(formateo1 + "Bienvenido al Sistema de Gestión de Empleados");
        System.out.println(formateo);
        System.out.printf("| %-3s | %-60s |\n", "0", "Salir del sistema");
        System.out.printf("| %-3s | %-60s |\n", "1", "Ingresar al sistema");
        System.out.println(formateo);
        System.out.println("Opción: ");

    }

    public static void displayAdmin() {
        String formateo2="";
        for (int i = 0; i < 5;i++){
            formateo2 += "==========";
        }
        System.out.println("\n" + formateo2);
        System.out.printf("|%-48s|\n", "Menú Administrador");
        System.out.println(formateo2);
        System.out.printf("| %-3s | %-40s |\n", "0", "Volver al inicio");
        System.out.printf("| %-3s | %-40s |\n", "1", "Registrar nuevo usuario");
        System.out.printf("| %-3s | %-40s |\n", "2", "Cambiar contraseña");
        System.out.printf("| %-3s | %-40s |\n", "3", "Eliminar usuario");
        System.out.printf("| %-3s | %-40s |\n", "4", "Consultar bandeja de entrada");
        System.out.printf("| %-3s | %-40s |\n", "5", "Redactar mensaje");
        System.out.println(formateo2);
        System.out.println("Opción: ");
    }

    public static void displayEmpleado() {
        String formateo2="";
        for (int i = 0; i < 5;i++){
            formateo2 += "==========";
        }
        System.out.println("\n" + formateo2);
        System.out.printf("|%-48s|\n", "Menú Empleado");
        System.out.println(formateo2);
        System.out.printf("| %-3s | %-40s |\n", "0", "Salir del sistema");
        System.out.printf("| %-3s | %-40s |\n", "1", "Consultar bandeja de entrada");
        System.out.printf("| %-3s | %-40s |\n", "2", "Redactar mensaje");
        System.out.println(formateo2);
        System.out.println("Opción: ");
    }

    public static String saberName(int id){

        DoubleNode head = Main.datos.first();
        while(head != null){

            if(((User)head.getData()).getCedula() == id){
                return ((User) head.getData()).getName().replace("-", " ");
            }
            head = head.getNext();
        }
        return "";
    }

    public static void login() {
        String formateo2="";
        for (int i = 0; i < 5;i++){
            formateo2 += "==========";
        }
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
                                System.out.println("Ingrese el nombre del nuevo usuario: \n Ejemplo: Juan Perez \n");
                                String na = scanner.nextLine();
                                System.out.println("Ingrese la identificacion del nuevo usuario:");
                                int i = Integer.parseInt(scanner.nextLine());
                                System.out.println("Ingrese la nueva contraseña:");
                                String p = scanner.nextLine();
                                System.out.println("Cargo del nuevo usuario: (0) empleado (1) administrador");
                                String c = scanner.nextLine();
                                Reader.agregarUsuario(na, i, p, c);
                                break;
                            case 2:
                                System.out.println("Ingrese el id del usuario: ");
                                String  cedu = scanner.nextLine();
                                System.out.println("Ingresar la nueva contraseña: ");
                                String contra = scanner.nextLine();
                                Reader.cambiarPass(cedu, contra);
                                break;
                            case 3:
                                System.out.println("Ingrese id del usuario a eliminar: ");
                                String u = scanner.nextLine();
                                Reader.elimiarUsuario(u);
                                break;
                            case 4:
                                boolean casos = true;
                                case4(scanner, id, casos);
                                break;

                            case 5:
                                System.out.println("\n" + formateo2);
                                System.out.printf("|%-48s|\n", "Redactar Nuevo Mensaje");
                                System.out.println(formateo2);

                                System.out.println("Ingrese la cédula del destinatario:");
                                System.out.print("> ");
                                String cedula = scanner.nextLine();

                                System.out.println("\nIngrese el título del mensaje:");
                                System.out.print("> ");
                                String title = scanner.nextLine();

                                System.out.println("\nIngrese el contenido del mensaje:");
                                System.out.print("> ");
                                String msm = scanner.nextLine();

                                Inbox.enviarMensaje(cedula, title, msm, saberName(id));

                                break;

                            default:
                                System.out.print("error");
                        }

                    }

                }
                else if (comp.equals("empleado")){
                    boolean a = true;
                    while (a){
                        int ingress;
                        displayEmpleado();
                        ingress = Integer.parseInt(scanner.nextLine());
                        switch (ingress) {
                            case 0:
                                System.out.println("Saliendo...");
                                a = false;
                                break;
                            case 1:
                                boolean cases = true;
                                case4(scanner, id, cases);
                                break;
                            case 2:
                                System.out.println("\n" + formateo2);
                                System.out.printf("|%-48s|\n", "Redactar Nuevo Mensaje");
                                System.out.println(formateo2);

                                System.out.println("Ingrese la cédula del destinatario:");
                                System.out.print("> ");
                                String cedula = scanner.nextLine();

                                System.out.println("\nIngrese el título del mensaje:");
                                System.out.print("> ");
                                String title = scanner.nextLine();

                                System.out.println("\nIngrese el contenido del mensaje:");
                                System.out.print("> ");
                                String msm = scanner.nextLine();

                                Inbox.enviarMensaje(cedula, title, msm, saberName(id));

                                break;

                            default:
                                System.out.print("error");
                        }

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

    private static void case4(Scanner scanner, int id, boolean casos) {
        while (casos){
            Inbox.mostrarBandejaEntrada(String.valueOf(id));

            System.out.printf("| %-3s | %-40s |\n", "0", "Atras");
            System.out.printf("| %-3s | %-40s |\n", "1", "Volver al menu");
            String back = scanner.nextLine();
            if (back.equals("1")){
                casos = false;
            }
        }
    }
}

