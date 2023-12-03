package 브루트포스재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스타트와링크14889 {
    static int N;
    static int[][] arr;
    static boolean[] check;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for(int i = 0; i < N; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j ++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        check = new boolean[N];
        dfs(0,0);
        System.out.println(min);
    }
    public static void dfs(int cnt, int depth){
        if(depth == N /2){
            diff();
            return;
        }
        for(int i = cnt; i < N; i ++){
            if(!check[i]){
                check[i] = true;
                dfs(i+1, depth+1);
                check[i] = false;
            }
        }
    }
    public static void diff(){
        int team_start = 0;
        int team_link = 0;
        for (int i = 0; i < N-1; i ++){
            for(int j = i + 1; j < N; j ++){
                if(check[i] && check[j]){
                    team_start += arr[i][j];
                    team_start += arr[j][i];
                }
                if(!check[i] && !check[j]){
                    team_link += arr[i][j];
                    team_link += arr[j][i];
                }
            }
        }
        int val = Math.abs(team_start-team_link);
        if(val == 0){
            System.out.println("0");
            System.exit(0);
        }
        min = Math.min(val,min);

    }
}
