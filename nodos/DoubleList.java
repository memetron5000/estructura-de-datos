public class DoubleList {
    private DoubleNode head ;
    private DoubleNode tail ;
    private int size ;

    public void DoubleList(){
        head = null ;
        tail = null ;
        size = 0 ;
    }

    public int size(){
        return size ;
    }

    public boolean isEmpty(){
        return size==0 ;
    }

    public DoubleNode first(){
        return head ;
    }

    public DoubleNode last(){
        return tail ;
    }

    public void addFirst(Object e){
        DoubleNode n = new DoubleNode(e) ;
        if (isEmpty()){
            head = n ;
            tail = n ;
        } else {
            n.setNext(head);
            head.setPrev(n);
            head = n ;
            size++ ;
        }
    }

    public void addLast(Object e){
        DoubleNode n = new DoubleNode(e) ;
        if (isEmpty()){
            head = n ;
            tail = n ;
        } else {
            tail.setNext(n);
            n.setPrev(tail);
            tail = n ;
            size++ ;
        }
    }

    public Object removeFirst(){
        if (isEmpty()){
            return null ;
        } else{
            DoubleNode temp = head ;
            head = temp.getNext() ;
            temp.setNext(null) ;
            head.setPrev(null);
            size-- ;
            return temp.getData() ;
        }
    }

    public Object removeLast(){
        if (isEmpty()){
            return null ;
        } else{
            DoubleNode temp = tail ;
            tail = temp.getPrev() ;
            tail.setNext(null) ;
            temp.setPrev(null);
            size-- ;
            return temp.getData() ;
        }
    }

    public Object remove(DoubleNode n){
        if (n==head){
            return removeFirst() ;
        } else if (n == tail){
            return removeLast() ;
        } else{
            Object e = n.getData() ;
            DoubleNode p = n.getPrev() ;
            DoubleNode nx = n.getNext() ;
            p.setNext(nx);
            nx.setPrev(p);
            n.setNext(null);
            n.setPrev(null);
            size--;
            return e;
        }
    }

    public void addBefore(DoubleNode n, Object e){
        if (n == head){
            addFirst(e);
        } else{
            DoubleNode m = new DoubleNode(e) ;
            DoubleNode p = n.getPrev() ;
            p.setNext(m);
            m.setPrev(p);
            m.setNext(n);
            n.setPrev(m);
            size++ ;
        }
    }

    public void addAfter(DoubleNode n, Object e) {
        if (n == tail) {
            addLast(e);
        } else {
            DoubleNode m = new DoubleNode(e);
            DoubleNode nx = n.getNext();
            n.setNext(m);
            m.setPrev(n);
            m.setNext(nx);
            nx.setPrev(m);
            size++; 
        }
    }
}
