import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validaCenarioDeExcecaoNaTranferencia() {
        Conta contaOrigem = new Conta("12345",0);
        Conta contaDestino = new Conta("6789",100);

        TransferenciaEntreContas transfereciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
            transfereciaEntreContas.transfere(contaOrigem, contaDestino, -1));
    }
}
