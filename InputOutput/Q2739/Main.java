package InputOutput.Q2739;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<10;) {
            sb.append(n).append(" * ").append(i).append(" = ").append(n*i++);
            System.out.println(sb);
            sb.setLength(0);
        }

        br.close();
    }
}
