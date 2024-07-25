package gold_3;
import java.io.*;
import java.util.StringTokenizer;

public class n_17135 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M, D;
    static int[][] map;
    static int[][] process;
    static int result = 0;
    static int[][] playerPos = new int[3][2];
    static int[] pos1 = new int[2], pos2 = new int[2], pos3 = new int[2];
    static Player[] player = new Player[3];

    public static void main(String[] args) throws Exception {
        input();
        combination(0, 0, new int[3]);
        System.out.println(result);
    }

    public static class Player {
        int x;
        int y;

        public Player(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static void combination(int cnt, int start, int[] player) {
        if (cnt == 3) {
            int i = 0;
            for (int n : player) {
                playerPos[i][0] = N;
                playerPos[i++][1] = n;
            }
            cloneMap();
            int newScore = game();
            result = Math.max(result, newScore);
            return;
        }

        for (int i = start; i < M; i++) {
            player[cnt] = i;
            combination(cnt + 1, i + 1, player);
        }
    }

    private static int game() {
        int newScore = 0;
        int count = 0;
        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            player[i] = new Player(0, 0);
            nums[i] = Integer.MAX_VALUE;
        }

        int limit = N - D >= 0 ? N - D : 0;
        while (count < N) {
            for (int j = M - 1; j >= 0; j--) {
                for (int i = N - 1; i >= limit; i--) {
                    for (int n = 0; n < 3; n++) {
                        if (map[i][j] == 1) {
                            int value = Math.abs(playerPos[n][0] - i) + Math.abs(playerPos[n][1] - j);
                            if (D >= value) {
                                if (value <= nums[n]) {
                                    nums[n] = value;
                                    player[n].x = i;
                                    player[n].y = j;
                                }
                            }

                        }
                    }
                }
            }

            for (int n = 0; n < 3; n++) {
                if (player[n].x == 0 && player[n].y == 0) {

                } else {
                    if (map[player[n].x][player[n].y] != 0) {
                        newScore++;
                        map[player[n].x][player[n].y] = 0;
                    }
                }
                player[n] = new Player(0, 0);
                nums[n] = Integer.MAX_VALUE;
            }
            move();
            count++;
        }

        return newScore;
    }

    private static void move() {
        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < M; j++) {
                if (map[i - 1][j] == 1) {
                    map[i][j] = 1;
                } else {
                    map[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            map[0][i] = 0;
        }
    }

    private static void cloneMap() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = 0;
                if (process[i][j] == 1) {
                    map[i][j] = 1;
                }
            }
        }
    }

    private static void input() throws Exception {
        st = new StringTokenizer(br.readLine());
        N = stoi(st.nextToken());
        M = stoi(st.nextToken());
        D = stoi(st.nextToken());
        map = new int[N][M];
        process = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int input = stoi(st.nextToken());
                map[i][j] = input;
                process[i][j] = input;
            }
        }
    }

    private static int stoi(String input) {
        return Integer.parseInt(input);
    }
}