import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TurnoUsuario {
    Queue registro;
    Stack usuarioAtendido;

    TurnoUsuario(){
        registro = new Queue();
        usuarioAtendido = new Stack();
    }

    public void registrar(Usuario u){
        registro.enqueue(u);
    }

    public Object atenderSiguiente(){
        Object temp = registro.first();
        registro.dequeue();
        usuarioAtendido.push(temp);
        return temp;
    }

    public void toFile() {
        try{
            File file = new File("Lab6/src/usuariopendientes.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            BufferedWriter escritor = new BufferedWriter(new FileWriter("Lab6/src/usuariopendientes.txt"));
            int con = 0;
            int temp = registro.size();
            while (con < temp){
                escritor.write(((Usuario)registro.first()).getNombre() + " " + ((Usuario)registro.first()).getId());
                escritor.newLine();
                registro.dequeue();
                con++;
            }
            escritor.close();
        }catch (IOException e){
            System.out.println("Ha ocurrido un problema: " + e);
        }


        //Segunda parte
        try {
            File file = new File("Lab6/src/usuariosatendidos.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            BufferedWriter escritor1 = new BufferedWriter(new FileWriter("Lab6/src/usuariosatendidos.txt"));
            int a = 0;
            int temp1 = usuarioAtendido.size();
            while (a < temp1){
                Usuario u = ((Usuario)usuarioAtendido.pop());
                escritor1.write( u.getNombre()+ " " + u.getId());
                escritor1.newLine();
                a++;
            }
            escritor1.close();
        }catch (IOException e){
            System.out.println("Ha ocurrido un error: " + e);
        }
    }


}
