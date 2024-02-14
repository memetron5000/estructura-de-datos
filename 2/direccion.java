public class direccion extends Usuario {

    private String calle;
    private String nomenclatura;
    private String barrio;
    private String ciudad;
    private String edificio;
    private String apto;

    public void Direccion (String calle, String nomenclatura, String barrio, String ciudad, String edificio, String apto){
        this.calle = calle;
        this.nomenclatura = nomenclatura;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.edificio = edificio;
        this.apto = apto;
    }

    public String getCalle(){
        return calle;
    }
    public void setCalle(String c){
        this.calle = c;
    }

    public String getNomencaltura(){
        return nomenclatura;
    }
    public void setNomenclatura(String n){
        this.nomenclatura = n;
    }

    public String getBarrio(){
        return barrio;
    }
    public void setBarrio(String b){
        this.barrio = b;
    }
    
    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String ci){
        this.ciudad = ci;
    }

    public String getEdificio(){
        return edificio;
    }
    public void setEdificio(String e){
        this.edificio = e;
    }

    public String getApto(){
        return apto;
    }
    public void setApto(String a){
        this.apto = a;
    }

    
    
    
    
}
