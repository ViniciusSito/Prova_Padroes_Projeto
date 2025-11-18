package questao1;

public class TesteRelatorios {
    public static void main(String[] args) {
        Relatorio diario = RelatorioFactory.criarRelatorio("diario");
        diario.gerar();
        
        Relatorio semanal = RelatorioFactory.criarRelatorio("semanal");
        semanal.gerar();
        
        Relatorio emergencial = RelatorioFactory.criarRelatorio("emergencial");
        emergencial.gerar();
    }
}

