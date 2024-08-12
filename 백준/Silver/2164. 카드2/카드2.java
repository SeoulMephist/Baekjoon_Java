import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        int tmp;

        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (true) {
            if (q.size() == 1) {
                System.out.println(q.peek());
                break;
            }
            q.remove();

            tmp = q.poll();

            q.offer(tmp);
        }
    }
}