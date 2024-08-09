import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        get_prime();


        for(int i = m; i <= n; i++) {
            if(prime[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static void get_prime() {
        prime[0] = false;
        prime[1] = false;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(!prime[i]) {
                continue;
            }

            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = false;
            }
        }
    }
}