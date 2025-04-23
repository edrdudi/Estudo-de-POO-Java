public class QuestaoSimples {
    private String enunciado;
    private String resposta;

    public QuestaoSimples(String enunciado, String resposta){
        this.enunciado = enunciado;
        this.resposta = resposta;
    }

    public String getEnunciado(){
        return this.enunciado;
    }

    public void setEnunciado(String enunciado){
        this.enunciado = enunciado;
    }

    public String getResposta(){
        return this.resposta;
    }

    public void setResposta(String resposta){
        this.resposta = resposta;
    }

    public String aplicarQuestao(){
        return enunciado;
    }

    public boolean corrigir(String resposta){
        return this.resposta.equals(resposta);
    }
}