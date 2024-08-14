import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arr1;
    static int[] arr2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        arr1 = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr1);

        int m = Integer.parseInt(br.readLine());
        arr2 = new int[m];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            sb.append(binarySearch(arr2[i], 0, arr1.length - 1)).append('\n');
        }
        System.out.println(sb);
    }

    static int binarySearch(int key, int low, int high) {
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (key == arr1[mid]) {
                return 1;
            }
            else if (key < arr1[mid]) {
                high = mid - 1;
            }
            else if (key > arr1[mid]) {
                low = mid + 1;
            }
        }
        return 0;
    }
}