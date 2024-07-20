package bronze_3;
import java.io.*;
import java.util.StringTokenizer;

public class n_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = -1_000_001;
        int min = 1_000_001;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] >= max) {
                max = arr[j];
            }
            if (arr[j] <= min) {
                min = arr[j];
            }
        }

        System.out.printf("%d %d", min, max);
    }
}
