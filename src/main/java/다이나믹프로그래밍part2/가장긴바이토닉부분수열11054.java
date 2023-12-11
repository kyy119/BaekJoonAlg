package 다이나믹프로그래밍part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴바이토닉부분수열11054 {
    static int[] arr;
    static Integer[] rdp, ldp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        rdp = new Integer[N];
        ldp = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < N; i ++){
            LIS(i);
            LDS(i);
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < N; i ++){
            max = Math.max(rdp[i] + ldp[i], max);
        }
        System.out.println(max - 1);
    }
    public static int LIS(int n){
        if(rdp[n] == null){
            rdp[n] = 1;
            for(int i = n-1; i >=0; i --){
                if(arr[i] < arr[n]){
                    rdp[n] = Math.max(rdp[n] , LIS(i)+1);
                }
            }
        }
        return rdp[n];
    }
    public static int LDS(int n){
        if(ldp[n] == null){
            ldp[n] = 1;
            for(int i = n+1; i < ldp.length; i ++){
                if(arr[i] < arr[n]){
                    ldp[n] = Math.max(ldp[n], LDS(i)+1);
                }
            }
        }
        return ldp[n];
    }
}
