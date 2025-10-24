public class Pizzap {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        p1.sabor = "Calabresa";
        p1.tamanho = "Grande";
        p1.bordaRecheada = true;

        Pizza p2 = new Pizza();
        p2.sabor = "Frango com Catupiry";
        p2.tamanho = "Média";
        p2.bordaRecheada = false;

        p1.preparar();
        p1.assando();
        p1.mostrarInformacoes();

        p2.preparar();
        p2.assando();
        p2.mostrarInformacoes();
    }
}
