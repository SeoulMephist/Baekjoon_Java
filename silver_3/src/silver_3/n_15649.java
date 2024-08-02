package silver_3;
import java.io.*;
import java.util.StringTokenizer;

public class n_15649 {
    static boolean[] visit;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visit = new boolean[n];
        arr = new int[m];

        f1(n, m, 0);
    }

    public static void f1 (int n, int m, int depth) {

        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i+1;
                f1(n, m, depth + 1);
                visit[i] = false;
            }
        }
    }
}