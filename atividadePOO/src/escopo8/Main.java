package escopo8;

public class Main {
    public static void main(String[] args) {
        Mensalidade soloPIX = new Mensalidade("PIX", 99.99, "2024-07-10", "2024-08-10");
        PlanoTreinamento costas = new PlanoTreinamento("Costas", "Puxada com toalha", "Remada");
        Aula aula = new Aula("2024-07-11", "15:00", "16:00", costas);
        Membro gustavo = new Membro("Membro", null, null);
        Instrutor paulo = new Instrutor("Paulo", costas);
    }
    
}
