import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class AssertionsTeste {

    @Test
    void validarLancamentos() {
        int[] primeiroLancamentos = {10, 20, 30, 40, 50};
        int [] segundolancamentos = {10, 20, 30, 40, 50};
        Assertions.assertArrayEquals(primeiroLancamentos, segundolancamentos);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Felipe", LocalDateTime.of(1993, 4,9, 7,30, 0));
        Assertions.assertNotNull(pessoa);
        System.out.println(pessoa.ehMaiorDeIdade());
    }

    @Test
    void validarSeAfirmacaoEhTrue() {

        boolean TvLigada = true;
        Assertions.assertTrue(TvLigada);
    }
}
