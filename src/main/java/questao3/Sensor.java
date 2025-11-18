package questao3;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private String id;
    private String regiao;
    private double temperatura;
    private double umidade;
    private double indicePoluicao;
    private List<Observador> observadores;
    
    public Sensor(String id, String regiao) {
        this.id = id;
        this.regiao = regiao;
        this.observadores = new ArrayList<>();
    }
    
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }
    
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }
    
    public void atualizarValores(double temperatura, double umidade, double indicePoluicao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.indicePoluicao = indicePoluicao;
        notificarObservadores();
    }
    
    private void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar(this);
        }
    }
    
    public String getId() { return id; }
    public String getRegiao() { return regiao; }
    public double getTemperatura() { return temperatura; }
    public double getUmidade() { return umidade; }
    public double getIndicePoluicao() { return indicePoluicao; }
}

