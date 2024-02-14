public class Fecha extends Usuario{
    private short dd;
    private short mm;
    private short aa;

    public Fecha(){
    
    }

    public Fecha (short dd, short mm, short aa) {
        this.dd = dd;
        this.mm = mm;
        this.aa = aa;
    }

    public void setDia(short dd) {
        this.dd = dd;
    }
    public void setMes(short mm) {
        this.mm = mm;
    }
    public void setA(short aa) {
        this.aa = aa;
    }

    public short getDia(){
        return dd;
    }
    public short getMes(){
        return mm;
    }
    public short getA(){
        return aa;
    }
}