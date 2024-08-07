package silver_5;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(br.readLine());

        StringTokenizer st;
        String order;
        int num;
        boolean[] check;

        check = new boolean[20];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            order = st.nextToken();

            if (order.equals("add")) {
                num = Integer.parseInt(st.nextToken());
                check[num - 1] = true;
            }
            else if (order.equals("remove")) {
                num = Integer.parseInt(st.nextToken());
                check[num - 1] = false;
            }
            else if (order.equals("check")) {
                num = Integer.parseInt(st.nextToken());
                if (check[num - 1]) {
                    sb.append(1).append("\n");
                }
                else {
                    sb.append(0).append("\n");
                }
            }
            else if (order.equals("toggle")) {
                num = Integer.parseInt(st.nextToken());
                if (check[num - 1]) {
                    check[num - 1] = false;
                }
                else {
                    check[num -1] = true;
                }
            }
            else if (order.equals("all")) {
                Arrays.fill(check, true);
            }
            else if (order.equals("empty")) {
                Arrays.fill(check, false);
            }
        }
        System.out.println(sb);
    }
}
