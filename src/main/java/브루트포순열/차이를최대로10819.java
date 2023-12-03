package 브루트포순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 차이를최대로10819 {
    static int N;
    static int[] arr1, arr2;
    static boolean[] check;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr1 = new int[N];
        arr2 = new int[N];
        check = new boolean[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0);
        System.out.println(max);
    }
    public static void dfs(int depth){
        if(depth == N){
            max = Math.max(max, getMax());
            return;
        }
        for(int i = 0; i < N; i ++){
            if(!check[i]){
                arr2[depth] = arr1[i];
                check[i] = true;
                dfs(depth+1);
                check[i] = false;
            }
        }
    }
    public static int getMax(){
        int result = 0;
        for(int i = 0; i < N-1; i++){
            result += Math.abs(arr2[i+1] - arr2[i]);
        }
        return result;
    }
}
