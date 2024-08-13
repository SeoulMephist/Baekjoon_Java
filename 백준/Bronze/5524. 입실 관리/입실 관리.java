import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(br.readLine());
        String str;

        for (int i = 0; i < n; i++) {
            str = br.readLine();
            str = str.toLowerCase();
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}