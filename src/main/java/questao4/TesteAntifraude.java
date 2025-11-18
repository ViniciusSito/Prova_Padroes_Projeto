package questao4;

public class TesteAntifraude {
    public static void main(String[] args) {
        SistemaAntifraude sistema = new SistemaAntifraude();
        
        Transacao transacao1 = new Transacao("T001", 500.0, "Brasil", "U001", "DEV001", 10);
        sistema.processarTransacao(transacao1);
        
        Transacao transacao2 = new Transacao("T002", 15000.0, "Brasil", "U002", "DEV002", 5);
        sistema.processarTransacao(transacao2);
        
        Transacao transacao3 = new Transacao("T003", 800.0, "Região Suspeita", "U003", "DEV003", 8);
        sistema.processarTransacao(transacao3);
        
        Transacao transacao4 = new Transacao("T004", 300.0, "Brasil", "U004", "SUSPECT001", 15);
        sistema.processarTransacao(transacao4);
    }
}

