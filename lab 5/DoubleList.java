public class DoubleList{
    private DoubleNode head ;
    private DoubleNode tail ;
    private int size ;

    public DoubleList(){
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
        if (head == null){
            head = n ;
            size++;
            tail = n ;
        } else {
            DoubleNode ss = head;
            while (ss.getNext() != null){
                ss = ss.getNext();
            }
            ss.setNext(n);
            n.setPrev(ss);
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

    public Object addBefore(DoubleNode n, Object e){
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
            return e;
        }
        return null;
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

    public void sort() {
        if (head == null) {
            return;
        }
        boolean intercambio;

        do {
            intercambio = false;
            DoubleNode current = head;

            while (current != null && current.getNext() != null) {
                DoubleNode next = current.getNext();

                // Comparar datos de los nodos
                if (((User)current.getData()).getCedula() > ((User)next.getData()).getCedula()) {
                    // Realizar el intercambio
                    DoubleNode prev = current.getPrev();
                    DoubleNode nextNext = next.getNext();

                    if (prev != null) {
                        prev.setNext(next);
                    } else {
                        head = next;
                    }

                    if (nextNext != null) {
                        nextNext.setPrev(current);
                    } else {
                        tail = current;
                    }

                    next.setPrev(prev);
                    current.setNext(nextNext);
                    next.setNext(current);
                    current.setPrev(next);

                    intercambio = true;
                }

                current = current.getNext();
            }
        } while (intercambio);
    }


    public void showList(){
        DoubleNode a = head;
        while (a != tail){
            System.out.println(a.getData());
            a = a.getNext();
        }
        System.out.println(a.getData());
    }
}
