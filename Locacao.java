import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Locacao{
    int idLocacao;
    Date dt_Locacao;
    Date dt_Devolucao;
    Cliente cli_Locacao;
    Filmes_Locados filmesLocados;

    Locacao(int idLocacao, Date dt_Locacao, Date dt_Devolucao, Cliente objCliente, List<Filme> listFilmes){
        this.idLocacao      = idLocacao;
        this.dt_Locacao     = dt_Locacao;
        this.dt_Devolucao   = dt_Devolucao;
        this.cli_Locacao    = objCliente;
        this.filmesLocados  = new Filmes_Locados(this, listFilmes);
    }
}