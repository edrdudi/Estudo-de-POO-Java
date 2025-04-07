import java.util.Scanner;

public class AppBombaCombustivel {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        BombaCombustível b1 = new BombaCombustível();

        b1.abastecerPorValor(teclado.nextFloat());
    }
}
