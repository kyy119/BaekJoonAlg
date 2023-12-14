package 큐와그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 큐10845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int A = 0;
        for(int i = 0; i < N; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push")){
                A = Integer.parseInt(st.nextToken());
                queue.offer(A);
            }else if(str.equals("pop")){
                if(queue.isEmpty()) sb.append(-1).append('\n');
                else sb.append(queue.poll()).append('\n');
            }else if(str.equals("size")){
                sb.append(queue.size()).append('\n');
            }else if(str.equals("empty")){
                if(queue.isEmpty()) sb.append(1).append('\n');
                else sb.append(0).append('\n');
            }else if(str.equals("front")){
                if(queue.isEmpty()) sb.append(-1).append('\n');
                else sb.append(queue.peek()).append('\n');
            }else if(str.equals("back")){
                if(queue.isEmpty()) sb.append(-1).append('\n');
                else sb.append(A).append('\n');
            }
        }
        System.out.println(sb);
    }
}
