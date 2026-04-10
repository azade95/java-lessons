package practice.OOPFundamentalTask;

public class Game {
    static int counter=1;
    int id;
    String name;
    String difficulty;
    int baseScore;

    public Game( String name, String difficulty, int baseScore) {
        this.id = counter;
        counter++;
        this.name = name;
        this.difficulty = difficulty;
        this.baseScore = baseScore;
    }


    public int calculateScore(){
        if (difficulty=="Easy") {
            return baseScore*1;
    }
        else if (difficulty.equals("MEDIUM")) {
        return baseScore * 2;
    }
        else {
        return baseScore * 3;
    }
    }


}
