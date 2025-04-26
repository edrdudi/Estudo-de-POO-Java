public class AppPagamento {
    public static void main (String[] args){
        Funcionario contratados[];

        contratados = new Funcionario[4];

        contratados[0] = new Chefe("Carlos", 1, 4000, 25, 200);
        contratados[1] = new Comissionado("Edu", 2, 2500, 0.15f);
        contratados[2] = new Horista("Nat", 3, 11f,200);
        contratados[3] = new Empreiteiro("Vera", 4, 3000);

        for (Funcionario f : contratados){
            System.out.println("O trabalhador ganhou " + f.calcularSalario());
        }
    }
}
