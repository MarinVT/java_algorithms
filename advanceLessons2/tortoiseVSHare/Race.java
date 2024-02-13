package advanceLessons2.tortoiseVSHare;

import java.util.Scanner;

public class Race {
    private Track track;
    private boolean raceOver;

    public Race() {
        track = new Track();
        new Tortoise(0,0,"Tortoise");
        new Hare(0, 1, "Hare");
        new MarinRunner( 0,2,"Marin");
        raceOver = false;
    }

    public void racing() {
        setUpRace();

        do {
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();

            for (Runner runner : Runner.allRunners) {
                runner.calculateMove();
                track.runnerPosition(runner);
                System.out.println(runner.moveDescription);

                if (runner.isWinner(runner)) {
                    raceOver = true;
                }
            }
            track.displayRaceTrack();

        }while (!raceOver);

        getPlace();
    }

    public void getPlace() {
        for (Runner runner : Runner.allRunners) {
            if (runner.currentPosition == Track.TRACK_LENGTH) {
                System.out.println("The winner(s) is: " + runner.name);
            }
        }
    }

    private void setUpRace() {
        for (Runner runner : Runner.allRunners) {
            track.runnerPosition(runner);
            System.out.println(runner.moveDescription);
        }
        track.displayRaceTrack();
    }
}
