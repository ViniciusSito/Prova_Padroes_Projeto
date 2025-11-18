package questao1;

public class RelatorioDiario extends Relatorio {
    
    public RelatorioDiario() {
        super("Relatório Diário");
    }
    
    @Override
    protected void prepararDados() {
        System.out.println("Preparando dados do banco de operações diárias...");
    }
    
    @Override
    protected void processarMetricas() {
        System.out.println("Processando métricas: entregas do dia, tempo médio, taxa de sucesso...");
    }
    
    @Override
    protected void formatar() {
        conteudo = "Data: " + java.time.LocalDate.now() + "\n" +
                   "Total de entregas: 150\n" +
                   "Taxa de sucesso: 98.5%\n" +
                   "Tempo médio: 2h 30min\n" +
                   "Formato: Resumo executivo";
    }
}

