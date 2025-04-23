import java.util.Scanner;

public class AplicaProva {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        String resposta;
        QuestaoSimples q;
        QuestaoMultiplaEscolha m;
        QuestaDica d;

        q = new QuestaoSimples("Qual o nome do presidente do Brasil?", "Lula");

        System.out.println(q.aplicarQuestao());
        resposta = teclado.nextLine();

        if (q.corrigir(resposta)) {
            System.out.println("Resposta correta!");
        } else {
            System.out.println("Resposta errada!");
        }

        m = new QuestaoMultiplaEscolha("Qual é o seu nome?", "Dudi", "Começa com D");

        System.out.println(m.aplicarQuestao());
        resposta = teclado.nextLine();

        if (m.corrigir(resposta)){
            System.out.println("Correto!");
        } else {
            System.out.println("Errado!");
        }

        d = new QuestaDica("Eu sei", "Tudo", "Nada", "Vezes", "Tudo", "Bencao");

        System.out.println(d.aplicarQuestao());
        resposta = teclado.nextLine();

        if (d.corrigir(resposta)){
            System.out.println("Correto");
        } else {
            System.out.println("Incorreto");
        }
    }
}