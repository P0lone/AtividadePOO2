package escopo1;
public class Emprestimo {
    String dataRetirada;
    String dataDevolucao;
    Usuario usuario;
    Livro livro;
    int numeroRenovacoes;

    /**
     * @param dataRetirada Valor do atributo no formato "YYYY-MM-DD".
     * @param dataDevolucao Valor do atributo no formato "YYYY-MM-DD".
     */
    public Emprestimo(String dataRetirada, String dataDevolucao, Usuario usuario, Livro livro, int numeroRenovacoes){
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.usuario = usuario;
        this.livro = livro;
        this.numeroRenovacoes = numeroRenovacoes;
    }
}
