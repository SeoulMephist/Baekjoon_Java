import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int r;
        int w;
        int l;
        int index;

        index = 1;

        while (true) {
            st = new StringTokenizer(br.readLine());

            r = Integer.parseInt(st.nextToken());
            if (r == 0){
                break;
            }

            w = Integer.parseInt(st.nextToken());
            l = Integer.parseInt(st.nextToken());

            if (2 * r >= Math.sqrt(w * w + l * l)) {
                sb.append("Pizza " + index + " fits on the table.").append("\n");
            }
            else if (2 * r < Math.sqrt(w * w + l * l)) {
                sb.append("Pizza " + index + " does not fit on the table.").append("\n");
            }
            index++;
        }
        System.out.println(sb);
    }
}
