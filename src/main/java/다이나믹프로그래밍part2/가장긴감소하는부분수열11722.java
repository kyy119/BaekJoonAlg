package 다이나믹프로그래밍part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴감소하는부분수열11722 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] =1;
        for(int i = 0; i < N; i ++){
            dp[i] = 1;
            for(int j = 0; j <i; j ++){
                if(arr[i] < arr[j] && dp[i] <= dp[j]){
                    dp[i] = dp[j]+1;
                }else if(arr[i] == arr[j]){
                    dp[i] = dp[j];
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int num : dp){
            max = Math.max(max, num);
        }
        System.out.println(max);
    }
}
