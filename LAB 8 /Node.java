public class Node {

    private Object data;
    private Node right;
    private Node left;
    private Node parent; 

    public Node() {
        data = null;
        right = null;
        left = null;
        parent = null; 
    }

    public Node(Object d) {
        data = d;
        right = null;
        left = null;
        parent = null; 
    }

    public void setData(Object d) {
        data = d;
    }

    public void setRight(Node n) {
        right = n;
        if (n != null) {
            n.setParent(this); 
        }
    }

    public void setLeft(Node p) {
        left = p;
        if (p != null) {
            p.setParent(this); 
        }
    }

    public Object getData() {
        return data;
    }

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getParent() {
        return parent; 
    }

    public void setParent(Node p) {
        parent = p;
    }
}
