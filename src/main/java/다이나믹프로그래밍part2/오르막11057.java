package 다이나믹프로그래밍part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 오르막11057 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N+1][10];
        Arrays.fill(dp[0] , 1);
        for(int i = 1; i <= N; i ++){
            for(int j = 0 ; j < 10;j ++){
                for(int k = j; k < 10; k ++){
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
                }
            }
        }
        System.out.println(dp[N][0] % 10007);
    }
}
