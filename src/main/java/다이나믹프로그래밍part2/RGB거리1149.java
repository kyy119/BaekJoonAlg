package 다이나믹프로그래밍part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB거리1149 {
    static int[][] arr, dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][3];
        dp = new int[N][3];
        for(int i = 0; i < N; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j ++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];
        System.out.println(Math.min(paint(N-1,0), Math.min(paint(N-1,1),paint(N-1,2))));

    }
    public static int paint(int N, int color){
        if(dp[N][color] == 0){
            if(color == 0){
                dp[N][0] = Math.min(paint(N-1,1), paint(N-1,2)) + arr[N][0];
            } else if (color == 1) {
                dp[N][1] = Math.min(paint(N-1,0), paint(N-1,2)) + arr[N][1];
            } else if (color == 2) {
                 dp[N][2] = Math.min(paint(N-1,0), paint(N-1,1)) + arr[N][2];
            }
        }
        return dp[N][color];
    }
}
