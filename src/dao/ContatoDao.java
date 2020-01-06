package dao;

import connection.ConnectionFactory;
import modelo.Contato;

import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ContatoDao {

    private Connection connection;

    public ContatoDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Contato contato){
        String sql = "insert into contatos(nome,email,endereco,dataNascimento) values(?,?,?,?)";
        try {
            //prepared statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            //seta os valores
            stmt.setString(1,contato.getNome());
            stmt.setString(2,contato.getEmail());
            stmt.setString(3,contato.getEndereco());
            stmt.setDate(4, new Date(contato.getDataDeNascimento().getTimeInMillis()));
       //executa
            stmt.execute();
            stmt.close();

        }catch (SQLException e){
            throw  new RuntimeException(e);
        }
    }

    public List<Contato> getLista(){
        try {
            List<Contato> contatos = new ArrayList<>();
            PreparedStatement stmt =  this.connection.prepareStatement("select * from contatos");
            ResultSet resultSet = stmt.executeQuery();
            while ((resultSet.next())){
                Contato contato = new Contato();
                contato.setId(resultSet.getLong("id"));
                contato.setNome(resultSet.getString("nome"));
                contato.setEmail(resultSet.getString("email"));
                contato.setEndereco(resultSet.getString("endereco"));
// montando a data através do Calendar
                Calendar data = Calendar.getInstance();
                data.setTime(resultSet.getDate("dataNascimento"));
                contato.setDataDeNascimento(data);
// adicionando o objeto à lista
                contatos.add(contato);
            }
            resultSet.close();
            stmt.close();
            return contatos;
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}
