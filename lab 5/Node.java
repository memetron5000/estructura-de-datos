public class Node{
    private User data;
    private  Node next;
    
    public Node(){
        data = null ;
        next = null ;
    }

    public Node(User e){
        this.data = e ;
        this.next = null;
    }

    public void setData(Object e){
        this.data = (User) e;
    }
    public void setNext(Node n){
        this.next = n ;
    }

    public User getData(){
        return data ;
    }
    public Node getNext(){ 
        return next ;
    }

}
