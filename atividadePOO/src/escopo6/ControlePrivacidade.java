package escopo6;

public class ControlePrivacidade {
    Usuario usuario;
    boolean postsPrivados;
    boolean perfilPrivado;
    public ControlePrivacidade(Usuario usuario, boolean postsPrivados, boolean perfilPrivado){
        this.usuario = usuario;
        this.postsPrivados = postsPrivados;
        this.perfilPrivado = perfilPrivado;
    }
}
