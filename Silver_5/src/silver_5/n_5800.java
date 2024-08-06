package silver_5;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n_5800 {
    static int max;
    static int min;
    static int n;
    static int gap;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        int n;
        int[] arr;
        int max;
        int min;
        int gap;

        StringTokenizer st;

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            arr = new int[n];

            max = 0;
            min = 100;
            gap = Integer.MIN_VALUE;

            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            min = arr[0];
            max = arr[n - 1];
            for (int j = 0; j < arr.length-1; j++) {
                if (gap < arr[j+1]-arr[j]) {
                    gap = (arr[j+1]- arr[j]);
                }
            }

            System.out.printf("Class %d\n", i + 1);
            System.out.printf("Max %d, Min %d, Largest gap %d\n", max, min, gap);
        }
    }
}
