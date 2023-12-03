package 브루트포순열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 다음순열10972 {
    static ArrayList<String> arr = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        if(check(arr)){
            for(int num : arr){
                sb.append(num).append(" ");
            }
        }else{
            sb.append("-1");
        }
        System.out.println(sb);
    }
    public static boolean check(int[] arr){
        int i = arr.length - 1;
        while (i > 0 && arr[i-1] >= arr[i]){
            i --;
        }
        if(i <= 0){
            return false;
        }
        int j = arr.length - 1;
        while (arr[i-1] >= arr[j]){
            j --;
        }
        int temp = arr[j];
        arr[j] = arr[i-1];
        arr[i-1] = temp;

        j = arr.length-1;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i += 1;
            j -= 1;
        }

        return true;
    }
}
