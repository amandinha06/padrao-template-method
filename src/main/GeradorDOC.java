package padroescomportamentais.templatemethod;

public class GeradorDOC extends ProcessadorDados{

    @Override
    protected String salvarDados(){
        return "Gerando DOC.";
    }
}