public class Main {
    public static void main(String[] args) {

        ArrayStack pila = new ArrayStack(5);

        for(int i = 2; i <= 10; i += 2){
            pila.push(i);
        }

        int a = 0;
        while (a<5){
            System.out.println(pila);
            System.out.println(pila.pop());
            a++;
        }


    }
}