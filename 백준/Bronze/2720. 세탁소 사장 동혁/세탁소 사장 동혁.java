import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int num;

        for (int i = 0; i < t; i++) {
            num = Integer.parseInt(br.readLine());

            sb.append(num / 25).append(" ");
            num %= 25;
            sb.append(num / 10).append(" ");
            num %= 10;
            sb.append(num / 5).append(" ");
            num %= 5;
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}
