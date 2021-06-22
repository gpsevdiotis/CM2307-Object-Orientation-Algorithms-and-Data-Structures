import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        System.out.print("Card (c) or Die (d) game? ");
        String ans = br.readLine();
        UserChoice UserChoice = new UserChoice();
        GameInterface game = UserChoice.GameType(ans);
        game.initialiseGame();
        game.mainGame();
        game.declareGameWinner();
    }
}
