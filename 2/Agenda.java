import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;
public class Agenda {
    String carpetadescargas =System.getProperty("user.home")+File.separator+"Downloads"+"/"+"archivo.txt";
    try (FileReader fr = new FileReader(carpetadescargas)){
        BufferedReader br = new BufferedReader(fr);
     // Lectura del fichero
        String linea;
        while((linea=br.readLine())!=null)
        System.out.println(linea);
    }
    catch(Exception e){
        e.printStackTrace();
    }
    private int  no_reg;
    private Usuario[] registro;

    public Agenda(int capacity) {
        registro = new Usuario[capacity];
        no_reg= 0;
    }
    public boolean agregar(Usuario u){
        // verifica si el usuario ya esta en la agenda
        if (buscar(u.getID()) != -1) {
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
        // verifica si el usuario ya esta en la agenda
        if (buscar(u.getID()) != -1) {
            return false; // si ya esta agregado
        }
    }
    public int buscar(int id){
        for (int i = 0; i< no_reg; i++){
            if (registro[i].getID == id){
                return i;
            }

        }
        return -1;
    
    }}

    