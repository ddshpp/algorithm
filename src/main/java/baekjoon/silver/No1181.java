package baekjoon.silver;

import java.util.*;

public class No1181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());

        Set<String> input = new HashSet<>();
        for (int i = 0; i < inputNumber; i++) {
            input.add(scanner.nextLine());
        }

        List<String> solution = solution(input);
        for (String s : solution) {
            System.out.println(s);
        }
    }

    public static List<String> solution(Set<String> input) {
        List<String> list = new ArrayList<>(input);

        list.sort(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));

        return list;
    }
}
