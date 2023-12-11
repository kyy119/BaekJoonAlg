package 다이나믹프로그래밍part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 정수삼각1932 {
    static Integer[][] dp;
    static int[][] arr;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        dp = new Integer[N][N];
        for(int i = 0; i < N; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < i+1; j ++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i =0; i <N; i ++){
            dp[N-1][i] = arr[N-1][i];
        }
        System.out.println(solve(0,0));
    }
    public static int solve(int depth, int index){
        if(depth == N-1){
            return dp[depth][index];
        }
        if(dp[depth][index] == null){
            dp[depth][index] = Math.max(solve(depth+1, index), solve(depth+1,index+1)) + arr[depth][index];
        }
        return dp[depth][index];
    }
}
