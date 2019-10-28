import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Locadora{
    public static void main(String[] args) {

        Date dt_nascimento1 = new Locadora().FormataData("1994-06-10");
        Date dt_nascimento2 = new Locadora().FormataData("2003-02-23");
        Date dt_nascimento3 = new Locadora().FormataData("1998-05-15");
        Date dt_nascimento4 = new Locadora().FormataData("2009-09-06");
        Date dt_nascimento5 = new Locadora().FormataData("1988-07-19");

        Cliente Cliente1 = new Cliente(1, "Thiago", dt_nascimento1, "094.602.329-81", 5);
        Cliente Cliente2 = new Cliente(2, "Mateus", dt_nascimento2, "981.998.100-09", 10);
        Cliente Cliente3 = new Cliente(3, "Jackson", dt_nascimento3, "521.671.710-21", 15);
        Cliente Cliente4 = new Cliente(4, "Carlos", dt_nascimento4, "672.506.850-23", 20);
        Cliente Cliente5 = new Cliente(5, "João", dt_nascimento5, "865.518.360-11", 25);
              

    }


    public Date FormataData(String dateString){
        Date data = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");                     
        try {
            data = dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return data;
    }

}