package escopo1;

public class Relatorio {
    Livro livroMaisReservado;
    Livro livroMaisEmprestado;

    public Relatorio(Livro livroMaisReservado, Livro livroMaisEmprestado){
        this.livroMaisEmprestado = livroMaisEmprestado;
        this.livroMaisReservado = livroMaisReservado;
    }
}
