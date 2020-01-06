package testes;

import dao.ContatoDao;
import modelo.Contato;

import java.util.List;

public class TestaLista {
    public static void main(String[] args) {
        ContatoDao dao = new ContatoDao();
        List<Contato> contatos = dao.getLista();
        for (Contato contato:
             contatos) {
            System.out.println("Nome " + contato.getNome());
            System.out.println("Endereço" + contato.getEndereco());

        }
    }
}
