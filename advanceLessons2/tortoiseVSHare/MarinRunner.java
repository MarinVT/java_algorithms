package advanceLessons2.tortoiseVSHare;

public class MarinRunner extends Runner{

    public MarinRunner(int currentPosition, int lane, String name) {
        this.currentPosition = currentPosition;
        this.lane = lane;
        this.name = name;
        runnerSymbol = "M";
        moveDescription = name + " is Ready! Set! Go!";
        allRunners.add(this);
    }


    @Override
    public void calculateMove() {
        int move = getMoveType();

        if (move > 1 && move <= 50) {
            makeMove(MoveType.MARIN_JUMP);
            moveDescription = name + " Marin jumps (+5)";
        } else if (move >= 51 && move <= 70) {
            makeMove(MoveType.SLIP);
            moveDescription = name + " Slipped (-6)";
        } else {
            makeMove(MoveType.SLOW_PLOD);
            moveDescription = name + " moved Slow Plod (+1)";
        }
    }

}
