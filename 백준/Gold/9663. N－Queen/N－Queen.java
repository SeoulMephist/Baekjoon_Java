import java.io.*;

public class Main {

    static int n;
    static int[] map;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new int[n];

        search(0);
        //현재 퀸이 놓일 행

        System.out.println(cnt);
    }

    private static void search(int depth) {
        if (depth == n) {
            cnt++;
            return;
        }

        //현재 퀸이 놓일 열
        for (int i = 0; i < n; i++) {
            boolean check = true;

            //이전 퀸이 놓인 행
            for (int j = 0; j < depth; j++) {
                //map[j] : 이전 퀸이 놓인 열
                if (i == map[j]) {
                    check = false;
                    break;
                }

                //대각선 확인
                if (Math.abs(i - map[j]) == Math.abs(depth - j)) {
                    check = false;
                    break;
                }
            }

            if (check) {
                map[depth] = i;
                search(depth + 1);
            }
        }
    }
}