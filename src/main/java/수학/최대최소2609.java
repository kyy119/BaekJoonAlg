package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대최소2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        System.out.println(gcd(A,B));
        System.out.println(A*B/gcd(A,B));
    }
    public static int gcd(int a, int b){
        if(b == 0){
            return 1;
        }
        return gcd(b,a%b);
    }
}
