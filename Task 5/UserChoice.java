public class UserChoice {
    public GameInterface GameType(String choice) throws Exception {
        if (choice.equals("c")) {
            return new GameCard();
        } else if (choice.equals("d")) {
            return new GameDie();
        } else
            System.out.println("Invalid choice!");
            System.exit(1);
            return null;
    }
}
