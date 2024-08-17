import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String cite;
        String password;
        String search_cite;

        Map<String,String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            cite = st.nextToken();
            password = st.nextToken();

            map.put(cite,password);
        }

        for (int i = 0; i < m; i++) {
            search_cite = br.readLine();
            sb.append(map.get(search_cite)).append("\n");
        }

        System.out.println(sb);
    }
}