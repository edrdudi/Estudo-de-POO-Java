import java.util.ArrayList;
import java.util.Collections;

public class TesteOrdenado {
    public static void main(String[] args){

        ArrayList<String> listaNomes = new ArrayList<String>();

        listaNomes.add("Dudi");
        listaNomes.add("Nat");
        listaNomes.add("Vera");
        listaNomes.add("Elvio");

        Collections.sort(listaNomes);

        for (String s : listaNomes){
            System.out.println("Nome: " + s);
        }
    }
}
