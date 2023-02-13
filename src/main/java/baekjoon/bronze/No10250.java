package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No10250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testNum = Integer.parseInt(scanner.nextLine());

        List<String> input = new ArrayList<>();
        for (int i = 0; i < testNum; i++) {
            input.add(scanner.nextLine());
        }

        List<Integer> solution = solution(input);

        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static List<Integer> solution(List<String> input) {
        List<Integer> result = new ArrayList<>();

        for (String s : input) {
            String[] s1 = s.split(" ");
            int h = Integer.parseInt(s1[0]);
            int n = Integer.parseInt(s1[2]);

            List<List<Integer>> hotel = new ArrayList<>();
            for (int i = 0; i < h; i++) {
                hotel.add(new ArrayList<>());
            }

            int temp = 1;
            int floor = 1;
            int roomNumber = 1;

            while (temp != n) {
                if (floor == h) {
                    hotel.get(floor - 1).add(temp);
                    floor = 1;
                    roomNumber++;
                    temp++;
                } else {
                    hotel.get(floor - 1).add(temp);
                    floor++;
                    temp++;
                }
            }

            String roomNumberString = "";
            if (roomNumber < 10) {
                roomNumberString = "0" + roomNumber;
            } else {
                roomNumberString = String.valueOf(roomNumber);
            }

            String findRoom = floor + roomNumberString;
            result.add(Integer.parseInt(findRoom));
        }

        return result;
    }
}
