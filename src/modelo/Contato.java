package modelo;

import java.util.Calendar;

public class Contato {
    private long id;
    private String nome;
    private String email;
    private String endereco;
    private Calendar dataDeNascimetno;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Calendar getDataDeNascimento() {
        return dataDeNascimetno;
    }

    public void setDataDeNascimento(Calendar dataDeNascimetno) {
        this.dataDeNascimetno = dataDeNascimetno;
    }
}
