import java.util.Arrays;

public class ArrayQueue {

    Object[] data;
    int first;
    int rear;

    public ArrayQueue(int capacity){
        data = new Object[capacity];
        first = 0;
        rear = -1;
    }

    public int size(){
        if (rear == -1 && first == 0) {  // Cola vacía
            return 0;
        } else if (rear >= first) {
            return rear - first + 1;
        } else {
            return (data.length - first) + rear + 1;
        }
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void enqueue(Object e){
        if (size() < data.length){
            rear = (rear+1)%data.length;
            data[rear] = e;
        }
    }

    public Object dequeue(){
        if (isEmpty()){
            return null;
        } else{
            Object temp = data[first];
            data[first] = null;
            first = (first+1) % data.length;
            if (first == (rear + 1) % data.length) {  // Si la cola está vacía después de dequeue
                first = 0;
                rear = -1;
            }
            return temp;
        }
    }

    @Override
    public String toString() {
        return "Cola: " + Arrays.toString(data);
    }
}
