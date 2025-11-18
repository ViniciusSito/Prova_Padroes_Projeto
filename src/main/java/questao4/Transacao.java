package questao4;

public class Transacao {
    private String id;
    private double valor;
    private String geolocalizacao;
    private String usuarioId;
    private String dispositivoId;
    private int historicoTransacoes;
    
    public Transacao(String id, double valor, String geolocalizacao, 
                    String usuarioId, String dispositivoId, int historicoTransacoes) {
        this.id = id;
        this.valor = valor;
        this.geolocalizacao = geolocalizacao;
        this.usuarioId = usuarioId;
        this.dispositivoId = dispositivoId;
        this.historicoTransacoes = historicoTransacoes;
    }
    
    public String getId() { return id; }
    public double getValor() { return valor; }
    public String getGeolocalizacao() { return geolocalizacao; }
    public String getUsuarioId() { return usuarioId; }
    public String getDispositivoId() { return dispositivoId; }
    public int getHistoricoTransacoes() { return historicoTransacoes; }
}

