import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[][] pos = new int[4][2];
    static double[][] distance = new double[4][4];
    static boolean[] visit = new boolean[4];
    static double min = Double.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //입력
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());

            pos[i][0] = Integer.parseInt(st.nextToken());
            pos[i][1] = Integer.parseInt(st.nextToken());
        }

        //각 점간 거리 이차원 배열을 통해 저장
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                distance[i][j] = Math.sqrt(Math.pow((pos[i][0] - pos[j][0]), 2) + Math.pow((pos[i][1] - pos[j][1]), 2));
            }
        }

        //가능한 순서 조합 찾기
        search(0, 0, 0);

        //출력
        System.out.println((int)min);
    }

    static void search(double result, int index, int cnt) {
        //모든 점 방문시 return 후, 바로 직전 선택 상황에서 다른 점을 선택하였을 때 어떻게 되는지 확인
        if(cnt == 4) {
            if (min > (int)result) {
                min = result;
            }
            return;
        }

        //깊이 조절
        if(visit[index]) return;

        visit[index] = true;

        //a~b의 거리를 result에 담았다면, b~? 까지의 거리를 담기 위해 [index][i]로 표기....
        for(int i=0; i<4; i++) {
            search(result + distance[index][i], i, cnt+1);
        }

        visit[index] = false;
    }
}
