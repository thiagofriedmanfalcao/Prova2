import java.util.Date;
import java.util.List;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Locadora{
    public static void main(String[] args) {

        PrintStream msg = new PrintStream(System.out);

        Cliente Cliente1 = new Cliente(1, "Thiago", new Locadora().FormataData("1994-06-10"), "094.602.329-81", 5);
        Cliente Cliente2 = new Cliente(2, "Mateus", new Locadora().FormataData("2003-02-23"), "981.998.100-09", 10);
        Cliente Cliente3 = new Cliente(3, "Jackson", new Locadora().FormataData("1998-05-15"), "521.671.710-21", 15);
        Cliente Cliente4 = new Cliente(4, "Carlos", new Locadora().FormataData("2009-09-06"), "672.506.850-23", 20);
        Cliente Cliente5 = new Cliente(5, "João", new Locadora().FormataData("1988-07-19"), "865.518.360-11", 25);              

        Filme Filme1  = new Filme(1, "O Homem das Cavernas", new Locadora().FormataData("2006-06-11"), "Ação", 10.0, 20);
        Filme Filme2  = new Filme(2, "A Guerra do Fogo", new Locadora().FormataData("2003-01-05"), "Aventura", 15.20, 20);
        Filme Filme3  = new Filme(3, "A Era do Gelo", new Locadora().FormataData("2003-03-13"), "Comédia", 22.50, 20);
        Filme Filme4  = new Filme(4, "Fantasia", new Locadora().FormataData("2006-06-15"), "Docuficção", 33.10, 20);
        Filme Filme5  = new Filme(5, "O Poderoso Chefão", new Locadora().FormataData("2012-02-09"), "Espionagem", 12.0, 20);
        Filme Filme6  = new Filme(6, "Cidadão Kane", new Locadora().FormataData("2011-06-10"), "Documentário", 9.30, 20);
        Filme Filme7  = new Filme(7, "Casablanca", new Locadora().FormataData("2006-10-25"), "Aventura", 2.50, 20);
        Filme Filme8  = new Filme(8, "Tubarão", new Locadora().FormataData("1994-06-10"), "Musical", 11.5, 20);
        Filme Filme9  = new Filme(9, "Star Wars", new Locadora().FormataData("2011-11-23"), "Aventura", 27.8, 20);
        Filme Filme10 = new Filme(10, "Fargo", new Locadora().FormataData("2011-12-27"), "Musical", 19.23, 20);

        List<Filme> filmesLocados = new ArrayList<>();    
        filmesLocados.add(Filme1);
        filmesLocados.add(Filme3);
        filmesLocados.add(Filme10);
        Locacao Locacao1 = new Locacao(1, new Locadora().FormataData("2019-10-28"), new Locadora().FormataData("2019-11-10"), Cliente1, filmesLocados);

        filmesLocados = new ArrayList<>();
        filmesLocados.add(Filme5);
        filmesLocados.add(Filme4);
        filmesLocados.add(Filme3);
        Locacao Locacao2 = new Locacao(1, new Locadora().FormataData("2019-10-28"), new Locadora().FormataData("2019-11-10"), Cliente3, filmesLocados);

        filmesLocados = new ArrayList<>();
        filmesLocados.add(Filme5);
        filmesLocados.add(Filme10);
        filmesLocados.add(Filme1);
        Locacao Locacao3 = new Locacao(1, new Locadora().FormataData("2019-10-28"), new Locadora().FormataData("2019-11-10"), Cliente5, filmesLocados);

        
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