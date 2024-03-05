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
        int inx = buscar(id);
        if (inx == -1){
            return false;
            
        }
        else{
            for (int j = inx; j < no_reg; ){
                registro[j]= registro[j+1];
            no_reg--;
            return true;
            }
        }
		return false;
    }

        // public void toFile() throws IOException{
        // String carpetadescargas = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + "Agenda.txt";
        // FileWriter fw= null;
        // PrintWriter pw = null;
        // try {
        //     fw = new FileWriter(carpetadescargas);
        //     pw = new PrintWriter(fw);
        //     for (Usuario i : registro) {
        //     pw.println(i);
        //     }
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }finally{
        //     fw.close();
        // }





        
        // try (FileReader fr = new FileReader(carpetadescargas);
        //      BufferedReader br = new BufferedReader(fr);
        //      FileWriter fw = new FileWriter(carpetadescargas, true);
        //      BufferedWriter bw = new BufferedWriter(fw)) {

        //     String linea;
        //     boolean encontrado = false;

        //     // Lectura del fichero
        //     while ((linea = br.readLine()) != null) {
        //         String linea1=;
        //         if (linea.isEmpty()) {
        //             // Agregar nueva línea al final del archivo
        //             String hola = "Agregando algo";
        //             bw.write(hola);
        //             bw.newLine();
        //             System.out.println("Se ha agregado nueva información al archivo.");
        //             encontrado = true;
        //             break;
        //         } 
        //         else {
        //             System.out.println(linea);
        //         }
        //     }

        //     if (!encontrado) {
        //         String hola = "Agregando algo";
        //         bw.write(hola);
        //         bw.newLine();
        //         System.out.println("Se ha agregado nueva información al final del archivo.");
        //     }

        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

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

        public void importar() throws IOException {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(carpetadescargas);
            br = new BufferedReader(fr);
            
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] userData = linea.split(","); // Assuming user data is comma-separated
                if (userData.length == 4) {
                    // Assuming user data format: ID,Nombre,Apellido,Edad
                    Long id = Long.parseLong(userData[0]);
                    String nombre = userData[1];
                    //String apellido = userData[2];
                    //int edad = Integer.parseInt(userData[3]);

                    Usuario newUser = new Usuario(nombre, id);
                    agregar(newUser);
                }
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
        for (int i = 0; i < no_reg; i++) {
            System.out.println(registro[i].toString());
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
            for (int i = 0; i < no_reg; i++) {
                pw.println(registro[i].toString());
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




    // public void importar() throws IOException {
    //     String carpetadescargas = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + "Agenda.txt";
    //     FileReader fr=null;
    //     BufferedReader br=null;
    //     try{
    //         fr= new FileReader(carpetadescargas);
    //         br= new BufferedReader(fr);
    //         String linea;
    //         while(br.readLine()!=null);
    //     }
    //     catch(IOException e){
    //         e.printStackTrace();
    //     }
    

















    //     String rutaArchivo = System.getProperty("user.home") + File.separator + "Downloads" + File.separator +"Agenda.txt";
    //     FileReader fr = new FileReader(rutaArchivo);
    //     try(BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
    //         String linea;
    //         while ((linea = br.readLine()) != null) {
    //             Usuario usuario = parsearLineaUsuario(linea);

    //             agregar(usuario);
    //         }
    //      }catch (IOException e) {
    //         e.printStackTrace;
    //     }
                
    //     }}

