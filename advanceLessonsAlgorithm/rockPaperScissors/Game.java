package advanceLessonsAlgorithm.rockPaperScissors;

public class Game extends GameItems{
    private Player player;
    private Computer computer;
    private CHOICES playerChoice;
    private CHOICES computerChoice;
    private RESULT result;
    private static int wins;
    private static int loses;
    private static int ties;

    public Game() {
        super();
        player = new Player();
        computer = new Computer();
    }

    public void play() {
        playerChoice = player.getChoice();
        computerChoice = computer.getChoice();
        result = getResult();
        displayResults();
        stats();
    }

    public void displayStats() {
        System.out.println("You have played " + (wins + loses + ties));
        System.out.println("You have won " + wins + " times");
        System.out.println("You have lost " + loses + " times");
        System.out.println("The tie happens " + ties + " times.\nGood Bye");
    }

    private void stats(){

        if (result == RESULT.WIN) {
            wins++;
        } else if (result == RESULT.LOSE) {
            loses--;
        } else {
            ties++;
        }
    }

    private void displayResults() {

        switch (result) {
            case WIN:
                System.out.println(playerChoice + " beats " + computerChoice + ". Players WINS");
                break;
            case LOSE:
                System.out.println(playerChoice + " loses to " + computerChoice + ". Computer WINS");
                break;
            case TIE:
                System.out.println(playerChoice + " equals " + computerChoice + ". It's a TIE");
                break;
        }
    }

    private RESULT getResult() {
        if (playerChoice == computerChoice) {
            return RESULT.TIE;
        }

        switch (playerChoice) {
            case ROCK:
                return (computerChoice == CHOICES.SCISSOR ? RESULT.WIN : RESULT.LOSE);
            case PAPER:
                return (computerChoice == CHOICES.ROCK ? RESULT.WIN : RESULT.LOSE);
            case SCISSOR:
                return (computerChoice == CHOICES.PAPER ? RESULT.WIN : RESULT.LOSE);
        }
        //it will never come to this line
        return RESULT.LOSE;
    }
}
