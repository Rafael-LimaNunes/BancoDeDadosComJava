package testes;

import dao.ContatoDao;
import modelo.Contato;

import java.util.Calendar;

public class TesteInsere {
    public static void main(String[] args) {

        //pronto para gravar
        Contato contato = new Contato();
        contato.setNome("Caelum");
        contato.setEmail("contato@caelum.com.br");
        contato.setEndereco("R. Vreguerio 3185 cj57");
        contato.setDataDeNascimento(Calendar.getInstance());

        //grave nessa conexão!!!
        ContatoDao dao = new ContatoDao();
        dao.adiciona(contato);
        System.out.println("Gravado!");


    }
}
