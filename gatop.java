public class gatop {
    public static void main(String[] args) {

        Gato gato1 = new Gato();
        gato1.nome = "lucas";
        gato1.raca = "Siamês";
        gato1.idade = 3;

        // Criando o segundo gato
        Gato gato2 = new Gato();
        gato2.nome = "Tom";
        gato2.raca = "Persa";
        gato2.idade = 5;

       
        gato1.mostrarInformacoes();
        gato1.miar();
        gato1.comer();

        gato2.mostrarInformacoes();
        gato2.miar();
        gato2.comer();
    }
}
