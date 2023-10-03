package CSES_solutions.IntroProbs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeirdAlgo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //NOTE: keep it LONG. so it prevents overflow of INTEGER.
        long n = Integer.parseInt(br.readLine());
        while (n != 1) {
            System.out.print(n+" ");
            if (n %2 == 0)
                n = n/2;
            else
                n = n*3 + 1;
        }
        System.out.print(1);
    }
}
