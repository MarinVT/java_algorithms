package forLoop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenSum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int odd = 0;
        int even = 0;

        for (int i = 0; i < n ; i++) {
            int num = Integer.parseInt(reader.readLine());
            if (i % 2 == 0){
                even += num;
            } else {
                odd += num;
            }

        }
        if (odd == even){
            System.out.println("Yes");
            System.out.println("Sum = " + even);
        } else {
            System.out.println("No\nDiff = " + Math.abs(odd - even));
        }

    }
}