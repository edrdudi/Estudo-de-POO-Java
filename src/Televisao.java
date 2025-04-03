public class Televisao {

    //atributos
    String marca;
    boolean ligada;
    int volume;
    int canal;

    //metodos
    void ligar(){
        ligada = true;
        System.out.println("A TV " + marca + " está ligada");
    }

    void aumentarVolume(){
        if (ligada) {
            volume++;
            System.out.println("A TV " + marca + " está com volume " + volume);
        } else {
            System.out.println("Ligue a TV");
        }
    }

    void avancarCanal(){
        if (ligada){
            canal++;
            System.out.println("A TV " + marca + " está no canal " + canal);
        }
    }
}