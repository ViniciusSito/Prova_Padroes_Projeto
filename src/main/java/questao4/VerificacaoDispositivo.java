package questao4;

public class VerificacaoDispositivo extends Verificacao {
    
    @Override
    protected boolean executarVerificacao(Transacao transacao) {
        if (transacao.getDispositivoId().startsWith("SUSPECT")) {
            System.out.println("[ANTIFRAUDE] Transação " + transacao.getId() + 
                             " BARRADA: Dispositivo incomum (" + transacao.getDispositivoId() + ")");
            return false;
        }
        System.out.println("[ANTIFRAUDE] Verificação de dispositivo: APROVADA");
        return true;
    }
}

