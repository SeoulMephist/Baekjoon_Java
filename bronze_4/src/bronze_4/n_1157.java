package bronze_4;
import java.io.*;

public class n_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.toUpperCase();

        int[] alphabet = new int[26];
        int max = 0;
        char result = '?';

        for (int i = 0; i < str.length(); i++) {
            alphabet[str.charAt(i) - 65] += 1;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (max < alphabet[i]) {
                max = alphabet[i];
                result = (char) (i + 65);
            }
            else if (max == alphabet[i]){
                result = '?';
            }
        }
        System.out.println(result);
    }
}
