package 브루트포스N과M;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n과m15655 {
    public static int[] arr,arr2;
    public static boolean[] check;
    public static int N,M;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        arr2 = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0,0);
        System.out.println(sb);
    }
    public static void dfs(int at, int depth){
        if(depth == M){
            for(int num : arr2){
                sb.append(num).append(" ");
            }
            sb.append('\n');
            return;
        }
        for(int i = at; i < N; i++){
            arr2[depth] = arr[i];
            dfs(i+1,depth+1);
        }
    }
}
