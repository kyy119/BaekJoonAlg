package 다이나믹프로그래밍part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 카드구매하기11052 {
    static int N;
    static int max = Integer.MIN_VALUE;
    static int[] arr;
    static ArrayList<Integer> arr2 =new ArrayList<>();
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N+1];
        int[] d = new int[N + 1];
        for(int i = 0; i < N; i ++){
            arr[i+1] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                d[i] = Math.max(d[i], d[i - j] + arr[j]);
            }
        }
        System.out.println(d[N]);
    }
}
