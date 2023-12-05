package 다이나믹프로그래밍part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 타일11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 3;
        for(int i = 3; i <= 1000; i ++){
            dp[i] = (dp[i-1]+(2*dp[i-2])) % 10007;
        }
        System.out.println(dp[N]);
    }
}
