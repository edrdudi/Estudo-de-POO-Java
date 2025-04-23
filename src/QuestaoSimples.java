public class QuestaoSimples {
    private String enunciado;
    private String resposta;

    public QuestaoSimples(String enunciado, String resposta){
        this.enunciado = enunciado;
        this.resposta = resposta;
    }

    public String aplicarQuestao(){
        return enunciado;
    }

    public boolean corrigir(String resposta){
        return this.resposta.equals(resposta);
    }
}