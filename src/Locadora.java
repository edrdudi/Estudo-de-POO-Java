import java.util.Scanner;

public class Locadora {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Veiculo estoque[];

        estoque = new Veiculo[5];

        estoque[0] = new CarroNovo("Celta", "JDK0001", 50f);
        estoque[1] = new Moto("CB300", "ISI1000",20f, 0.15f);
        estoque[2] = new CarroNovo("Focus", "DUU02095", 55);
        estoque[3] = new CarroNovo("Porsche", "POR2000", 500);
        estoque[4] = new Moto("SR100RR", "SBR1000",150f, 0.10f);

        for (Veiculo v : estoque) {
            System.out.println("Veiculo: " + v.getModelo() + " / Aluguel: R$ " + v.calcularAluguel(teclado.nextInt()));
        }
    }
}
