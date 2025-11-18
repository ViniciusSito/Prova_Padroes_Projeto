package questao4;

public class VerificacaoHistoricoUsuario extends Verificacao {
    
    @Override
    protected boolean executarVerificacao(Transacao transacao) {
        if (transacao.getHistoricoTransacoes() < 3) {
            System.out.println("[ANTIFRAUDE] Transação " + transacao.getId() + 
                             " BARRADA: Histórico insuficiente (apenas " + 
                             transacao.getHistoricoTransacoes() + " transações)");
            return false;
        }
        System.out.println("[ANTIFRAUDE] Verificação de histórico: APROVADA");
        return true;
    }
}

