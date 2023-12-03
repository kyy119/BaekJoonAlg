package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 카잉달6064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        for(int i = 0; i < K; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean check = false;
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int len = M*N/gcd(M,N);
            int n = 0;
            int result = -1;
            while (n * M< len){
                if((M*n+x-y)%N == 0){
                    result = M*n+x;
                    break;
                }
                n ++;
            }
            System.out.println(result);
        }
    }
    public static int gcd(int a, int b){
        if(b == 0){
            return 1;
        }
        return gcd(b, a%b);
    }
}
