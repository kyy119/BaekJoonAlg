package 다이나믹프로그래밍part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열14002 {
    static int N;
    static int[] arr;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp = new int[N];
        dp[0] = 1;
        int lis = 1;
        for(int i = 1; i < N; i ++){
            dp[i] = 1;
            for(int j = 0; j < i; j ++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i] , dp[j]+1);
                    lis = Math.max(lis, dp[i]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lis).append('\n');
        Stack<Integer> stack = new Stack<>();
        for(int i = N-1; i >= 0;i --){
            if(lis == dp[i]){
                stack.push(arr[i]);
                lis --;
            }
        }
        while (!stack.isEmpty()){
            sb.append(stack.pop()+" ");
        }
        System.out.println(sb);
    }
}
