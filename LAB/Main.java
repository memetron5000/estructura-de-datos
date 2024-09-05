import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] A = {16, 4, 10, 14, 7, 6, 1, 2, 8, 15};

        System.out.println();
        System.out.println("HEAP INICIAL: " + Arrays.toString(A));
        System.out.println();

        // Crear un nuevo Heap y pasarle el arreglo
        Heap h = new Heap(A);

        // Ordenar el arreglo utilizando HeapSort
        h.heapSort();
        System.out.println("HEAPSORT: " + Arrays.toString(A));
        System.out.println();


        // Construir el Max-Heap completo
        h.buildMaxHeap(A);
        System.out.println("BUILD-MAX-HEAP: " + Arrays.toString(A));
        System.out.println();


        int size = A.length ;
        int tam = A.length;

        for (int i = 0; i < size; i++) {
            System.out.println();
            System.out.println("TAMAÑO DE LA COLA: " + tam);
            // Extraer el máximo elemento
            int maxElement = h.heapExtractMax();
            System.out.println("Elemento Maximo: " + maxElement);

            // Construir el Max-Heap con el arreglo restante
            h.buildMaxHeap(h.getA());
            System.out.println("HEAP: " + Arrays.toString(h.getA()));
            
            tam--;

         }
        
    }

}
