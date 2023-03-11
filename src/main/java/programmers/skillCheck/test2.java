package programmers.skillCheck;

import java.io.IOException;

public class test2 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int storey = Integer.parseInt(br.readLine());

        int storey = 16;

        int solution = solution(storey);
        System.out.println(solution);
    }

    public static int solution(int input) {
        int count = 0;

        while (input > 0) {
            int value = input%10;

            if (value > 5) {
                count += (10 - value);
                input += 10;
                input /= 10;
            } else {
                count += value;
                input /= 10;
            }
        }

        return count;
    }
}
