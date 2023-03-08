package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No10845 {
    static int[] que = new int[10001];
    static int first = 0;
    static int last = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNumber = Integer.parseInt(br.readLine());

        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < testNumber; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            switch (input) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    output.add(pop());
                    break;
                case "size":
                    output.add(size());
                    break;
                case "empty":
                    output.add(empty());
                    break;
                case "front":
                    output.add(front());
                    break;
                case "back":
                    output.add(back());
                    break;
            }
        }

        for (int i : output) {
            System.out.println(i);
        }
    }

    public static void push(int input) {
        que[last] = input;
        last++;
    }

    public static int pop() {
        if (last - first == 0) {
            return -1;
        } else {
            int value = que[first];
            first++;
            return value;
        }
    }

    public static int size() {
        return last - first;
    }

    public static int empty() {
        if (last - first == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if (last - first == 0) {
            return -1;
        } else {
            return que[first];
        }
    }

    public static int back() {
        if (last - first == 0) {
            return -1;
        } else {
            return que[last - 1];
        }
    }
}
