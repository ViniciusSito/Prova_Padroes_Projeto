package questao2;

public class TesteAnaliseInvestimentos {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva", 15000, 35, 5, 200000);
        
        AnalisadorInvestimentos analisador = new AnalisadorInvestimentos();
        
        analisador.setEstrategia(new ModeloAgressivo());
        analisador.analisarCliente(cliente);
        
        analisador.setEstrategia(new ModeloModerado());
        analisador.analisarCliente(cliente);
        
        analisador.setEstrategia(new ModeloConservador());
        analisador.analisarCliente(cliente);
    }
}

