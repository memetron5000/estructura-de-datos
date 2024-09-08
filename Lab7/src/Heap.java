public class Heap {


    public int[] A;
    public int heap_size;

    public Heap(int capacity){
        A = new int[capacity];
        heap_size = 0;

    }

    public int Parent(int i){
        return (i-1)/2;
    }

    public static int left(int i){
        return 2 * i + 1;
    }

    public static int rigth(int i){
        return 2 * i + 2;
    }

    public void MAX_HEAPIFY(int[] A, int i, int heap_size) {
        int largest = i; // Inicialmente, consideramos la raíz como el mayor
        int l = left(i);
        int r = rigth(i);

        // Si el hijo izquierdo es mayor que la raíz
        if (l < heap_size && A[l] > A[largest]) {
            largest = l;
        }

        // Si el hijo derecho es mayor que el mayor encontrado hasta ahora
        if (r < heap_size && A[r] > A[largest]) {
            largest = r;
        }

        // Si el mayor no es la raíz, intercambiamos y aplicamos recursivamente MAX_HEAPIFY
        if (largest != i) {
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;

            // Recursivamente ajustar el subárbol afectado
            MAX_HEAPIFY(A, largest, heap_size);
        }
    }


/*
    public void MAX_HEAPIFY(int[] A, int i, int heap_size){
        int largest = i;
        int l = left(i);
        int r = rigth(i);

        if (l < heap_size && A[l] > A[largest]){
            largest = l;
        }
        if (r < heap_size && A[r] > A[largest]){
            largest = r;
        }

        if(largest != i){
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;

            MAX_HEAPIFY(A, largest, heap_size);
        }

    }
*/
    public void BUILD_MAX_HEAP(int[] A){
        int heap_size = A.length;
        for (int i =  heap_size/ 2 - 1; i >= 0; i --){
            MAX_HEAPIFY(A, i, heap_size);
        }

    }

    public void HEAPSORT(int[] A){
        BUILD_MAX_HEAP(A);

        int heap_size = A.length;
        for(int i = heap_size - 1; i > 0; i--){
            int temp = A[i];
            A[i] = A[0];
            A[0] = temp;
            heap_size --;

            MAX_HEAPIFY(A, 0, heap_size);

        }

    }


    //enqueue caso
    public void MAX_HEAP_INSERT(int[] A, int k){  // O(1)

        heap_size = A.length;
        heap_size++;

        int i = heap_size - 1;
        A[i] = k;
        while(i > 0 && A[Parent(i)] < A[i]){  //O(log n)
            int temp = A[Parent(i)];
            A[Parent(i)] = A[i];
            A[i] = temp;
            i = Parent(i);

        }
    }


    //dequeue caso
    public int HEAP_EXTRACT_MAX(int[] A){
        int max = A[0];
        int heap_size = A.length-1;
        A[0] = A[heap_size];
        heap_size --;
        MAX_HEAPIFY(A, 0, heap_size);
        return max;

    }

    public Object HEAP_MAXIMUN(){
        return A[0];
    }


    public static void print(int[] A){
        for(int i = 0; i < A.length/2; i++){
            System.out.println("Parent Node: " + A[i]);

            if(left(i) < A.length){
                System.out.println("Left Child Node: " + A[left(i)]);
            }

            if(rigth(i) < A.length){
                System.out.println("Rigth Child Node: " + A[rigth(i)]);
            }
            System.out.println();
        }
    }


}
