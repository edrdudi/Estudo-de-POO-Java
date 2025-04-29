public class Player implements Comparable<Player>{
    private int id;
    private String userName;
    private int points;

    public Player(int id, String userName, int points){
        this.id = id;
        this.userName = userName;
        this.points = points;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return "("+this.id+") " + this.userName + " | Pontos: " + this.points;
    }

    public int compareTo(Player other){
        if (this.points > other.points){
            return -1;
        } else if (this.points < other.points){
            return 1;
        } else {
            return this.userName.compareTo(other.userName);
        }
    }
}