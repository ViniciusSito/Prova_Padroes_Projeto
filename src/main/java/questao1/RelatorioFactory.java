package questao1;

public class RelatorioFactory {
    
    public static Relatorio criarRelatorio(String tipo) {
        switch (tipo.toLowerCase()) {
            case "diario":
            case "diário":
                return new RelatorioDiario();
            case "semanal":
                return new RelatorioSemanal();
            case "emergencial":
                return new RelatorioEmergencial();
            default:
                throw new IllegalArgumentException("Tipo de relatório não suportado: " + tipo);
        }
    }
}

