public class Testing {
    public static void main(String[] args){

        TurnoUsuario banco = new TurnoUsuario();

        Usuario p1 = new Usuario("Kevin", 1);
        Usuario p2 = new Usuario("Jesus", 2);
        Usuario p3 = new Usuario("Cachon", 3);
        Usuario p4 = new Usuario("Santiago", 4);
        Usuario p5 = new Usuario("Daniel", 5);


        banco.registrar(p1);
        banco.registrar(p2);
        banco.registrar(p3);
        banco.registrar(p4);
        banco.registrar(p5);

        banco.atenderSiguiente();
        banco.atenderSiguiente();
        banco.atenderSiguiente();
        banco.atenderSiguiente();

        banco.toFile();

    }

}
