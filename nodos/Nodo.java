public class Nodo{
    private Node head;
    private  Node next;
    
    public void Node(){
        data = null
        next = null
    }

    public void Node(Object e){
        this.data = e ;
        this.next = null;
    }

    public void setData(Object e){
        this.data = e;
    }
    public void setNext(Node n){
        this.next = n ;
    }

    public Object getData(){
        return data ;
    }
    public Node getNext(){
        return next ;
    }

}