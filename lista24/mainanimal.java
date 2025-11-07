package lista24;

public class mainanimal {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.setNome("Rex");
        c.setIdade(3);
        c.setRaca("Labrador");

        Gato g = new Gato();
        g.setNome("Mimi");
        g.setIdade(2);
        g.setCor("preto");

        c.mostrarInfo();
        c.abanarRabo();

        System.out.println();

        g.mostrarInfo();
        g.subirNoMuro();
    }
}
