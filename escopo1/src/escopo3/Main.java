package escopo3;

public class Main {
    Paciente gustavo = new Paciente("Gustavo", null, null);
    Leito leito061 = new Leito("061", null, true, null);
    Medico joao = new Medico("João", "Oftalmologista");
    Exame exame = new Exame(gustavo, "Vista", "2024-07-06", "07:30", null);
    Consulta consulta = new Consulta(gustavo, joao, "2024-07-05", "07:30", "Oftalmo");
}
