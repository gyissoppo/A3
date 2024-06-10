package model;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import jdbc.conexao;
import model.usuario;
import model.formulario;
import model.feedback;
import model.chat;


public class metodos {

    private final Connection conexao;
    
    public metodos() {
            this.conexao = new conexao().conectar();
    }    
    
    public boolean validaLogin(String usuario1, String senha) {
        String sql = "select * from usuario where nome_empresa = ? and senha = ?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, usuario1);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            else {
                return false;
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    /*--------------------USUARIOS--------------------*/
    public void insereUsuario(usuario usuario1) {
        String sql = "insert into usuario " +
                    "(nome_empresa, cnpj, celular, email, senha) values (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, usuario1.getNomeEmpresa());
            ps.setString(2, usuario1.getCnpj());
            ps.setString(3, usuario1.getCelular());
            ps.setString(4, usuario1.getEmail());
            ps.setString(5, usuario1.getSenha());
            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<usuario> consultaUsuarios() {
        List<usuario> usuarios = new ArrayList<>();
        try {
            String sql = "select * from usuario";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                usuario usuario1 = new usuario();
                usuario1.setCodigo(rs.getInt("codigo"));
                usuario1.setNomeEmpresa(rs.getString("nome_empresa"));
                usuario1.setCnpj(rs.getString("cnpj"));
                usuario1.setCelular(rs.getString("celular"));
                usuario1.setEmail(rs.getString("email"));
                usuarios.add(usuario1);
            }
            rs.close();
            ps.close();
            return usuarios;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public usuario consultaUsuario(Integer id) {
        usuario usuario1 = new usuario();
        try {
            String sql = "select * from usuario where codigo = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                usuario1.setCodigo(rs.getInt("codigo"));
                usuario1.setNomeEmpresa(rs.getString("nome_empresa"));
                usuario1.setCnpj(rs.getString("cnpj"));
                usuario1.setCelular(rs.getString("celular"));
                usuario1.setEmail(rs.getString("email"));
                usuario1.setSenha(rs.getString("senha"));
            }
            rs.close();
            ps.close();
            return usuario1;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void atualizaUsuario (usuario usuario1) {
        String sql = "update usuario set nome_empresa=?, cnpj=?, celular=?, email=?, senha=? where codigo=?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, usuario1.getNomeEmpresa());
            ps.setString(2, usuario1.getCnpj());
            ps.setString(3, usuario1.getCelular());
            ps.setString(4, usuario1.getEmail());
            ps.setString(5, usuario1.getSenha());
            ps.setLong(6, usuario1.getCodigo());
            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
	
    public void deletaUsuario (Integer codigo) {
        try {
            String sql = "delete from usuario where codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setLong(1, codigo);
            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /*--------------------USUARIOS--------------------*/
    
    /*--------------------FORMULARIO--------------------*/
    
    public void insereFormulario(formulario formulario1) {
        String sql = "insert into formulario " +
                    "(cnpj, pergunta1, pergunta2, pergunta3, pergunta4nome, pergunta4email) values (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, formulario1.getFormularioCnpj());
            ps.setString(2, formulario1.getFormularioPergunta1());
            ps.setString(3, formulario1.getFormularioPergunta2());
            ps.setString(4, formulario1.getFormularioPergunta3());
            ps.setString(5, formulario1.getFormularioPergunta4nome());
            ps.setString(6, formulario1.getFormularioPergunta4email());
            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<formulario> consultaFormularios() {
        List<formulario> formularios = new ArrayList<>();
        try {
            String sql = "select * from formulario";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                formulario formulario1 = new formulario();
                formulario1.setFormularioCodigo(rs.getInt("codigo"));
                formulario1.setFormularioCnpj(rs.getString("cnpj"));
                formulario1.setFormularioPergunta1(rs.getString("pergunta1"));
                formulario1.setFormularioPergunta2(rs.getString("pergunta2"));
                formulario1.setFormularioPergunta3(rs.getString("pergunta3"));
                formulario1.setFormularioPergunta4nome(rs.getString("pergunta4nome"));
                formulario1.setFormularioPergunta4email(rs.getString("pergunta4email"));
                formularios.add(formulario1);
            }
            rs.close();
            ps.close();
            return formularios;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void atualizaFormulario (formulario formulario1) {
        String sql = "update formulario set cnpj=?, pergunta1=?, pergunta2=?, pergunta3=?, pergunta4nome=?, pergunta4email=? where codigo=?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, formulario1.getFormularioCnpj());
            ps.setString(2, formulario1.getFormularioPergunta1());
            ps.setString(3, formulario1.getFormularioPergunta2());
            ps.setString(4, formulario1.getFormularioPergunta3());
            ps.setString(5, formulario1.getFormularioPergunta4nome());
            ps.setString(6, formulario1.getFormularioPergunta4email());
            ps.setLong(7, formulario1.getFormularioCodigo());
            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
	
    public void deletaFormulario (Integer codigo) {
        try {
            String sql = "delete from formulario where codigo=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setLong(1, codigo);
            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /*--------------------FORMULARIO--------------------*/
    
    /*--------------------FEEDBACK--------------------*/
    
    public void insereFeedback(feedback feedback1) {
        String sql = "insert into feedback " +
                    "(cnpj, feedbackcliente) values (?, ?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, feedback1.getFeedbackCnpj());
            ps.setString(2, feedback1.getFeedbackFeedbackcliente());
            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /*--------------------FEEDBACK--------------------*/
    
    /*--------------------CHAT--------------------*/
    
    public void insereChat(chat chat1) {
        String sql = "insert into chat " +
                    "(cnpj, mensagem, datahora) values (?, ?, ?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, chat1.getChatCnpj());
            ps.setString(2, chat1.getChatMensagem());
            ps.setString(3, chat1.getChatDatahora());
            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<chat> consultaChats() {
        List<chat> chats = new ArrayList<>();
        try {
            String sql = "select * from chat";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                chat chat1 = new chat();
                chat1.setChatCodigo(rs.getInt("chatcodigo"));
                chat1.setChatCnpj(rs.getString("chatcnpj"));
                chat1.setChatMensagem(rs.getString("chatmensagem"));
                chat1.setChatDatahora(rs.getString("chatdatahora"));
                chats.add(chat1);
            }
            rs.close();
            ps.close();
            return chats;
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /*--------------------CHAT--------------------*/
    
    

}
