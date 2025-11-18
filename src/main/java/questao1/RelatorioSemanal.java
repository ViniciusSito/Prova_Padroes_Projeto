package questao1;

public class RelatorioSemanal extends Relatorio {
    
    public RelatorioSemanal() {
        super("Relatório Semanal");
    }
    
    @Override
    protected void prepararDados() {
        System.out.println("Preparando dados agregados da semana...");
    }
    
    @Override
    protected void processarMetricas() {
        System.out.println("Processando métricas: tendências semanais, comparação com períodos anteriores...");
    }
    
    @Override
    protected void formatar() {
        conteudo = "Período: " + java.time.LocalDate.now().minusDays(7) + " a " + java.time.LocalDate.now() + "\n" +
                   "Total de entregas: 1.050\n" +
                   "Crescimento: +5.2%\n" +
                   "Eficiência média: 96.8%\n" +
                   "Formato: Análise detalhada com gráficos";
    }
}

