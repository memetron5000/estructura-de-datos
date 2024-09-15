import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        DoubleNode nodo = new DoubleNode();
        


        System.out.println("ingrese 1 o 2 respectivamente para seleccionar la prueba");
        int prueba = scanner.nextInt();

        if(prueba == 1){
            Chained_Hash hash=new Chained_Hash(20);
            for (int i = 0; i <10;i++){
                list[i]=random.nextInt(101);
            }
            
        }
        else if (prueba == 2){

        }

        scanner.close();
    }
}
