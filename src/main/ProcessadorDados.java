package padroescomportamentais.templatemethod;

public abstract class ProcessadorDados {

    protected String lerDados() {
        return "Lendo dados...";
    }

    protected abstract String salvarDados();

}
