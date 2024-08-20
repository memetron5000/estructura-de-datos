public class List {

    private Node head;
    private Node tail;
    private int size;

    public void List(){
        head = null;
        tail = null;
        size = 0;

    }

    public int size(){
        return size;

    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        } else{
            return false;
        }

    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node First(){ // retorna un node
        return head;
    }

    public Node Last(){
        return tail;

    }

    public void addFirst(Object e){
        Node n = new Node(e);
        if (isEmpty()){
            head = n;
            tail = n;
        }else{
            n.setNext(head);
            head = n;
        }
        size++;
    }

    public void addLast(Object n){
        Node e = new Node(n);
        if (isEmpty()){
            head = e;
            tail = e;
        } else{
            tail.setNext(e);
            tail = e;
        }
        size++;

    }

    public Object removeFirst(){ //retorna un object
        if (!isEmpty()){
            Node temp = head;
            // reescribimos el enlace al siguiente nodo
            head = temp.getNext();
            temp.setNext(null); // quitamos la conexion del primer nodo al sgt
            size --;

            return temp.getData();
        }else{
            return null;
        }

    }
    public Object removeLast(){

        if (size == 1){
            return removeFirst();
        } else{
            Node temp = tail;
            Node anterior = head;
            //cuando anterior sea igual al tail, quedara con el valor anterior
            while (anterior.getNext() != tail){
                anterior = anterior.getNext();
            }
            //desconectamos el penultimo elemento del ultimo con (null)
            anterior.setNext(null);

            tail = anterior;
            size --;
            return temp.getData();
        }

    }

    public void mostrarList(){
        Node temp = head;
        while(temp != tail){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        System.out.println(temp.getData());
    }


}
