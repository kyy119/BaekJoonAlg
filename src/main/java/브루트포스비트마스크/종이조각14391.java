package 브루트포스비트마스크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 종이조각14391 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        for(int i = 0; i < N; i ++){
            String str = br.readLine();
            for(int j = 0; j < M; j ++){
                arr[i][j] = str.charAt(j) -'0';
            }
        }
        int ans = 0;
        for(int s = 0; s <(1 << (N*M)); s ++){
            int sum = 0;
            for(int i = 0; i < N; i ++){
                int cur = 0;
                for(int j = 0; j < M; j ++){
                    int k = i*M+j;
                    if((s&(1 << k))== 0){
                        cur*= 10;
                        cur += arr[i][j];
                    }else{
                        sum += cur;
                        cur = 0;
                    }
                }
                sum += cur;
            }
            for(int j = 0; j < M; j ++){
                int cur = 0;
                for(int i = 0; i < N; i ++){
                    int k = i*M+j;
                    if((s&(1<<k)) != 0){
                        cur *= 10;
                        cur += arr[i][j];
                    }else {
                        sum += cur;
                        cur = 0;
                    }
                }
                sum += cur;
            }
            ans = Math.max(ans , sum);
        }
        System.out.println(ans);
    }
}
