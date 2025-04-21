import java.util.Scanner;

public class AppLoja {
    public static void main (String[] args){
        float valorCompra;
        Scanner teclado = new Scanner(System.in);
        //Cliente c1;

        //c1 = new Cliente("Dudi", "dudi@dudi", 200);
        ClienteVip c2 = new ClienteVip("Nat", "nat@nat", 250, 50);

        System.out.println(c2);

        System.out.println("Digite o valor a pagar");
        valorCompra = teclado.nextFloat();

        if (c2.fazerCompra(valorCompra)) {
            System.out.println("Compra aprovada");
        } else {
            System.out.println("Compra negada");
        }

        c2.calculaCredito();

        System.out.println(c2);
    }
}
