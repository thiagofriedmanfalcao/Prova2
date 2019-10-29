import java.util.List;
import java.util.ArrayList;

public class Filmes_Locados{
    Locacao locacoes;
    List<Filme> filmes = new ArrayList<Filme>();

    Filmes_Locados(Locacao objLocacao, List<Filme> listFilmes){
        this.locacoes = objLocacao;
        this.filmes.addAll(listFilmes);
    }
}