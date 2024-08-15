public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.agregar(new User("Juan", 12345678));
        lista.agregar(new User("Maria", 87654321));
        lista.agregar(new User("Carlos", 23456789));

        System.out.println("Lista antes de ordenar:");
        lista.imprimirLista();

        lista.ordenarPorCedula();

        System.out.println("\nLista después de ordenar:");
        lista.imprimirLista();
    }
}
