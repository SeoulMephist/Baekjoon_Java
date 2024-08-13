import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        ArrayList<Character> list = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while (n > 0) {
            if (n % b < 10) {
                list.add((char)(n % b + '0'));
            }
            else if (n % b >= 0) {
                list.add((char)(n % b - 10 + 'A'));
            }
            n /= b;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
        }
        System.out.println(sb);
    }
}
