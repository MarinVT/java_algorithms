package advanceLessons2.tortoiseVSHare;

public class Hare extends Runner {

    public Hare(int currentPosition, int lane, String name) {
        this.currentPosition = currentPosition;
        this.lane = lane;
        this.name = name;
        runnerSymbol = "H";
        moveDescription = name + " is Ready! Set! Go!";
        allRunners.add(this);
    }


    @Override
    public void calculateMove() {
        int move = getMoveType();

        if (move >= 1 && move <= 20) {
            makeMove(MoveType.SLEEP);
            moveDescription = name + " is sleeping (0)";
        } else if (move >= 21 && move <= 40) {
            makeMove(MoveType.BIG_HOP);
            moveDescription = name + " made a Big Hop (+9)";
        } else if (move >= 41 && move <= 50) {
            makeMove(MoveType.BIG_SLIP);
            moveDescription = name + " made a Big Slip (-12)";
        } else if (move >= 51 && move <= 80) {
            makeMove(MoveType.SMALL_HOP);
            moveDescription = name + " made a Small Hop (+1)";
        } else {
            makeMove(MoveType.SMALL_SLIP);
            moveDescription = name + " made a Small Slip (-2)";
        }
    }
}
