import java.util.Arrays;

public class ArrayStack {
    Object[] data;
    int top;

    public ArrayStack(int capacity){
        data = new Object[capacity];
        top = -1;
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void push(Object e){
        if (top < data.length-1){
            top++;
            data[top] = e;
        } else{
            System.out.println("Stack overflow");
        }

    }

    public Object pop(){
        if (!isEmpty()){
            Object temp = data[top];
            data[top] = null;
            top--;
            return temp;
        } else{
            return null;
        }
    }

    public Object top(){
        if (!isEmpty()){
            return data[top];
        }else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "pila: " + Arrays.toString(data);
    }
}
