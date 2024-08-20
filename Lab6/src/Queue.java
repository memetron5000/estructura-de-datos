public class Queue {

    List data;

    public Queue(){
        data = new List();
    }

    public int size(){
        return data.size();
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public void enqueue(Object e){
        data.addLast(e);
    }

    public Object dequeue(){
        return data.removeFirst();
    }

    public Object first(){
        return data.First().getData();
    }

}
