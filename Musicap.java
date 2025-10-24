public class Musicap {
    public static void main(String[] args) {
        Musica m1 = new Musica();
        m1.titulo = "Blinding Lights";
        m1.artista = "The Weeknd";
        m1.duracao = 3.2;

        Musica m2 = new Musica();
        m2.titulo = "Shape of You";
        m2.artista = "Ed Sheeran";
        m2.duracao = 4.1;

        Musica m3 = new Musica();
        m3.titulo = "Levitating";
        m3.artista = "Dua Lipa";
        m3.duracao = 3.4;

        m1.tocar(); m1.mostrarDetalhes(); m1.pausar();
        m2.tocar(); m2.mostrarDetalhes(); m2.pausar();
        m3.tocar(); m3.mostrarDetalhes(); m3.pausar();
    }
}
