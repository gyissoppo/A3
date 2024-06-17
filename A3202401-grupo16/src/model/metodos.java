package model;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import jdbc.conexao;

public class metodos {

    private final Connection conexao;
    
    public metodos() {
            this.conexao = new conexao().conectar();
    }    
    
    public boolean validaLoginTrueFalse(String usuario1, String senha) {
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
    
    public String validaLogin(String usuario, String senha) {
        String sqlCnpj = "select cnpj from usuario where nome_empresa = ? and senha = ?";
        String cnpjLogado = null;
        try {
            if (validaLoginTrueFalse(usuario, senha)) {
                PreparedStatement ps = conexao.prepareStatement(sqlCnpj);
                ps.setString(1, usuario);
                ps.setString(2, senha);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    cnpjLogado = rs.getString("cnpj");
                }
                rs.close();
                ps.close();
            } else {
                cnpjLogado = null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cnpjLogado;
    }
    
    /*--------------------USUARIOS--------------------*/
    public void insereUsuario(usuario usuario1) {
        String sql = "insert into usuario (nome_empresa, cnpj, celular, email, senha) values (?, ?, ?, ?, ?)";
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
    
    public usuario consultaUsuario(String cnpj) {
        usuario usuario1 = new usuario();
        try {
            String sql = "select * from usuario where cnpj = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, cnpj);
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
    
    public void atualizaUsuario (usuario usuario1, String cnpjLogado) {
        String sql = "update usuario set nome_empresa=?, cnpj=?, celular=?, email=?, senha=? where cnpj=?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, usuario1.getNomeEmpresa());
            ps.setString(2, usuario1.getCnpj());
            ps.setString(3, usuario1.getCelular());
            ps.setString(4, usuario1.getEmail());
            ps.setString(5, usuario1.getSenha());
            ps.setString(6, cnpjLogado);
            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
	
    public void deletaUsuario (String cnpj) {
        try {
            String sql = "delete from usuario where cnpj=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, cnpj);
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
        String sql = "insert into formulario (cnpj, pergunta1, pergunta2, pergunta3, pergunta4nome, pergunta4email) values (?, ?, ?, ?, ?, ?)";
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
    
        public formulario consultaFormulario(String cnpj) {
        formulario formulario1 = new formulario();
        try {
            String sql = "select * from formulario where cnpj = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, cnpj);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                formulario1.setFormularioCodigo(rs.getInt("codigo"));
                formulario1.setFormularioCnpj(rs.getString("cnpj"));
                formulario1.setFormularioPergunta1(rs.getString("pergunta1"));
                formulario1.setFormularioPergunta2(rs.getString("pergunta2"));
                formulario1.setFormularioPergunta3(rs.getString("pergunta3"));
                formulario1.setFormularioPergunta4nome(rs.getString("pergunta4nome"));
                formulario1.setFormularioPergunta4email(rs.getString("pergunta4email"));
            }
            rs.close();
            ps.close();
            return formulario1;
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
	
    public void deletaFormulario (String cnpjLogado) {
        try {
            String sql = "delete from formulario where cnpj = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, cnpjLogado);
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
        String sql = "insert into feedback (cnpj, feedbackcliente) values (?, ?)";
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
        
        String sql = "insert into chat (cnpj, mensagem) values (?, ?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, chat1.getChatCnpj());
            ps.setString(2, chat1.getChatMensagem());
            ps.execute();
            ps.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<chat> consultaChat(String cnpj) {
        List<chat> chats = new ArrayList<>();
        try {
            String sql = "select * from chat where cnpj = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, cnpj);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                chat Chat = new chat();
                Chat.setChatCodigo(rs.getInt("codigo"));
                Chat.setChatCnpj(rs.getString("cnpj"));
                Chat.setChatMensagem(rs.getString("mensagem"));
                chats.add(Chat);
            }
            rs.close();
            ps.close();
            return chats;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /*--------------------CHAT--------------------*/

}
