public class Main {


    // Juan 10101013 k=7
    // Pablo 10001011 k= 4
    // Maria 10101015 k= 9
    // Ana 1010000 k=2
    // Diana 10111105 k = 10
    // Mateo 10110005 k = 8
    public static void main(String[] args) {
        System.out.println("\n");
        BinarySearchTree uno = new BinarySearchTree();
        
        Node a = new Node();
        a.setData("Juan 10101013");
        uno.insert(a, 7);

        Node b = new Node();
        b.setData("Pablo 10001011");
        uno.insert(b, 4);

        Node c = new Node();
        c.setData("Maria 10101015");
        uno.insert(c, 9);

        Node d = new Node();
        d.setData("Ana 1010000");
        uno.insert(d, 2);

        Node e = new Node();
        e.setData("Diana 10111105");
        uno.insert(e, 10);

        Node f = new Node();
        f.setData("Mateo 10110005");
        uno.insert(f, 8);

        uno.showTree();
        System.out.println("\n");

        System.out.println("insertar");
        Node g = new Node();
        g.setData("Santiago 10104323");
        uno.insert(g, 14);
        uno.showTree();
        System.out.println("\n");

        System.out.println("remover");
        uno.remove(9);
        uno.showTree();
        System.out.println("\n");

        System.out.println("encontrar");
        System.out.println(uno.find(4));
        System.out.println("\n");


        // PRUEBA
        //a.setRight(f);

        System.out.println("maximo");
        System.out.println(uno.max(uno));
        System.out.println("\n");

        System.out.println("minimo");
        System.out.println(uno.min(uno));
        System.out.println("\n");
        
        System.out.println("inorden");
        uno.inorder(uno, uno.root());




    }
}
