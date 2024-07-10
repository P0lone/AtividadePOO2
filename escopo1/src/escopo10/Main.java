package escopo10;

public class Main {
    public static void main(String[] args) {
        Localizacao minhaCidade = new Localizacao("Meu Estado", "Minha Cidade");
        Arvore carvalho = new Arvore("Carvalo", minhaCidade, "Saudavel", true);
        Usuario gustavo = new Usuario("Gustavo", carvalho, "meuemail@gustavo.com", minhaCidade);
        AtualizacaoArvore att1 = new AtualizacaoArvore("Saudavel", "/fotos/foto.png", "Dia do cuidado da arvore");
        RegistroManuntencao reg1 = new RegistroManuntencao("2024-07-10", "2024-07-10", "2024-07-10");
    }
}