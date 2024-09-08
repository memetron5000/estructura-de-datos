import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Mapa");

        Heap heap = new Heap(10);
        int[] A = {16,4,10,14,7,9,3,2,8,1};

        System.out.println("Arreglo inicial: " + Arrays.toString(A));

        System.out.println("Arreglo con max_heapify: " + Arrays.toString(A));

        heap.BUILD_MAX_HEAP(A);
        System.out.println("Array Construido con Build: " + Arrays.toString(A));

        //System.out.println(heap.HEAP_EXTRACT_MAX(A));

        System.out.println();

        heap.HEAPSORT(A);
        System.out.println("Arreglo ordenado: " + Arrays.toString(A));

        //heap.MAX_HEAP_INSERT(A, 12);

        //Heap.print(A);




    }
}