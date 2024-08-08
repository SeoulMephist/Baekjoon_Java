package bronze_5;
import java.io.*;

public class n_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        String str;

        for (int i = 0; i < t; i++) {
            str = br.readLine();

            sb.append(str.charAt(0)).append(str.charAt(str.length() - 1)).append("\n");
        }
        System.out.println(sb);
    }
}
