package escopo2;

public class Main {
    public static void main(String[] args) throws Exception {
        Voo voo001 = new Voo("Gol","Maringa","Curitiba","2024-007-13","19:00","19:30",399.99);
        Assento assento42 = new Assento("42",false,"Perto da Janela",voo001);
        ServicoExtra bagagemDespachada = new ServicoExtra("Bagagem Despachada",100);
        Usuario gustavo = new Usuario("Gustavo","meuEmail@gustavo.com");
        Reserva reserva = new Reserva(gustavo,assento42,"Confirmado",null);
    }
}
