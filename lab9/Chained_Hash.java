public class Chained_Hash{
    DoubleList lista = new DoubleList();
    private double A= (Math.sqrt(5)-1)/2;
    private Object [] hash;
    
    public Chained_Hash(int size) {
        Object [] hash=new Object[size];
        this.hash = hash;
    }

    public int ChainMul(DoubleNode nodo, int key){
        int val= (int)nodo.getData();
        double keyfin = Math.floor(11*((val*A)%1));
        return (int) keyfin;
    }
    
    public int ChainDiv(DoubleNode nodo, int key){
        int val= (int)nodo.getData();
        int keyfin = val%11;
        return keyfin;
    }
    public Object ChainInsert(DoubleNode nodo,int key){
        hash[key]=lista.addLast(nodo);
        return hash[key];
    }
}