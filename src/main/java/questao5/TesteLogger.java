package questao5;

public class TesteLogger {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstancia();
        Logger logger2 = Logger.getInstancia();
        
        System.out.println("logger1 == logger2: " + (logger1 == logger2));
        System.out.println("Mesma instância: " + (logger1.equals(logger2)));
        System.out.println();
        
        logger1.logErro("Erro ao conectar com banco de dados");
        logger1.logEvento("Usuário fez login no sistema");
        logger1.logAuditoria("Alteração de permissões do usuário admin");
        
        logger2.logErro("Timeout na requisição HTTP");
        logger2.logEvento("Transação processada com sucesso");
        
        new Thread(() -> {
            Logger logger3 = Logger.getInstancia();
            logger3.logEvento("Thread paralela registrando evento");
        }).start();
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        logger1.fechar();
    }
}

