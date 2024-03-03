import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.math.*;
public class Agenda extends ejecutar{
    private int  no_reg;
    private Usuario[] registro;
    String carpetadescargas =System.getProperty("user.home")+File.separator+"Downloads"+"/"+"Agenda.txt";

    public Agenda(int capacity) {
        registro = new Usuario[capacity];
        no_reg= 0;
    }
    public boolean agregar(Usuario u){
        
        // verifica si el usuario ya esta en la agenda
        if (buscar(Math.toIntExact(u.getID())) != -1) {
            return false; // si ya esta agregado
        }
        //verifica si hay espacio en el arreglo
        if (no_reg < registro.length){ 
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

        public void archivodesc() {
        String carpetadescargas = System.getProperty("user.home") + File.separator + "Downloads" + File.separator + "Agenda.txt";

        try (FileReader fr = new FileReader(carpetadescargas);
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(carpetadescargas, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            String linea;
            boolean encontrado = false;

            // Lectura del fichero
            while ((linea = br.readLine()) != null) {
                String linea1=;
                if (linea.isEmpty()) {
                    // Agregar nueva línea al final del archivo
                    String hola = "Agregando algo";
                    bw.write(hola);
                    bw.newLine();
                    System.out.println("Se ha agregado nueva información al archivo.");
                    encontrado = true;
                    break;
                } 
                else {
                    System.out.println(linea);
                }
            }

            if (!encontrado) {
                String hola = "Agregando algo";
                bw.write(hola);
                bw.newLine();
                System.out.println("Se ha agregado nueva información al final del archivo.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}

