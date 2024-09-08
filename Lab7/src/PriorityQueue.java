import java.util.Arrays;

public class PriorityQueue {

    public static void main(String[] args){
        System.out.println("Colas de prioridad");

        // Crear un heap con capacidad para 11 elementos
        Heap heap = new Heap(11);
        int[] A = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};

        // Insertar el arreglo inicial en el heap
        System.arraycopy(A, 0, heap.A, 0, A.length);
        heap.heap_size = A.length; // Ajustar heap_size a la longitud del arreglo

        // Imprimir el heap inicial
        System.out.println("Heap inicial: " + Arrays.toString(heap.A));

        // Insertar un nuevo elemento y corregir el heap
        heap.MAX_HEAP_INSERT(heap.A, 6);

        // Imprimir el heap después de la inserción
        System.out.println("Heap después de insertar 6: " + Arrays.toString(heap.A));
        Heap.print(heap.A);

    }



}
