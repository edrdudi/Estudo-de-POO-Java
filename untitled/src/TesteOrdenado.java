import java.util.ArrayList;
import java.util.Collections;

public class TesteOrdenado {
    public static void main(String[] args){

        ArrayList<Player> listaPlayers = new ArrayList<Player>();

        listaPlayers.add(new Player(1, "Dudi", 200));
        listaPlayers.add(new Player(5, "Nat", 150));
        listaPlayers.add(new Player(2, "Vera", 330));
        listaPlayers.add(new Player(7,"Elvio", 100));
        listaPlayers.add(new Player(12, "Enzo", 200));

        Collections.sort(listaPlayers);

        for (Player p : listaPlayers){
            System.out.println("Nome: " + p);
        }
    }
}