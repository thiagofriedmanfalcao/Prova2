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

        Date dataAtual = new Date(System.currentTimeMillis());

        List<Filme> filmesLocados = new ArrayList<Filme>();    
        filmesLocados.add(Filme1);
        filmesLocados.add(Filme10);
        Locacao Locacao1 = new Locacao(1, dataAtual, new Locadora().CalculaDtDevolucao(Cliente1.devolucao_Dias), Cliente1, filmesLocados);

        filmesLocados = new ArrayList<Filme>();    
        filmesLocados.add(Filme3);
        filmesLocados.add(Filme8);
        Locacao Locacao2 = new Locacao(1, dataAtual, new Locadora().CalculaDtDevolucao(Cliente1.devolucao_Dias), Cliente1, filmesLocados);

        filmesLocados = new ArrayList<Filme>();
        filmesLocados.add(Filme5);
        filmesLocados.add(Filme4);
        filmesLocados.add(Filme3);
        Locacao Locacao3 = new Locacao(1, dataAtual, new Locadora().CalculaDtDevolucao(Cliente3.devolucao_Dias), Cliente3, filmesLocados);

        filmesLocados = new ArrayList<Filme>();
        filmesLocados.add(Filme5);
        filmesLocados.add(Filme10);
        filmesLocados.add(Filme1);
        filmesLocados.add(Filme8);       
        filmesLocados.add(Filme3);                 
        Locacao Locacao4 = new Locacao(1, dataAtual, new Locadora().CalculaDtDevolucao(Cliente5.devolucao_Dias), Cliente5, filmesLocados);        

        filmesLocados = new ArrayList<Filme>();
        filmesLocados.add(Filme7);
        filmesLocados.add(Filme9);                 
        Locacao Locacao5 = new Locacao(1, dataAtual, new Locadora().CalculaDtDevolucao(Cliente5.devolucao_Dias), Cliente5, filmesLocados);        
        
        msg.println("***Quantidade de Filmes locados por cada cliente***");
        msg.println("Cliente: " + Cliente1.nome + " alugou " + Cliente1.qtdFilmesLocados + " filmes");
        msg.println("Cliente: " + Cliente2.nome + " alugou " + Cliente2.qtdFilmesLocados + " filmes");
        msg.println("Cliente: " + Cliente3.nome + " alugou " + Cliente3.qtdFilmesLocados + " filmes");
        msg.println("Cliente: " + Cliente4.nome + " alugou " + Cliente4.qtdFilmesLocados + " filmes");
        msg.println("Cliente: " + Cliente5.nome + " alugou " + Cliente5.qtdFilmesLocados + " filmes");           
        
        msg.println("***Quantidade de Filmes por Locação***");        
        msg.println("Locação 1: " + Locacao1.qtdFilmesPorLocacao + " filmes");        
        msg.println("Locação 2: " + Locacao2.qtdFilmesPorLocacao + " filmes");        
        msg.println("Locação 3: " + Locacao3.qtdFilmesPorLocacao + " filmes");        
        msg.println("Locação 4: " + Locacao4.qtdFilmesPorLocacao + " filmes");        
        msg.println("Locação 5: " + Locacao5.qtdFilmesPorLocacao + " filmes");        

        msg.println("***Valor Total por Locação***");        
        msg.println("Locação 1: " + Locacao1.vlrTotPorLocacao + " filmes");        
        msg.println("Locação 2: " + Locacao2.vlrTotPorLocacao + " filmes");        
        msg.println("Locação 3: " + Locacao3.vlrTotPorLocacao + " filmes");        
        msg.println("Locação 4: " + Locacao4.vlrTotPorLocacao + " filmes");        
        msg.println("Locação 5: " + Locacao5.vlrTotPorLocacao + " filmes");        

        msg.println("***Quantidade de Locações por Filme***");        
        msg.println("Filme " + Filme1.nome + " foi locado " + Filme1.qtdLocacoes);
        msg.println("Filme " + Filme2.nome + " foi locado " + Filme2.qtdLocacoes);
        msg.println("Filme " + Filme3.nome + " foi locado " + Filme3.qtdLocacoes);
        msg.println("Filme " + Filme4.nome + " foi locado " + Filme4.qtdLocacoes);
        msg.println("Filme " + Filme5.nome + " foi locado " + Filme5.qtdLocacoes);
        msg.println("Filme " + Filme6.nome + " foi locado " + Filme6.qtdLocacoes);
        msg.println("Filme " + Filme7.nome + " foi locado " + Filme7.qtdLocacoes);
        msg.println("Filme " + Filme8.nome + " foi locado " + Filme8.qtdLocacoes);
        msg.println("Filme " + Filme9.nome + " foi locado " + Filme9.qtdLocacoes);
        msg.println("Filme " + Filme10.nome + " foi locado " + Filme10.qtdLocacoes);

    }

    public Date CalculaDtDevolucao(int devDias){
        Date dtDevolucao = new Date();
        Calendar cal = Calendar.getInstance(); 
        cal.setTime(dtDevolucao); 
        cal.add(Calendar.DATE, devDias);
        dtDevolucao = cal.getTime();      
        return dtDevolucao;    
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