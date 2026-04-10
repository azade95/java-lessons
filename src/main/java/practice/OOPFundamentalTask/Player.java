package practice.OOPFundamentalTask;

public class Player {
    static  int counter=1;
    int id;
    String name;
    int totalScore;

    public Player(String name){
        this.id=counter;
        counter++;
        this.name=name;
        this.totalScore=0;
    }

    public void addScore(int score){
        totalScore+=score;
    }

    public void getInfo(){
        System.out.println("Player id :"+ id);
        System.out.println("Name: "+ name);
        System.out.println("Total Score: "+totalScore);
    }
}
