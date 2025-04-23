public class QuestaoMultiplaEscolha extends QuestaoSimples {
    private String dica;

    public QuestaoMultiplaEscolha(String enunciado, String resposta, String dica) {
        super (enunciado, resposta);
        this.dica = dica;
    }

    @Override
    public String aplicarQuestao() {
        return super.aplicarQuestao() + " Dica: " + this.dica;
    }
}
