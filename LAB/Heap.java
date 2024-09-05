public class Heap {
    private int[] A;
    private int size;

    public Heap(int capacity) {
        this.A = new int[capacity];
        this.size = 0;
    }
    public Heap(int[] B) {
        this.A = B;
        this.size = B.length;
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    public int left(int i) {
        return 2 * i + 1;
    }

    public int right(int i) {
        return 2 * i + 2;
    }

    public void maxHeapify(int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;

        if (l < size && this.A[l] > this.A[largest]) {
            largest = l;
        }
        if (r < size && this.A[r] > this.A[largest]) {
            largest = r;
        }

        if (largest != i) {
            int temp = this.A[i];
            this.A[i] = this.A[largest];
            this.A[largest] = temp;

            maxHeapify(largest);  
        }
    }

    public void buildMaxHeap(int[] B) {
        this.A = B; 
        this.size = B.length;

        for (int i = size / 2 - 1; i >= 0; i--) {
            maxHeapify(i);
        }
    }

    public void heapSort() {
        buildMaxHeap(A);

        for (int i = A.length - 1; i > 0; i--) {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            size--;
            maxHeapify(0);
        }
    }

    public void maxHeapInsert(int K) {
        A[size] = K;
        int i = size;
        size++;

        while (i > 0 && A[parent(i)] < A[i]) {
            int temp = A[parent(i)];
            A[parent(i)] = A[i];
            A[i] = temp;
            i = parent(i);
        }
    }

    public int heapExtractMax() {
        int max = A[0];

        A[0] = A[size - 1];
        A[size - 1] = 0;

        size--;

        maxHeapify(0);

        return max;
    }

    public int heapMaximum() {
        return A[0];
    }

    public int[] getA() {
        return A;
    }

    public int getSize() {
        return size;
    }
}
