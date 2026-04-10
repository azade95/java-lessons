package practice.OOPFundamentalTask;

public class GameTask {
    static void main(String[] args) {

        ScoreSystem system = new ScoreSystem();


        Player ali= new Player("Ali");
        Player aysel= new Player("Aysel");
        Player kamran= new Player("Kamran");

        Game flappy = new Game( "Flappy Bird", "EASY", 10);
        Game subway = new Game( "Subway Runner", "MEDIUM", 10);
        Game pubg = new Game( "PUBG Match", "HARD", 10);

        system.addPlayer(ali);
        system.addPlayer(aysel);
        system.addPlayer(kamran);


        system.playGame(ali, flappy);
        system.playGame(aysel, pubg);
        system.playGame(kamran, subway);


        system.showLeaderboard();
    }
}
