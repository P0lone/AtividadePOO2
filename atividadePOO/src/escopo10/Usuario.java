package escopo10;

public class Usuario {
    String nome;
    Arvore arvore;
    String email;
    Localizacao localizacao;
    public Usuario(String nome, Arvore arvore, String email, Localizacao localizacao){
        this.nome = nome;
        this.arvore = arvore;
        this.email = email;
        this.localizacao = localizacao;
    }
}
