package questao2;

public class Cliente {
    private String nome;
    private double renda;
    private int idade;
    private int historicoInvestimentos;
    private double patrimonio;
    
    public Cliente(String nome, double renda, int idade, int historicoInvestimentos, double patrimonio) {
        this.nome = nome;
        this.renda = renda;
        this.idade = idade;
        this.historicoInvestimentos = historicoInvestimentos;
        this.patrimonio = patrimonio;
    }
    
    public String getNome() { return nome; }
    public double getRenda() { return renda; }
    public int getIdade() { return idade; }
    public int getHistoricoInvestimentos() { return historicoInvestimentos; }
    public double getPatrimonio() { return patrimonio; }
}

