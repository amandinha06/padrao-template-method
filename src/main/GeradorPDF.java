package padroescomportamentais.templatemethod;

public class GeradorPDF extends ProcessadorDados{

    @Override
    protected String salvarDados(){
        return "Gerando PDF.";
    }
}