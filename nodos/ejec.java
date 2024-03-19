import java.util.Scanner;
public class ejec {
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
            //codigo desde aca

        }

        sc.close();
}
}
