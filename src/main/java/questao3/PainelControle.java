package questao3;

public class PainelControle implements Observador {
    
    @Override
    public void atualizar(Sensor sensor) {
        System.out.println("[PAINEL DE CONTROLE] Sensor " + sensor.getId() + 
                         " - Região: " + sensor.getRegiao());
        System.out.println("  Temperatura: " + sensor.getTemperatura() + "°C");
        System.out.println("  Umidade: " + sensor.getUmidade() + "%");
        System.out.println("  Índice de Poluição: " + sensor.getIndicePoluicao());
        System.out.println();
    }
}

