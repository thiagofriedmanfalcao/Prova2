public class Filmes_Locados{
    Locacao locacoes;
    List<Filme> filmes = new ArrayList<>();    

    Filmes_Locados(Locacao objLocacao, Filme objFilme){
        this.locacoes.add(objLocacao);
        this.filmes.add(objFilme);
    }
}