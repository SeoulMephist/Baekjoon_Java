package silver_3;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n_15654 {
    static int[] input;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        input = new int[n];
        visit = new boolean[n];
        arr = new int[m];

        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(input);

        f1(n, m, 0);
        System.out.println(sb);
    }

    public static void f1(int n, int m, int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++){
                sb.append(input[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = input[depth];
                f1(n, m, depth + 1);
                visit[i] = false;
            }
        }
    }
}
