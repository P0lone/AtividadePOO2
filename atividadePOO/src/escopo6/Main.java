package escopo6;

public class Main {
    public static void main(String[] args) {
        Usuario gustavo = new Usuario("Gustavo", "2004-08-11", "Online");
        Usuario luan = new Usuario("Gustavo", "2004-08-11", "Online");
        Post post = new Post(gustavo, null, "Atividade POO", 1, null);
        Comunidade programadores = new Comunidade("Programadores", post);
        ControlePrivacidade control = new ControlePrivacidade(gustavo, true, true);
        Conexao amigo = new Conexao(gustavo, luan, "Amizadade");
    }
}
