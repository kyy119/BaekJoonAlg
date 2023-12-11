package 다이나믹프로그래밍part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연속합13398 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[][] dp = new int[N][2];
        int max = arr[0];
        dp[0][0] = arr[0];
        dp[0][1] = arr[0];
        for(int i = 1; i < N; i ++){
            dp[i][0] = Math.max(dp[i-1][0] + arr[i] , arr[i]);
            dp[i][1] = Math.max(dp[i-1][0] ,dp[i-1][1] + arr[i]);
            max = Math.max(max, Math.max(dp[i][0], dp[i][1]));
        }
        System.out.println(max);
    }
}
