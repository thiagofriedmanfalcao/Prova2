import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Locadora{
    public static void main(String[] args) {
        // SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String dateString = "10/06/1994";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date dt_nascimento = formatter.parse(dateString);

        Cliente objCliente = new Cliente(1, "Thiago", dt_nascimento, "094.602.329-81", 10);

        System.out.println(objCliente.idCliente);
        System.out.println(objCliente.nome);
        System.out.println(objCliente.dt_Nascimento);
        System.out.println(objCliente.cpf);
        System.out.println(objCliente.devolucao_Dias);
    }
}