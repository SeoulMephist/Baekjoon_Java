import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        float unit;
        String score_txt;
        float score_num = 0;
        float total_unit = 0;
        float sum = 0 ;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();

            unit = Float.parseFloat(st.nextToken());
            score_txt = st.nextToken();

            if (score_txt.equals("A+")) {
                score_num = 4.5f;
            }
            else if (score_txt.equals("A0")) {
                score_num = 4.0f;
            }
            else if (score_txt.equals("B+")) {
                score_num = 3.5f;
            }
            else if (score_txt.equals("B0")) {
                score_num = 3.0f;
            }
            else if (score_txt.equals("C+")) {
                score_num = 2.5f;
            }
            else if (score_txt.equals("C0")) {
                score_num = 2.0f;
            }
            else if (score_txt.equals("D+")) {
                score_num = 1.5f;
            }
            else if (score_txt.equals("D0")) {
                score_num = 1.0f;
            }
            else if (score_txt.equals("F")) {
                score_num = 0.0f;
            }
            else if (score_txt.equals("P")) {
                score_num = 1.0f;
                unit = 0;
            }

            sum += score_num * unit;
            total_unit += unit;
        }
        System.out.println(sum / total_unit);
    }
}
