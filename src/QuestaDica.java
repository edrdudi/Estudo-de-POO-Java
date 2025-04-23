public class QuestaDica extends QuestaoSimples{
    private String questao1;
    private String questao2;
    private String questao3;
    private String questao4;

    public QuestaDica (String enunciado, String resposta, String questao1, String questao2, String questao3, String questao4){
        super (enunciado, resposta);
        this.questao1 = questao1;
        this.questao2 = questao2;
        this.questao3 = questao3;
        this.questao4 = questao4;
    }

    @Override
    public String aplicarQuestao() {
        return super.aplicarQuestao() + " Qual a Alternativa correta?\n"
                + this.questao1 + "\n"
                + this.questao2 + "\n"
                + this.questao3 + "\n"
                + this.questao4;
    }
}