package questao4;

public class SistemaAntifraude {
    private Verificacao cadeiaVerificacoes;
    
    public SistemaAntifraude() {
        construirCadeia();
    }
    
    private void construirCadeia() {
        Verificacao valor = new VerificacaoValorSuspeito();
        Verificacao geo = new VerificacaoGeolocalizacao();
        Verificacao historico = new VerificacaoHistoricoUsuario();
        Verificacao dispositivo = new VerificacaoDispositivo();
        
        valor.setProxima(geo).setProxima(historico).setProxima(dispositivo);
        
        this.cadeiaVerificacoes = valor;
    }
    
    public boolean processarTransacao(Transacao transacao) {
        System.out.println("\n=== Processando Transação " + transacao.getId() + " ===");
        boolean aprovada = cadeiaVerificacoes.verificar(transacao);
        
        if (aprovada) {
            System.out.println("[ANTIFRAUDE] Transação APROVADA\n");
        } else {
            System.out.println("[ANTIFRAUDE] Transação BARRADA\n");
        }
        
        return aprovada;
    }
}

