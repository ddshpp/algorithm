package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No1259 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();

        while (scanner.hasNext()) {
            input.add(scanner.nextLine());
        }

        List<String> solution = solution(input);
        for (String s : solution) {
            System.out.println(s);
        }
    }

    public static List<String> solution(List<String> input) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < input.size()-1; i++) {

            String temp = input.get(i);
            int lastNum = temp.charAt(temp.length()-1);

            String reverse = new StringBuffer(temp).reverse().toString();

            if (temp.equals(reverse)) {
                result.add("yes");
            }else {
                result.add("no");
            }
        }

        return result;
    }
}
