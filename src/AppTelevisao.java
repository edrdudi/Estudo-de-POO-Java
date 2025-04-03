public class AppTelevisao {
    public static void main (String[] args) {
        int a;
        String b;

        Televisao t = new Televisao();

        t.marca = "LG";
        t.ligada = false;
        t.volume = 0;
        t.canal = 5;

        t.ligar();
        t.aumentarVolume();
        t.avancarCanal();
    }
}
