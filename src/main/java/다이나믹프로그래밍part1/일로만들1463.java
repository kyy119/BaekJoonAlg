package 다이나믹프로그래밍part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 일로만들1463 {
    static int N;
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new Integer[N+1];
        dp[0] = dp[1] = 0;
        System.out.println(solve(N));
    }
    public static int solve(int N){
        if(dp[N] == null){
            if(N % 6 == 0){
                dp[N] = Math.min(solve(N - 1), Math.min(solve(N / 3), solve(N / 2))) + 1;
            }
            else if(N%3 == 0){
                dp[N] = Math.min(solve(N-1),solve(N/3))+1;
            }else if(N % 2 == 0){
                dp[N] = Math.min(solve(N-1), solve(N/2))+1;
            }else{
                dp[N] = solve(N-1) + 1;
            }
        }
        return dp[N];
    }
}
