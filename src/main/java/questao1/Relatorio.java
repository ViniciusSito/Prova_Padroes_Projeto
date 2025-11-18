package questao1;

public abstract class Relatorio {
    protected String titulo;
    protected String conteudo;
    
    public Relatorio(String titulo) {
        this.titulo = titulo;
    }
    
    public final void gerar() {
        prepararDados();
        processarMetricas();
        formatar();
        imprimir();
    }
    
    protected abstract void prepararDados();
    protected abstract void processarMetricas();
    protected abstract void formatar();
    
    protected void imprimir() {
        System.out.println("=== " + titulo + " ===");
        System.out.println(conteudo);
        System.out.println("====================\n");
    }
}

