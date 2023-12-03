package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 골드바흐6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean prime[] = new boolean[1000001];
        prime[0]=prime[1]=true;
        for(int i=2; i < prime.length; i ++){
            if(!prime[i]){
                for(int j = i + i; j < prime.length; j+=i){
                    prime[j] = true;
                }
            }
        }
        int n = Integer.parseInt(br.readLine());
        while (n != 0){
            boolean isprove = false;
            for(int i = 2; i <= n/2; i ++){
                if(!prime[i] && !prime[n-i]){
                    System.out.println(n + " = " + i + " + " + (n - i));
                    isprove = true;
                    break;
                }
            }
            if(!isprove){
                System.out.println("Goldbach's conjecture is wrong.");
            }
            n = Integer.parseInt(br.readLine());
        }
    }
}
