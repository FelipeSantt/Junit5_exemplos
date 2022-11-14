import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void devCalcularIdadeCorretamente() {

        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1,1, 15, 0 ,0));
        Assertions.assertEquals(22, jessica.getIdade());
    }

    @Test
    void devRetronarSeEhMaiorDeIdade() {

        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000,1, 1, 15, 0, 0 ));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());
    }
}
