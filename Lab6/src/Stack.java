public class Stack {

    List data;

    public Stack(){
        data = new List();
    }

    public int size(){
        return data.size();
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public void push(Object e){
        data.addFirst(e);
    }

    public Object pop(){
        return data.removeLast();
    }

    public Object top(){
        if (!isEmpty()){
            return data.First().getData();
        }else {
            return null;
        }
    }

}
