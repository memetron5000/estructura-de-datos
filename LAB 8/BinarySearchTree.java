import java.util.ArrayList;

public class BinarySearchTree extends BinaryTree {
    public Object min(BinaryTree T) {
    Node current = T.root();
    while (current.getLeft() != null) {
        current = current.getLeft();
    }
    return current.getData();
    }


    public Object max(BinaryTree T) {
        Node current = T.root();
        while (current.getRight() != null) {
            current = current.getRight();
        }
        return current.getData();
    }
    // public Object visit(Node v){
    //     return v.getData();
    // }

    
    // public void inorder(BinaryTree T, Node v) {
    //     ArrayList<Object> a = new ArrayList<>();

    //     if (T.hasLeft(v)) {
    //         inorder(T, T.left(v)); 
    //     }
    //     visit(v);
    //     a.add(v);
        
    //     if (T.hasRight(v)){
    //         inorder(T, T.right(v)); 
    //     }
    //     System.out.println(a);
    // }

    //------------------ TESTING -----------------------

    public void inorder(BinaryTree T, Node v) {
        ArrayList<Object> a = new ArrayList<>();  // Lista que acumula los nodos en orden
        inorderHelper(T, v, a);  // Iniciar el recorrido inorden
        System.out.println(a);  // Imprimir la lista al final
    }

    private void inorderHelper(BinaryTree T, Node v, ArrayList<Object> a) {
        if (v == null) return;  // Caso base: si el nodo es nulo, terminar
        if (T.hasLeft(v)) {
            inorderHelper(T, T.getLeft(v), a);  // Recursión en el subárbol izquierdo
        }
        a.add(visit(v));  // Visitar el nodo actual y agregarlo a la lista
        if (T.hasRight(v)) {
            inorderHelper(T, T.getRight(v), a);  // Recursión en el subárbol derecho
        }
    }



    public Object visit(Node v) {
        return v.getData();
    }

    public Node find(int k) {
        return searchTree(k, root); 
    }
    private Node searchTree(int key, Node v) {
        if (v == null) {
            return null; 
        }

        BSTEntry u = (BSTEntry) v.getData(); 

        if (key == u.getKey()) {
            return v; 
        } else if (key < u.getKey()) {
            return searchTree(key, v.getLeft()); 
        } else {
            return searchTree(key, v.getRight()); 
        }
    }

    public void insert(Object e, int k) {
        BSTEntry entry = new BSTEntry(e, k); 
        if (isEmpty()) {
            super.addRoot(entry); 
        } else {
            addEntry(root, entry); 
        }
    }

    private void addEntry(Node v, BSTEntry o) {
        BSTEntry temp = (BSTEntry) v.getData(); 
        Node newNode = new Node(o); 

        if (o.getKey() < temp.getKey()) { 
            if (hasLeft(v)) {
                addEntry(left(v), o); 
            } else {
                v.setLeft(newNode); 
            }
        } else {
            if (hasRight(v)) {
                addEntry(right(v), o); 
            } else {
                v.setRight(newNode); 
            }
        }
    }

    public Object remove(int k) {
        Node v = find(k); 
        if (v == null) {
            return null;
        }

        BSTEntry temp = (BSTEntry) v.getData(); 

        if (hasLeft(v) && hasRight(v)) { 
            Node w = predecessor(v); 
            v.setData(w.getData()); 
            super.remove(w); 
        } else { 
            super.remove(v); 
        }
        return temp; 
    }

    private Node predecessor(Node v) {
        Node temp = v.getLeft(); 
        return maxNode(temp); 
    }

    public Node maxNode(Node temp) {
        if (hasRight(temp)) {
            return maxNode(right(temp)); 
        } else {
            return temp; 
            
        }
    }
}
