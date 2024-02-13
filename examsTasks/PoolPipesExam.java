package examsTasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PoolPipesExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

       int volumeSwimingpool = Integer.parseInt(scanner.nextLine());
       int firstPipe = Integer.parseInt(scanner.nextLine());
       int secondPipe = Integer.parseInt(scanner.nextLine());
       double hoursWorkerOutOfJob = Double.parseDouble(scanner.nextLine());

       double water = firstPipe * hoursWorkerOutOfJob + secondPipe * hoursWorkerOutOfJob;


       if (water <= volumeSwimingpool) {
           System.out.printf("The pool is %.0f%% full." + "Pipe 1: %.0f%%. Pipe 2: %.0f%%.", Math.floor((water / volumeSwimingpool) * 100),
                   Math.floor(firstPipe * hoursWorkerOutOfJob / water * 100), Math.floor(secondPipe * hoursWorkerOutOfJob / water * 100));
       } else {
           System.out.printf("For %f hours the pool overflows with %f liters.", hoursWorkerOutOfJob, water - volumeSwimingpool);
       }
    }
}
