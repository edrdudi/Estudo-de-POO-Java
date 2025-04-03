public class AppTelevisao {
    public static void main (String[] args) {

        Televisao t = new Televisao();
        Televisao v = new Televisao();

        t.marca = "LG";
        t.ligada = false;
        t.volume = 0;
        t.canal = 5;

        v.marca = "AOC";
        v.ligada = true;
        v.volume = 5;
        v.canal = 55;

        t.ligar();
        t.aumentarVolume();
        t.avancarCanal();

        v.aumentarVolume();
        v.avancarCanal();
    }
}