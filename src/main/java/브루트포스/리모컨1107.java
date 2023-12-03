package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 리모컨1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] broken = new boolean[10];
        for(int i = 0; i < K; i ++){
            broken[Integer.parseInt(st.nextToken())] = true;
        }
        int result = Math.abs(N - 100);
        for(int i = 0; i <= 999999; i ++){
            String str = String.valueOf(i);
            int leng = str.length();
            boolean isBroken = false;
            for(int j = 0; j < leng; j ++){
                if(broken[str.charAt(j) - '0']){
                    isBroken = true;
                    break;
                }
            }
            if(!isBroken){
                int min = Math.abs(N - i)+leng;
                result = Math.min(min, result);
            }
        }
        System.out.println(result);
    }
}
