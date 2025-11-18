package questao4;

public abstract class Verificacao {
    protected Verificacao proxima;
    
    public Verificacao setProxima(Verificacao proxima) {
        this.proxima = proxima;
        return proxima;
    }
    
    public boolean verificar(Transacao transacao) {
        if (!executarVerificacao(transacao)) {
            return false;
        }
        
        if (proxima != null) {
            return proxima.verificar(transacao);
        }
        
        return true;
    }
    
    protected abstract boolean executarVerificacao(Transacao transacao);
}

