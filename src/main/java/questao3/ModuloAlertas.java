package questao3;

public class ModuloAlertas implements Observador {
    
    @Override
    public void atualizar(Sensor sensor) {
        boolean alerta = false;
        StringBuilder alertas = new StringBuilder();
        
        if (sensor.getTemperatura() > 40) {
            alertas.append("ALERTA: Temperatura crítica! ");
            alerta = true;
        }
        if (sensor.getUmidade() < 20) {
            alertas.append("ALERTA: Umidade muito baixa! ");
            alerta = true;
        }
        if (sensor.getIndicePoluicao() > 100) {
            alertas.append("ALERTA: Índice de poluição perigoso! ");
            alerta = true;
        }
        
        if (alerta) {
            System.out.println("[MÓDULO DE ALERTAS] " + alertas.toString() + 
                             "Sensor: " + sensor.getId() + " - " + sensor.getRegiao());
            System.out.println();
        }
    }
}

