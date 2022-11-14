import java.util.logging.Logger;

public class GerenciadorDeConexaoComBancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(GerenciadorDeConexaoComBancoDeDados.class.getName());

    public static void iniciarConexao() {
        //fez algo
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizouConexao() {
        //fez algo
        LOGGER.info("Finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa) {
        //Insere pessoa no BD
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa) {
        //Remove pessoa no BD
        LOGGER.info("Removeu dados");
    }
}
