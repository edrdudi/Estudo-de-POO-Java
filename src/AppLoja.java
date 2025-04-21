import java.util.Scanner;

public class AppLoja {
    public static void main (String[] args){
        float valorCompra;
        Scanner teclado = new Scanner(System.in);
        Cliente c = new Cliente("Dudi", "dudi@dudi", 200);
        ClienteVip cVIP = new ClienteVip("Nat", "nat@nat", 250, 50);

        System.out.println(c);
        System.out.println(cVIP);

        System.out.println("Digite o valor a pagar");
        valorCompra = teclado.nextFloat();

        if (c.fazerCompra(valorCompra)) {
            System.out.println("Compra aprovada");
        } else {
            System.out.println("Compra negada");
        }

        System.out.println(c);
    }
}
