package escopo6;

public class Conexao {
    Usuario usuario1;
    Usuario usuario2;
    String tipo; //amigo, seguidor, etc
    public Conexao(Usuario usuario1, Usuario usuario2, String tipo){
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
        this.tipo = tipo;
    }
}
