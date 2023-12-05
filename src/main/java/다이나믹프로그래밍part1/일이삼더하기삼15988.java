package 다이나믹프로그래밍part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 일이삼더하기삼15988 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[1000002];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int  i = 4; i <= 1000001; i ++){
            dp[i] = (dp[i-1]+dp[i-2]+dp[i-3]) % 1000000009;
        }
        for(int i = 0; i < N; i ++){
            int K = Integer.parseInt(br.readLine());
            System.out.println(dp[K]);
        }
    }
}
