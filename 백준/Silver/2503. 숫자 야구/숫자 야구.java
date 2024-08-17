import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        boolean[] check = new boolean[999];
        int input_num;
        int strike;
        int ball;
        int test_strike;
        int test_ball;
        int answer = 0;
        for (int i = 123; i <= 987; i++) {
            check[i] = true;
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            input_num = Integer.parseInt(st.nextToken());
            strike = Integer.parseInt(st.nextToken());
            ball = Integer.parseInt(st.nextToken());

            for (int ans = 123; ans <= 987; ans++) {
                if (Integer.toString(ans).charAt(0) == Integer.toString(ans).charAt(1) ||
                Integer.toString(ans).charAt(0) == Integer.toString(ans).charAt(2) ||
                Integer.toString(ans).charAt(1) == Integer.toString(ans).charAt(2) ||
                Integer.toString(ans).charAt(0) == '0' ||
                Integer.toString(ans).charAt(1) == '0' ||
                Integer.toString(ans).charAt(2) == '0') {
                    check[ans] = false;
                    continue;
                }
                if (!check[ans]) continue;

                check[ans] = true;

                test_strike = 0;
                test_ball = 0;

                for (int comp1 = 0; comp1 < 3; comp1++) {
                    for (int comp2 = 0; comp2 < 3; comp2++) {
                        if (Integer.toString(input_num).charAt(comp1) == Integer.toString(ans).charAt(comp2)
                        && (comp1 == comp2)) {
                            test_strike++;
                        }
                        else if (Integer.toString(input_num).charAt(comp1) == Integer.toString(ans).charAt(comp2)
                        && (comp1 != comp2)) {
                            test_ball++;
                        }
                    }
                }

                if (!(test_strike == strike && test_ball == ball)) {
                    check[ans] = false;
                }
            }
        }

        for (int i = 123; i <= 987; i++) {
            if (check[i]) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
