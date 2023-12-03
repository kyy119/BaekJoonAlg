package 브루트포스재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 암호만들기1759 {
    public static int L,C;
    public static char[] arr,arr2;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new char[C];
        arr2 = new char[L];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < C; i ++){
            arr[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(arr);
        dfs(0,0);
    }
    public static void dfs(int at,int depth){
        if(depth == L){
            if(isValid()){
                System.out.println(arr2);
            }
            return;
        }
        for(int i = at; i < C; i ++){
            arr2[depth] = arr[i];
            dfs(i+1,depth+1);
        }
    }
    public static boolean isValid(){
        int mo = 0;
        int ja = 0;
        for(char c : arr2){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
                mo ++;
            }else{
                ja ++;
            }
        }
        if(mo >= 1 && ja >=2){
            return true;
        }else{
            return false;
        }
    }
}
