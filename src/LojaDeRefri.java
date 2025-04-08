import java.util.Scanner;

public class LojaDeRefri {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        MaquinaDeRefrigerante m = new MaquinaDeRefrigerante();
        int opcao, numRefri;
        float valor;

        do {
            System.out.println(m.mostrarInfo());
            System.out.println("Digite 99 para inserir credito");
            System.out.println("Digite -1 para sair");
            System.out.println("Ou, digite o numero do refri que deseja comprar");
            opcao = teclado.nextInt();

            switch(opcao) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    numRefri = m.comprarRefri(opcao);
                    if (numRefri == 0) {
                        System.out.println("Aproveite!");
                    } else if (numRefri == -1) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        System.out.println("Refri não disponível");
                    }
                    break;

                case 99:
                    valor = teclado.nextFloat();
                    m.inserirCredito(valor);
                    break;

                case -1:
                    System.out.println("Obrigado e volte sempre");
                    System.out.println("Recebea seu troco: " + m.solicitarTroco());
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }

        } while (opcao != -1);
    }
}
