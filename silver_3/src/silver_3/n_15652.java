package silver_3;
import java.io.*;
import java.util.StringTokenizer;

public class n_15652 {
    static int[] arr;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visit = new boolean[n];

        f1(n, m, 0);
    }

    public static void f1(int n, int m, int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                for (int j = 0; j < i; j++) {
                    visit[j] = true;
                }
                arr[depth] = i+1;
                f1(n, m, depth + 1);
                for (int j = i; j > 0; j--) {
                    visit[j] = false;
                }
            }
        }
    }
}
