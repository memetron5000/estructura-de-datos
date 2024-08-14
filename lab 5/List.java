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

    public void addLast(Object e){
        Node n =  new Node(e);
        if (isEmpty()){
            head = n;
            tail = n;
        } else{
            tail.setNext(n);
            tail = n;
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


    // Metodo especifico para Users

    public void insertar(String name, int cedula){
        Users one = new Users(name, cedula);
        Node n = new Node(one);

        if (isEmpty()){
            head = n;
        } else{
            Node temp = head;
            Node ant = null;

            //Desectructuracion
            Users user = (Users) head.getData();

            while (temp != null && user.getCedula() < cedula){
                ant = temp;
                temp = temp.getNext();
            }

            if (temp == null){
                addLast(one);
            } else{
                if (ant == null){
                    addFirst(one);
                }else {
                    ant.setNext(n);
                    n.setNext(temp);
                }
            }

        }

    }

    public void mostrarList(){
        Node temp = head;
        while(temp != tail){
            System.out.println(temp.getData());
<<<<<<< HEAD
>>>>>>> 28c799d (refactoring structure)
=======
>>>>>>> 960c569 (failure fetch)
            temp = temp.getNext();
        }
        System.out.println(temp.getData());
    }
}
