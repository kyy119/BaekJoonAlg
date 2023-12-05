package 다이나믹프로그래밍part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 퇴사 {
    static int N;
    static int[] p, s;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        p = new int[N];
        s = new int[N];
        for(int i = 0; i < N;i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            p[i] = Integer.parseInt(st.nextToken());
            s[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[N+1];
        for(int i = 0; i < N; i ++){
            if(i + p[i] <= N){
                dp[i+s[i]] = Math.max(dp[i+s[i]],dp[i] + p[i]);
            }
            dp[i+1] = Math.max(dp[i+1], dp[i]);
        }
        System.out.println(dp[N]);
    }
}
