package 브루트포순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 로또6603 {
    static int N;
    static int[] arr,arr2;
    static boolean[] check;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            if(N == 0){
                break;
            }
            arr = new int[N];
            arr2 = new int[6];
            check = new boolean[N];
            for(int i = 0; i < N; i ++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            dfs(0,0);
            System.out.println(sb);
        }
    }
    public static void dfs(int start,int depth){
        if(depth == 6){
            for(int num : arr2){
                sb.append(num).append(" ");
            }
            sb.append('\n');
            return;
        }
        for(int i = start; i < N; i ++){
            if(!check[i]){
                check[i] = true;
                arr2[depth] = arr[i];
                dfs(i,depth+1);
                check[i] = false;
            }
        }
    }
}
