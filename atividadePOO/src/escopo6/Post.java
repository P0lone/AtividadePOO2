package escopo6;

public class Post {
    Usuario usuario;
    String arquivo;
    String texto;
    int numeroCurtida;
    String comentario;
    public Post(Usuario usuario, String arquivo, String texto, int numeroCurtida, String comentario){
        this.usuario = usuario;
        this.arquivo = arquivo;
        this.texto = texto;
        this.numeroCurtida = numeroCurtida;
        this.comentario = comentario;
    }
}
