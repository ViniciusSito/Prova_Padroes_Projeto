package questao3;

import java.time.LocalDateTime;

public class ModuloRegistroHistorico implements Observador {
    
    @Override
    public void atualizar(Sensor sensor) {
        System.out.println("[REGISTRO HISTÓRICO] " + LocalDateTime.now());
        System.out.println("  Sensor: " + sensor.getId());
        System.out.println("  Região: " + sensor.getRegiao());
        System.out.println("  Dados: T=" + sensor.getTemperatura() + 
                         "°C, U=" + sensor.getUmidade() + 
                         "%, IP=" + sensor.getIndicePoluicao());
        System.out.println("  Registro salvo no histórico.");
        System.out.println();
    }
}

