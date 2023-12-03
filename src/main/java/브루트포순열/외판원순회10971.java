package 브루트포순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 외판원순회10971 {
    static int N;
    static int min = Integer.MAX_VALUE;
    static int[][] map;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for(int i = 0; i < N; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j ++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < N; i ++){
            check = new boolean[N];
            check[i] = true;
            dfs(i,i,0,0);
        }
        System.out.println(min);
    }
    public static void dfs(int start, int now, int sum ,int depth){
        if(depth == N -1){
            if(map[now][start] != 0){
                sum += map[now][start];
                min = Math.min(min, sum);
            }
            return;
        }
        for(int i = 0; i < N; i ++){
            if(!check[i] && map[now][i] != 0){
                check[i] = true;
                dfs(start, i, sum+map[now][i],depth+1);
                check[i] = false;
            }
        }
    }
}
