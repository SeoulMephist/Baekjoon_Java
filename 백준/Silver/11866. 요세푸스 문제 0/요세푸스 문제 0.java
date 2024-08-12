import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int tmp;

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.add(i + 1);
        }

        sb.append("<");
        while (!q.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                tmp = q.poll();
                q.offer(tmp);
            }

            if (q.size() == 1) {
                sb.append(q.remove()).append(">");
                break;
            }
            sb.append(q.remove()).append(", ");
        }

        System.out.println(sb);
    }
}
