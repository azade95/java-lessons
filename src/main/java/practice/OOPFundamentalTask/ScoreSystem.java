package practice.OOPFundamentalTask;

public class ScoreSystem {
    Player[] players = new Player[10];
    int count=0;

    public void addPlayer(Player player){
        players[count]=player;
        count++;
    }
    public void playGame(Player player, Game game){
        int score = game.calculateScore();
        player.addScore(score);
        System.out.println(player.name + " played " + game.name +
                " and got " + score + " points");
    }

    public Player findPlayerById(int id) {
        for (int i = 0; i < players.length; i++) {
            if (players[i].id == id) {
                return players[i];
            }
        }
        return null;
    }

    public void showLeaderboard() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count- i - 1; j++) {
                if (players[j].totalScore < players[j + 1].totalScore) {
                    Player temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }

        System.out.println("\n--- LEADERBOARD ---");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". ");
            players[i].getInfo();
        }
    }


}
