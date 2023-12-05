package 다이나믹프로그래밍part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 쉬운계단수10844 {
    static int N;
    static Long[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new Long[N+1][10];
        for(int i = 0; i < 10; i ++) {
            dp[1][i] = 1L;
        }
        long answer = 0;
        for(int i = 1; i <= 9; i ++){
            answer += solve(N,i);
        }
        System.out.println(answer % 1000000000);
    }
    public static long solve(int digit, int val){
        if(digit == 1){
            return dp[digit][val];
        }
        if(dp[digit][val] == null){
            if(val == 0){
                dp[digit][val] = solve(digit - 1, 1);
            } else if (val == 9) {
                dp[digit][val] = solve(digit-1,8);
            }else{
                dp[digit][val] = solve(digit-1,val-1)+solve(digit-1,val+1);
            }
        }
        return dp[digit][val] % 1000000000;
    }
}
