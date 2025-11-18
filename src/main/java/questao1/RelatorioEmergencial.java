package questao1;

public class RelatorioEmergencial extends Relatorio {
    
    public RelatorioEmergencial() {
        super("Relatório Emergencial");
    }
    
    @Override
    protected void prepararDados() {
        System.out.println("Preparando dados críticos em tempo real...");
    }
    
    @Override
    protected void processarMetricas() {
        System.out.println("Processando métricas: alertas ativos, incidentes, priorização urgente...");
    }
    
    @Override
    protected void formatar() {
        conteudo = "Timestamp: " + java.time.LocalDateTime.now() + "\n" +
                   "Alertas ativos: 3\n" +
                   "Incidentes críticos: 1\n" +
                   "Ações imediatas: 2\n" +
                   "Formato: Alerta prioritário";
    }
}

