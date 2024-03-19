public class Node extends ejec{
    private Object data;
    private  Node next;
    
    public Node(){
        data = null ;
        next = null ;
    }

    public Node(Object e){
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
