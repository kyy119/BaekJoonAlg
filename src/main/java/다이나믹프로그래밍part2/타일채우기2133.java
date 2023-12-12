package 다이나믹프로그래밍part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 타일채우기2133 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =  Integer.parseInt(br.readLine());
        int[] tile = new int[N+1];
        tile[0] = 1;
        for(int i = 2; i <= N; i ++){
            tile[i] = tile[i-2]*3;
            for(int j = i- 4; j >= 0 ; j -=2){
                tile[i] += tile[j] * 2;
            }
        }
        System.out.println(tile[N]);
    }
}
