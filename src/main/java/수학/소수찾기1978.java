package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        while(T-- > 0){
            int N = Integer.parseInt(st.nextToken());
            if(isPrime(N)){
                count ++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(int a){
        if(a == 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(a); i ++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
}
