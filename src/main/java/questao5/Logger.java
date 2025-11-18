package questao5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {
    private static Logger instancia;
    private static final Object lock = new Object();
    private PrintWriter arquivoWriter;
    private String servidorExterno;
    
    private Logger() {
        try {
            arquivoWriter = new PrintWriter(new FileWriter("logs.txt", true));
            servidorExterno = "monitoring.external.com";
        } catch (IOException e) {
            System.err.println("Erro ao inicializar logger: " + e.getMessage());
        }
    }
    
    public static Logger getInstancia() {
        if (instancia == null) {
            synchronized (lock) {
                if (instancia == null) {
                    instancia = new Logger();
                }
            }
        }
        return instancia;
    }
    
    public void logErro(String mensagem) {
        registrar("ERRO", mensagem);
    }
    
    public void logEvento(String mensagem) {
        registrar("EVENTO", mensagem);
    }
    
    public void logAuditoria(String mensagem) {
        registrar("AUDITORIA", mensagem);
    }
    
    private void registrar(String tipo, String mensagem) {
        String logEntry = String.format("[%s] %s - %s", 
            LocalDateTime.now(), tipo, mensagem);
        
        synchronized (lock) {
            System.out.println(logEntry);
            
            if (arquivoWriter != null) {
                arquivoWriter.println(logEntry);
                arquivoWriter.flush();
            }
            
            enviarParaServidor(logEntry);
        }
    }
    
    private void enviarParaServidor(String logEntry) {
        System.out.println("  -> Enviado para servidor: " + servidorExterno);
    }
    
    public void fechar() {
        synchronized (lock) {
            if (arquivoWriter != null) {
                arquivoWriter.close();
            }
        }
    }
}

