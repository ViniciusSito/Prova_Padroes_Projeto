package questao4;

public class VerificacaoGeolocalizacao extends Verificacao {
    
    @Override
    protected boolean executarVerificacao(Transacao transacao) {
        String geo = transacao.getGeolocalizacao().toLowerCase();
        
        if (geo.contains("países bloqueados") || geo.contains("região suspeita")) {
            System.out.println("[ANTIFRAUDE] Transação " + transacao.getId() + 
                             " BARRADA: Geolocalização suspeita (" + transacao.getGeolocalizacao() + ")");
            return false;
        }
        System.out.println("[ANTIFRAUDE] Verificação de geolocalização: APROVADA");
        return true;
    }
}

