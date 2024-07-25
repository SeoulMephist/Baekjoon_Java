package bronze_2;
import java.io.*;
import java.util.StringTokenizer;

public class n_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = new int[2];
        int[] card;
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        card = new int[input[0]];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < input[0]; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < input[0] - 2; i++) {
            for (int j = i + 1; j < input[0] - 1; j++) {
                for (int k = j + 1; k < input[0]; k++) {
                    if (card[i] + card[j] + card[k] > answer && card[i] + card[j] + card[k] <= input[1]) {
                        answer = card[i] + card[j] + card[k];
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
