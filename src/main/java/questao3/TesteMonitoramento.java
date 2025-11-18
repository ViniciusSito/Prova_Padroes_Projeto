package questao3;

public class TesteMonitoramento {
    public static void main(String[] args) {
        Sensor sensor1 = new Sensor("S001", "Centro");
        Sensor sensor2 = new Sensor("S002", "Zona Norte");
        
        PainelControle painel = new PainelControle();
        ModuloAlertas alertas = new ModuloAlertas();
        ModuloRegistroHistorico historico = new ModuloRegistroHistorico();
        
        sensor1.adicionarObservador(painel);
        sensor1.adicionarObservador(alertas);
        sensor1.adicionarObservador(historico);
        
        sensor2.adicionarObservador(painel);
        sensor2.adicionarObservador(alertas);
        sensor2.adicionarObservador(historico);
        
        System.out.println("=== Atualização Sensor 1 ===\n");
        sensor1.atualizarValores(35.5, 65.0, 45.0);
        
        System.out.println("=== Atualização Sensor 2 ===\n");
        sensor2.atualizarValores(42.0, 15.0, 120.0);
    }
}

