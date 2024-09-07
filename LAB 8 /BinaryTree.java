import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public Node root ;
    public int size ;

    public BinaryTree(){
        root = null ;
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

    public boolean isRoot(Node v) {
        return v == root;
    }

    public boolean isInternal(Node v) {
        return hasLeft(v) || hasRight(v);
    }

    public boolean hasLeft(Node v) {
        return v.getLeft() != null;
    }

    public boolean hasRight(Node v) {
        return v.getRight() != null;
    }

    public Node root() {
        return root;
    }

    public Node left(Node v) {
        return v.getLeft();
    }

    public Node right(Node v) {
        return v.getRight();
    }

    public Node parent(Node v) {
        if (isRoot(v)) {
            return null;
        } else {
            Queue<Node> Q = new LinkedList<>(); 
            Q.add(root); 

            Node temp = null;

            while (!Q.isEmpty()) {
                temp = Q.poll(); 

                
                if ((temp.getLeft() != null && temp.getLeft().equals(v)) ||
                    (temp.getRight() != null && temp.getRight().equals(v))) {
                    return temp; 
                }

                
                if (temp.getLeft() != null) {
                    Q.add(temp.getLeft());
                }

                if (temp.getRight() != null) {
                    Q.add(temp.getRight());
                }
            }

            return null; 
        }
    }
    
    public int depth(Node v) {
        if (isRoot(v)) {
            return 0; 
        } else {
            return 1 + depth(v.getParent()); 
        }
    }

    public int height(Node v) {
        if (!isInternal(v)) { 
            return 0;
        } else { 
            int h = Math.max(height(v.getLeft()), height(v.getRight()));
            return 1 + h;
        }
    }

    public void addRoot(Object e) {
        root = new Node(e);
        size = 1;
    }

    public void insertLeft(Node v, Object e) {
        Node left = new Node(e);
        v.setLeft(left);
        size++;
    }

    public void insertRight(Node v, Object e) {
        Node right = new Node(e);
        v.setRight(right);
        size++;
    }

    public void remove(Node v) {
        Node p = parent(v); 

        if (hasLeft(v) || hasRight(v)) {
            Node child;
            if (hasLeft(v)) {
                child = v.getLeft(); 
            } else {
                child = v.getRight(); 
            }

       
            if (p.getLeft() == v) {
                p.setLeft(child);
            } else {
                p.setRight(child);
            }

           
            v.setLeft(null);
            v.setRight(null);

        } else { 
            if (p.getLeft() == v) {
                p.setLeft(null);
            } else {
                p.setRight(null);
            }
        }

        size--; 
    }
    
}
