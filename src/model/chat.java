package model;

public class chat {
    private Integer chatcodigo;
    private String chatcnpj;
    private String chatmensagem;
    private String chatdatahora;

    public Integer getChatCodigo() {
        return chatcodigo;
    }

    public void setChatCodigo(Integer chatcodigo) {
        this.chatcodigo = chatcodigo;
    }

    public String getChatCnpj() {
        return chatcnpj;
    }

    public void setChatCnpj(String chatcnpj) {
        this.chatcnpj = chatcnpj;
    }

    public String getChatMensagem() {
        return chatmensagem;
    }

    public void setChatMensagem(String chatmensagem) {
        this.chatmensagem = chatmensagem;
    }

    public String getChatDatahora() {
        return chatdatahora;
    }

    public void setChatDatahora(String chatdatahora) {
        this.chatdatahora = chatdatahora;
    }
    
}