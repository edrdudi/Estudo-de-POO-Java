public class ClasseTesteStrings {
    private int id;
    private String nome;
    private String email;

    public ClasseTesteStrings(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public boolean equals(Object o){
        if (o instanceof ClasseTesteStrings){
            ClasseTesteStrings c = (ClasseTesteStrings) o;
            return c.id == this.id && c.nome.equals(this.nome) && c.email.equals(this.email);
        } else {
            return false;
        }
    }
}