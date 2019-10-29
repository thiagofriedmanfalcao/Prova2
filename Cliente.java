import java.util.Date;

public class Cliente{
    int idCliente;
    String nome;
    Date dt_Nascimento;
    String cpf;
    int devolucao_Dias;
    int qtdFilmesLocados;

    Cliente(int idCliente, String nome, Date dt_Nascimento, String cpf, int devolucao_Dias){
        this.idCliente      = idCliente;
        this.nome           = nome;
        this.dt_Nascimento  = dt_Nascimento;
        this.cpf            = cpf;
        this.devolucao_Dias = devolucao_Dias;
    }

    public void AddFilmesLocados(int qtd){
        qtdFilmesLocados += qtd;
    }

}
