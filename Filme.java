import java.util.Date;

public class Filme{
    int idFilme;
    String nome;
    Date dt_Lancamento;
    String sinopse;
    Double vlr_Locacao;
    int estoque;
    int qtdLocacoes;    

    Filme(int idFilme, String nome, Date dt_Lancamento, String sinopse, Double vlr_Locacao, int estoque){
        this.idFilme        = idFilme;
        this.nome           = nome;
        this.dt_Lancamento  = dt_Lancamento;
        this.sinopse        = sinopse;
        this.vlr_Locacao    = vlr_Locacao;
        this.estoque        = estoque;
    }


    public void AddQtdDeLocacoes(int qtd){
        qtdLocacoes += qtd;
    }    

}