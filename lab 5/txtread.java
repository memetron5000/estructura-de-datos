

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;



public class txtread extends ejec{
    

    //todo      lectura de archivos
    public static void leerArchivo(String carpetadescargas) {
        BufferedReader lector = null;
        try {
            DoubleList list = new DoubleList();
            lector = new BufferedReader(new FileReader(carpetadescargas));
            String linea;
            
            // Leer cada línea del archivo
            while ((linea = lector.readLine()) != null) {
                String[] arreglo = linea.split(",");
                System.out.println(arreglo.length);
                
                if (arreglo.length > 1) {
                    System.out.println(arreglo[2]);
                } else {
                    System.out.println("El arreglo no tiene suficientes elementos.");
                }
                for (String elemento : arreglo) {
                    System.out.println(elemento);
                }
                //! guardar en nodos
                
                if (list.isEmpty()) {
                    list.addFirst(arreglo);
                }
                else{
                    list.addLast(arreglo);
                }
                
            }
            //imprime lista
            DoubleNode temp= list.first();
            while (temp!=null){
                System.out.println(1);
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Cerrar el lector para liberar recursos
            if (lector != null) {
                try {
                    lector.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
    }

    

    
    



    
}


