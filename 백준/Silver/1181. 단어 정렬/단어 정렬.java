import java.io.*;
import java.util.*;

public class Main {
    static String[] input;
    static String temp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        input = new String[n];

        for (int i = 0; i < n; i++) {
            input[i] = br.readLine();
        }

        Arrays.sort(input, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        System.out.println(input[0]);
        for (int i = 1; i < n; i++) {
            if (input[i].equals(input[i-1])) {
                continue;
            }
            System.out.println(input[i]);
        }
    }
}