package 다이나믹프로그래밍part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장증가하는부분수11053 {
    static int N;
    static int[] arr;
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp = new Integer[N];
        for(int i = 0; i < N; i ++){
            solve(i);
        }
        int max = dp[0];
        for(int i = 0; i < N; i ++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
    public static int solve(int N){
        if(dp[N] == null){
            dp[N] = 1;
            for(int i = N - 1; i >= 0; i --){
                if(arr[N] > arr[i]){
                    dp[N] = Math.max(dp[N], solve(i)+1);
                }
            }
        }
        return dp[N];
    }
}
