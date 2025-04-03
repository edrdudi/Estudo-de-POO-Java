import java.util.Scanner;

public class AppCarro {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        Carro car = new Carro();

        car.setMarca(teclado.nextLine());
        car.setModelo(teclado.nextLine());
        car.setPotencia(teclado.nextInt());

        car.exibirDados();
    }
}