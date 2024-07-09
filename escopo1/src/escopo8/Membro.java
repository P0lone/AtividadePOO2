package escopo8;

public class Membro {
    String nome;
    Mensalidade mensalidade;
    Aula aula;
    public Membro(String nome, Mensalidade mensalidade, Aula aula){
        this.nome = nome;
        this.mensalidade = mensalidade;
        this.aula = aula;
    }
}
