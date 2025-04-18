public class TesteDeStrings {
    public static void main (String[] args) {
        ClasseTesteStrings c1 = new ClasseTesteStrings(1, "Edu", "edu@");
        ClasseTesteStrings c2 = new ClasseTesteStrings(1, "Edu", "edu@");

        if (c1 == c2) {
            System.out.println("Ponteiros iguais");
        } else {
            System.out.println("Ponteiros diferentes");
        }

        if (c1.equals(c2)){
            System.out.println("Objetos iguais");
        } else {
            System.out.println("Objetos diferentes");
        }
    }
}