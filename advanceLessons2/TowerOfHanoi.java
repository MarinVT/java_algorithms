package advanceLessons2;

public class TowerOfHanoi {

    static void tower(int n, char fromRod, char toRod, char auxRod) {
        if (n == 0) {
            return;
        }

        tower(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        tower(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        int n = 4;
        tower(n, 'A', 'B', 'C');
    }
}
