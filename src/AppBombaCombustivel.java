import java.util.Scanner;

public class AppBombaCombustivel {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        BombaCombustível b1 = new BombaCombustível("Gasolina", 5);

        b1.puxarGancho();
        b1.abastecerPorLitro(teclado.nextFloat());
        b1.voltarGancho();

        b1.puxarGancho();
        b1.abastecerPorValor(teclado.nextFloat());
        b1.voltarGancho();
    }
}
