
public class BinarySearchTree extends BinaryTree {
    public Object min(BinaryTree T, Node v) {
        if (T.hasLeft(v)) {
            return min(T, T.left(v));
        } else {
            return v.getData(); 
        }
    }

    public Object max(BinaryTree T, Node v) {
        if (T.hasRight(v)) {
            return max(T, T.right(v)); 
        } else {
            return v.getData(); 
        }
    }
    private void visit(Node v) {
        
        System.out.println(v.getData());
    }

    public void inorder(BinaryTree T, Node v) {
        if (T.hasLeft(v)) {
            inorder(T, T.left(v)); 
        }

        visit(v); 

        if (T.hasRight(v)) {
            inorder(T, T.right(v)); 
        }
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

    private Node maxNode(Node temp) {
        if (hasRight(temp)) {
            return maxNode(right(temp)); 
        } else {
            return temp; 
        }
    }
}
