public class Master {

    public static void main(String[] args){
        ArrayQueue cola = new ArrayQueue(5);

        for(int i = 2; i <= 10; i += 2){
            cola.enqueue(i);
        }
        int a = 0;
        while (a < 5) {
            System.out.println(cola);
            System.out.println(cola.dequeue());
            a++;
        }


    }
}
