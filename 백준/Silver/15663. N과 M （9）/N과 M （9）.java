import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static int[] result;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        result = new int[n];
        visited = new boolean[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        combination(n, m, 0);
        System.out.println(sb);
    }

    static void combination(int n, int m, int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        int check = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (visited[i] || check == arr[i]) {
                continue;
            }

            check = arr[i];
            result[depth] = arr[i];
            visited[i] = true;
            combination(n, m, depth + 1);

            visited[i] = false;
        }
    }
}
