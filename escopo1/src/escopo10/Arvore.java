package escopo10;

public class Arvore {
    String especie;
    Localizacao localizacao;
    String status;
    boolean adotada;
    public Arvore(String especie, Localizacao localizacao, String status, boolean adotada){
        this.especie = especie;
        this.localizacao = localizacao;
        this.status = status;
        this.adotada = adotada;
    }
}
