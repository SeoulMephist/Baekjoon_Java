package bronze_2;
import java.io.*;
import java.util.StringTokenizer;

public class n_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
                cnt++;
            }
            else if (arr[i] != 2 && arr[i] % 2 == 0) {
                arr[i] = 0;
                cnt++;
            }
            else if (arr[i] != 3 && arr[i] % 3 == 0) {
                arr[i] = 0;
                cnt++;
            }
            else if (arr[i] != 5 && arr[i] % 5 == 0) {
                arr[i] = 0;
                cnt++;
            }
            else if (arr[i] != 7 && arr[i] % 7 == 0) {
                arr[i] = 0;
                cnt++;
            }
            else if (arr[i] != 11 && arr[i] % 11 == 0) {
                arr[i] = 0;
                cnt++;
            }
            else if (arr[i] != 13 && arr[i] % 13 == 0) {
                arr[i] = 0;
                cnt++;
            }
            else if (arr[i] != 17 && arr[i] % 17 == 0) {
                arr[i] = 0;
                cnt++;
            }
            else if (arr[i] != 19 && arr[i] % 19 == 0) {
                arr[i] = 0;
                cnt++;
            }
            else if (arr[i] != 23 && arr[i] % 23 == 0) {
                arr[i] = 0;
                cnt++;
            }
            else if (arr[i] != 29 && arr[i] % 29 == 0) {
                arr[i] = 0;
                cnt++;
            }
            else if (arr[i] != 31 && arr[i] % 31 == 0) {
                arr[i] = 0;
                cnt++;
            }
            else if (arr[i] != 37 && arr[i] % 37 == 0) {
                arr[i] = 0;
                cnt++;
            }
        }

        System.out.println(n - cnt);
    }
}
