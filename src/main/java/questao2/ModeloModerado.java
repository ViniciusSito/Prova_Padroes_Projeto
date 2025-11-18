package questao2;

public class ModeloModerado implements EstrategiaCalculoRisco {
    
    @Override
    public double calcularPerfilRisco(Cliente cliente) {
        double risco = 0.0;
        risco += (cliente.getRenda() / 10000) * 0.15;
        risco += (cliente.getIdade() < 50 ? 0.2 : 0.15);
        risco += (cliente.getHistoricoInvestimentos() / 10.0) * 0.25;
        risco += (cliente.getPatrimonio() / 100000) * 0.25;
        risco += 0.15;
        return Math.min(risco, 7.0);
    }
    
    @Override
    public String getNomeModelo() {
        return "Modelo Moderado";
    }
}

