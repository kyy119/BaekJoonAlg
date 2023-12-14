package 큐와그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 덱10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A = 0;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < N; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("push_front")){
                A = Integer.parseInt(st.nextToken());
                deque.addFirst(A);
            }else if(str.equals("push_back")){
                A = Integer.parseInt(st.nextToken());
                deque.addLast(A);
            }else if(str.equals("pop_front")){
                if(deque.isEmpty()) sb.append(-1).append('\n');
                else sb.append(deque.pollFirst()).append('\n');
            } else if (str.equals("pop_back")) {
                if(deque.isEmpty()) sb.append(-1).append('\n');
                else sb.append(deque.pollLast()).append('\n');
            } else if (str.equals("size")) {
                sb.append(deque.size()).append('\n');
            } else if (str.equals("empty")) {
                if(deque.isEmpty()) sb.append(1).append('\n');
                else sb.append(0).append('\n');
            }else if (str.equals("front")) {
                if(deque.isEmpty()) sb.append(-1).append('\n');
                else sb.append(deque.peekFirst()).append('\n');
            }else if (str.equals("back")) {
                if(deque.isEmpty()) sb.append(-1).append('\n');
                else sb.append(deque.peekLast()).append('\n');
            }
        }
        System.out.println(sb);
    }
}
