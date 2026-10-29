package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProcessadorDadosTest {

    @Test
    void deveLerPDF(){
        ProcessadorDados PDF = new GeradorPDF();
        assertEquals("Lendo dados...", PDF.lerDados());
    }

    @Test
    void deveSalvarPDF(){
        ProcessadorDados PDF = new GeradorPDF();
        assertEquals("Gerando PDF.", PDF.salvarDados());
    }

    @Test
    void deveLerTXT(){
        ProcessadorDados TXT = new GeradorTXT();
        assertEquals("Lendo dados...", TXT.lerDados());
    }

    @Test
    void deveSalvarTXT(){
        ProcessadorDados TXT = new GeradorTXT();
        assertEquals("Gerando TXT.", TXT.salvarDados());
    }

    @Test
    void deveLerDOC(){
        ProcessadorDados DOC = new GeradorDOC();
        assertEquals("Lendo dados...", DOC.lerDados());
    }

    @Test
    void deveSalvarDOC(){
        ProcessadorDados DOC = new GeradorDOC();
        assertEquals("Gerando DOC.", DOC.salvarDados());
    }
}
