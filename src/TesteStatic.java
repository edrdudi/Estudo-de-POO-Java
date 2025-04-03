public class TesteStatic {
    public int at1, at2;

    public static int AT3;

    public void exibirValores(){
        System.out.println("AT1: " + at1);
        System.out.println("AT2: " + at2);
        System.out.println("AT3: " + AT3);
    }

    public static void metodoStatic (String str){
        System.out.println("Metodo exemplo: " + str);
    }
}