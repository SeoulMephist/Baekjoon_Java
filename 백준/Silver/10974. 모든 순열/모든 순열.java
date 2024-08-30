import java.io.*;

public class Main {
   static StringBuilder sb = new StringBuilder();
   static int[] arr;
   static boolean[] visited;
   static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n];
        visited = new boolean[n];

        order(0);

        System.out.println(sb);
    }

    private static void order(int depth) {
        if (depth == n) {
            for (int i = 0; i < n; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            arr[depth] = i + 1;
            order(depth + 1);
            visited[i] = false;
        }
    }
}
