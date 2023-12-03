package 브루트포순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 모든순열10974 {
    static int arr[];
    static boolean[] check;
    static int N;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr =  new int[N];
        check = new boolean[N];
        dfs(0);
        System.out.println(sb);
    }
    public static void dfs(int depth){
        if(depth == N){
            for(int num : arr){
                sb.append(num).append(" ");
            }
            sb.append('\n');
            return;
        }
        for(int i = 0; i < N; i ++){
            if(!check[i]){
                arr[depth] = i + 1;
                check[i] = true;
                dfs(depth+1);
                check[i] = false;
            }
        }
    }
}
