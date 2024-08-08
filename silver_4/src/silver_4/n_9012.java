package silver_4;
import java.io.*;

public class n_9012 {
    static String arr;
    static int left;
    static int right;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            arr = br.readLine();

            boolean tag = true;
            int tmp_l = 0;
            int tmp_r = 0;

            if (arr.charAt(0) == ')' || arr.charAt(arr.length() - 1) == '(') {
                System.out.println("NO");
                continue;
            }

            left = 0;
            right = 0;

            for (int j = 0; j < arr.length(); j++) {
                if (arr.charAt(j) == '(') {
                    left++;
                }
                if (arr.charAt(j) == ')') {
                    right++;
                    if (left < right) {
                        System.out.println("NO");
                        tag = false;
                        break;
                    }
                }
            }

            if (tag) {
                if (left == right) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
