import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class AfterBeforeTeste {

    @BeforeAll
    static void configuraConexao() {
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        GerenciadorDeConexaoComBancoDeDados.insereDados(new Pessoa("Lorenna", LocalDateTime.of(1997,10,9, 13,0,0)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        GerenciadorDeConexaoComBancoDeDados.removeDados(new Pessoa("Lorenna", LocalDateTime.of(1997,10,9, 13,0,0)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        GerenciadorDeConexaoComBancoDeDados.finalizouConexao();
    }
}
