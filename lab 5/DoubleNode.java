public class DoubleNode{
    private Object data ;
    private DoubleNode next ;
    private DoubleNode prev ;

    public DoubleNode(){
        data = null ;
        next = null ;
        prev = null ;
    }

    public DoubleNode(Object d){
        data = d ;
        next = null ;
        prev = null ;
    }
    
    public void setData(Object d){
        data = d ;
    }

    public void setNext(DoubleNode n){
        next = n ;
    }

    public void setPrev(DoubleNode p){
        prev = p ;
    }

    public Object getData(){
        return data ;
    }

    public DoubleNode getNext(){
        return next ;
    }

    public DoubleNode getPrev(){
        return prev ; 
    }

    
}
