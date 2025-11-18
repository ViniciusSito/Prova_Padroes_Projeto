package questao2;

public class AnalisadorInvestimentos {
    private EstrategiaCalculoRisco estrategia;
    
    public void setEstrategia(EstrategiaCalculoRisco estrategia) {
        this.estrategia = estrategia;
    }
    
    public void analisarCliente(Cliente cliente) {
        if (estrategia == null) {
            throw new IllegalStateException("Estratégia de cálculo não foi definida");
        }
        
        double perfilRisco = estrategia.calcularPerfilRisco(cliente);
        
        System.out.println("=== Análise de Investimentos ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Modelo utilizado: " + estrategia.getNomeModelo());
        System.out.println("Perfil de Risco: " + String.format("%.2f", perfilRisco) + "/10");
        System.out.println("===============================\n");
    }
}

