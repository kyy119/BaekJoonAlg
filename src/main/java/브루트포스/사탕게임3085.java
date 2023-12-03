package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사탕게임3085 {
    static int max = 1, N = 0;
    static char arr[][];
    public static void swap(int x1, int y1, int x2, int y2){
        char temp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = temp;
    }
    public static int chkRow(int x){
        int temp = 1, res = 1;
        char ch = arr[x][0];
        for(int i = 1; i < N; i ++){
            if(arr[x][i] != ch){
                ch = arr[x][i];
                res = Math.max(res, temp);
                temp = 1;
            }else temp ++;
        }
        return Math.max(res, temp);
    }
    public static int chkCol(int y){
        int temp = 1, res = 1;
        char ch = arr[0][y];
        for(int i = 1; i < N; i ++){
            if(arr[i][y] != ch){
                ch = arr[i][y];
                res = Math.max(res, temp);
                temp = 1;
            }else temp ++;
        }
        return Math.max(res, temp);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        for(int i = 0; i < N; i ++){
            String str = br.readLine();
            for(int j = 0; j < N; j ++){
                arr[i][j] = str.charAt(j);
            }
            max = Math.max(max, chkRow(i));
        }
        for(int i = 0; i < N ;i ++){
            max = Math.max(max, chkCol(i));
        }
        for(int i = 0; i < N; i ++){
            for(int j = 0; j < N; j ++){
                if(j+1 < N){
                    swap(i,j,i,j+1);
                    max = Math.max(max, chkCol(j));
                    max = Math.max(max, chkRow(i));
                    max = Math.max(max, chkCol(j+1));
                    swap(i,j,i,j+1);
                }
                if(i+1<N){
                    swap(i,j,i+1,j);
                    max = Math.max(max, chkRow(i));
                    max = Math.max(max, chkRow(i+1));
                    max = Math.max(max, chkRow(j));
                    swap(i,j,i+1,j);
                }
            }
        }
        System.out.println(max);
    }
}
