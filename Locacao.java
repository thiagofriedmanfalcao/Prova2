import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Locacao{
    int idLocacao;
    Date dt_Locacao;
    Date dt_Devolucao;
    List<Cliente> clientes = new ArrayList<>();
    List<Filmes_Locados> filmesLocados = new ArrayList<>();    
    
    Locacao(int idLocacao, Date dt_Locacao, Date dt_Devolucao){
        this.idLocacao      = idLocacao;
        this.dt_Locacao     = dt_Locacao;
        this.dt_Devolucao   = dt_Devolucao;
    }

    void adicionarCliente(Cliente objCliente){
        this.clientes.add(objCliente);
    }

    void adicionarFilmesLocados(Locacao objLocacao, List<Filme> listFilmes){
        this.filmesLocados = new Filmes_Locados(objLocacao, listFilmes);
    }    

}