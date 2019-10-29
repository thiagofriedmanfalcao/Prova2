import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Locacao{
    int idLocacao;
    Date dt_Locacao;
    Date dt_Devolucao;
    Cliente cli_Locacao;
    Filmes_Locados filmesLocados;
    int qtdFilmesPorLocacao;
    double vlrTotPorLocacao;

    Locacao(int idLocacao, Date dt_Locacao, Date dt_Devolucao, Cliente objCliente, List<Filme> listFilmes){
        this.idLocacao      = idLocacao;
        this.dt_Locacao     = dt_Locacao;
        this.dt_Devolucao   = dt_Devolucao;
        this.cli_Locacao    = objCliente;
        this.filmesLocados  = new Filmes_Locados(this, listFilmes);
        this.cli_Locacao.AddFilmesLocados(listFilmes.size());
        this.AddQtdFilmesPorLocacao(listFilmes.size());
        this.AddQtdDeLocacoes(listFilmes);
    }

    public void AddQtdFilmesPorLocacao(int qtd){
        qtdFilmesPorLocacao = qtd;
    }

    public void AddQtdDeLocacoes(List<Filme> listFilmes){
        for (Filme filme : listFilmes) {
            filme.AddQtdDeLocacoes(1);
            vlrTotPorLocacao += filme.vlr_Locacao;
        }
    }

}