import java.sql.Date;

public class Cliente{
    int idCliente;
    String nome;
    Date dt_Nascimento;
    String cpf;
    int devolucao_Dias;
    int qtdLocacoes;

    Cliente(int IdCliente, String Nome, Date Dt_Nascimento, String Cpf, int devolucao_Dias){
        this.IdCliente      = IdCliente;
        this.Nome           = Nome;
        this.Dt_Nascimento  = Dt_Nascimento;
        this.Cpf            = Cpf;
        this.devolucao_Dias = devolucao_Dias;
    }

}
