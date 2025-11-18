package questao2;

public class ModeloConservador implements EstrategiaCalculoRisco {
    
    @Override
    public double calcularPerfilRisco(Cliente cliente) {
        double risco = 0.0;
        risco += (cliente.getRenda() / 10000) * 0.1;
        risco += (cliente.getIdade() > 50 ? 0.2 : 0.1);
        risco += (cliente.getHistoricoInvestimentos() / 10.0) * 0.2;
        risco += (cliente.getPatrimonio() / 100000) * 0.3;
        risco += 0.2;
        return Math.min(risco, 5.0);
    }
    
    @Override
    public String getNomeModelo() {
        return "Modelo Conservador";
    }
}

