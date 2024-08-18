import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] input = new int[n];
        Stack<Integer> stack = new Stack<>();

        int num;
        int last = 0;

        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(br.readLine());

            if (num > last) {
                for (int j = last + 1; j <= num; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                last = num;
            }

            if (num == stack.get(stack.size() - 1)) {
                stack.pop();
                sb.append("-\n");
            }
        }

        if (stack.size() > 0) {
            System.out.println("NO");
            return;
        }

        System.out.println(sb);
    }
}