public class Lista {
    Nodo head;

    public Lista() {
        this.head = null;
    }

    public void ordenarPorCedula() {
        if (head == null) {
            return;
        }

        boolean swapped;
        Nodo ptr1;
        Nodo lptr = null;

        do {
            swapped = false;
            ptr1 = head;

            while (ptr1.siguiente != lptr) {
                if (ptr1.data.cedula > ptr1.siguiente.data.cedula) {
                    // Intercambiar los datos de los nodos
                    User temp = ptr1.data;
                    ptr1.data = ptr1.siguiente.data;
                    ptr1.siguiente.data = temp;
                    swapped = true;
                }
                ptr1 = ptr1.siguiente;
            }
            lptr = ptr1;
        } while (swapped);
    }

    // Método para añadir nodos a la lista
    public void agregar(User data) {
        Nodo nuevoNodo = new Nodo(data);
        if (head == null) {
            head = nuevoNodo;
        } else {
            Nodo temp = head;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    // Método para imprimir la lista
    public void imprimirLista() {
        Nodo temp = head;
        while (temp != null) {
            System.out.println("Nombre: " + temp.data.nombre + ", Cedula: " + temp.data.cedula);
            temp = temp.siguiente;
        }
    }
}
