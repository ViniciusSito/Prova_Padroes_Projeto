package questao4;

public class VerificacaoValorSuspeito extends Verificacao {
    private static final double VALOR_LIMITE = 10000.0;
    
    @Override
    protected boolean executarVerificacao(Transacao transacao) {
        if (transacao.getValor() > VALOR_LIMITE) {
            System.out.println("[ANTIFRAUDE] Transação " + transacao.getId() + 
                             " BARRADA: Valor suspeito (R$ " + transacao.getValor() + ")");
            return false;
        }
        System.out.println("[ANTIFRAUDE] Verificação de valor: APROVADA");
        return true;
    }
}

