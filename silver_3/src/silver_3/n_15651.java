package silver_3;
import java.io.*;
import java.util.StringTokenizer;

public class n_15651 {

    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        f1(n, m, 0);
        System.out.println(sb);
    }

    public static void f1(int n, int m, int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[depth] = i + 1;
            f1(n, m, depth + 1);
        }
    }
}
