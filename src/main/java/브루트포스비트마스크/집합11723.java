package 브루트포스비트마스크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class 집합11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        int S = 0;
        for(int i = 0; i < M; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("all")) S = (1<<21)-1;
            else if(str.equals("empty")) S = 0;
            else{
                int num = Integer.parseInt(st.nextToken());
                if(str.equals("add")){
                    S |= (1 << num);
                }
                else if(str.equals("remove")){
                    S &= ~(1 << num);
                }
                else if(str.equals("check")){
                    sb.append((S & (1 << num)) != 0 ? 1 : 0).append("\n");
                }
                else if(str.equals("toggle")) {
                    S ^= (1 << num);
                }
            }
        }
        System.out.println(sb);
    }
}
