import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.*;
public class Agenda extends ejecutar{
    private int  no_reg;
    private Usuario[] registro;
    String carpetadescargas =System.getProperty("user.home")+File.separator+"Downloads"+"/"+"Agenda.txt";

    public Agenda(int capacity) {
        registro = new Usuario[capacity];
        no_reg= 0;
    }

    Long[] listid =new Long[5];
    int cont=0;
    public boolean agregar(Usuario u){
        listid[cont]=u.getID();
        boolean verif  = false;
        cont++;
        // verifica si el usuario ya esta en la agenda
        if (buscar(Math.toIntExact(u.getID())) != -1) {
            verif= false; // si ya esta agregado
        }
        //verifica si hay espacio en el arreglo
        if (no_reg < registro.length && verif==false) { 
            registro[no_reg] = u; //Agrega al usuario
            no_reg++;
            return true;  // confirma que se agrego el usuario
        }else{
            return false; // no hay espacio
        }
        
    }
    public int buscar(int id){
        int i=0;
        int ret=0;//comprobacion
        while ( i< no_reg &&registro[i].getID() != id) {
            if( i == no_reg){
                ret=-1;
            }
            else{
                ret=i;
            }
            i++; 
            
        }
        return ret;
    
    }

    public boolean eliminar(int id){
        boolean comp=false;
        for(int i=0 ; i<userdata.size() ; i++) {
            String tem=userdata.get(i);//obtiene cada linea
            String[] temp =tem.split("\\s");//separa por espacios
            if(Integer.parseInt(temp[4])==(id)){
                userdata.remove(i); // esto esta malo hp
                comp=true;
            }
        }
        
		return comp;
    }

        public void toFileS() throws IOException{
        String carpetadescargas = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + "Agenda.txt";
        FileWriter fw= null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(carpetadescargas);
            pw = new PrintWriter(fw);
            for (Usuario i : registro) {
            pw.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            fw.close();
        }
    }

    public Long search_id(Long id){
        Long j=Long.valueOf(0);
        long fin=0;
        for(Long i :listid){
            if(i.equals(id)){
                fin=j;
            }
            else{
                j++;
            }
            
        }
        return fin;
    }

        private ArrayList<String> userdata = new ArrayList<String>();
        public void importar() throws IOException {
        String carpetadescargas = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + "Agenda.txt";
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(carpetadescargas);
            br = new BufferedReader(fr);
            
            String linea;
            while ((linea = br.readLine()) != null) {
                userdata.add(linea);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
            if (fr != null) {
                fr.close();
            }
        }
    }
    

    public void printUsers() {
        for (String i : userdata) {
            System.out.println(i);
        }
    }

    public boolean deleteById(Long id) {
        int index = buscar(Math.toIntExact(id));
        if (index != -1) {
            for (int j = index; j < no_reg - 1; j++) {
                registro[j] = registro[j + 1];
            }
            no_reg--;
            return true;
        }
        return false;
    }

        public void toFile() throws IOException {
        String outputFile = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + "Agenda2.txt";
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(outputFile);
            pw = new PrintWriter(fw);
            for(String i : userdata){
                pw.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                fw.close();
            }
        }
    }

}
