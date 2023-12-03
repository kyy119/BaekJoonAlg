package 브루트포스재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 부등호2529 {
    static int K;
    static char[] arr;
    static boolean[] check;
    static ArrayList answer  = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        K = Integer.parseInt(br.readLine());
        arr = new char[K];
        check = new boolean[10];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < K; i ++){
            arr[i] = st.nextToken().charAt(0);
        }
        dfs(0,"");
        Collections.sort(answer);
        System.out.println(answer.get(answer.size()-1));
        System.out.println(answer.get(0));

    }
    public static void dfs(int depth, String str){
        if(depth == K+1){
            answer.add(str);
            return;
        }
        for(int i = 0; i <= 9; i ++){
            if(check[i]){
                continue;
            }
            if(depth == 0 || ck(str.charAt(depth-1), (char) (i+'0'), arr[depth-1])){
                check[i] = true;
                dfs(depth +1, str + Integer.toString(i));
                check[i] = false;
            }
        }
    }
    public static boolean ck(char a, char b, char c){
        if(c == '<'){
            if(a > b){
                return false;
            }
        }else if(c == '>'){
            if(a < b){
                return false;
            }
        }
        return true;
    }
}
