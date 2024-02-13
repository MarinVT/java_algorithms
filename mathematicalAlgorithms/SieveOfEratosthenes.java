package mathematicalAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {

    public static List<Integer> findPrimeNumbers(int n) {
        boolean[] isPrimeNum = new boolean[n + 1];

        List<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i < n; i++) {
            isPrimeNum[i] = true;
        }

        for (int i = 2; i < n; i++) {

            if (isPrimeNum[i]) {
                primes.add(i);

                for (int j = i; j * i <= n; j++) {
                    isPrimeNum[i * j] = false;
                }
            }
        }
        return primes;
    }

    public static void main(String[] args) {

        List<Integer> findPrimeNumbers = findPrimeNumbers(10);
        for (Integer findPrimeNumber : findPrimeNumbers) {
            System.out.print(findPrimeNumber);
        }

        System.out.println(" are the prime numbers");
        System.out.println("Smaller or equal to " + findPrimeNumbers.size());
    }
}
