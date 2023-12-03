package 브루트포스비트마스크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 부분수열의합1182 {
    static int N,S;
    static int count = 0;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i  ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0,0);
        if(S == 0) count --;
        System.out.println(count);
    }
    public static void dfs(int sum, int depth){
        if(depth == N){
            if(sum == S){
                count ++;
            }
            return;
        }
        dfs(sum + arr[depth], depth+1);
        dfs(sum, depth+1);
    }
}
