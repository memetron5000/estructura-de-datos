public class BSTEntry extends BinaryTree {

    private Object data;
    private int k;
    

    public BSTEntry(Object e, int k){
        data = e ;
        this.k = k;
    }

    public void setData(Object d){
        data = d ;
    }
    
    public void setKey(int k){
        this.k  = k ;
    }
    
    public Object getData(){
        return data ;
    }
    
    public int getKey(){
        return this.k ;
    }
    
    
}
