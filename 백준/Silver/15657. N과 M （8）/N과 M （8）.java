import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] input;
    static int[] arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        input = new int[n];
        arr = new int[m];

        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(input);

        f1(n, m, 0);

        System.out.println(sb);
    }

    static void f1(int n, int m, int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                if (i < m-1 && arr[i] > arr[i+1]) {
                    return;
                }
            }
            for (int i = 0; i < m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[depth] = input[i];
            f1(n, m, depth + 1);
        }
    }
}
