import java.sql.Date;

public class Locacao{
    int idLocacao;
    Date dt_Locacao;
    Date dt_Devolucao;
    List<Cliente> clientes = new ArrayList<>();
    List<FilmesLocados> filmesLocados = new ArrayList<>();
    
    Locacao(int idLocacao, Date dt_Locacao, Date dt_Devolucao){
        this.idLocacao      = idLocacao;
        this.dt_Locacao     = dt_Locacao;
        this.dt_Devolucao   = dt_Devolucao;
        this.filmesLocados.add(Locacao);
    }

    void adicionarCliente(Cliente objCliente){
        this.clientes.add(objCliente);
        objCliente.AddLocacao();
    }

    void adicionarFilme(Filme objFilme){
        this.filmes.add(objFilme);
    }

}