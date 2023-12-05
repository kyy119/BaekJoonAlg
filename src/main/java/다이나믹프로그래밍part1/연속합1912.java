package 다이나믹프로그래밍part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속합1912    {
    static int max;
    static int[] arr;
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp = new Integer[N];
        dp[0] = arr[0];
        max = arr[0];
        solve(N-1);
        System.out.println(max);
    }
    public static int solve(int N){
        if(dp[N] == null){
            dp[N] = Math.max(solve(N-1) + arr[N],arr[N] );
            max = Math.max(max, dp[N]);
        }
        return dp[N];
    }
}
