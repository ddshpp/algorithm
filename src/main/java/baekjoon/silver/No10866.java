package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No10866 {
    static int front = 10000;
    static int back = 10000;
    static int size = 0;
    static int[] deque = new int[20001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNumber = Integer.parseInt(br.readLine());

        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < testNumber; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            switch (input) {
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    output.add(pop_front());
                    break;
                case "pop_back":
                    output.add(pop_back());
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

    static void push_front(int input) {
        deque[front] = input;
        front--;
        size++;
    }

    static void push_back(int input) {
        back++;
        size++;
        deque[back] = input;
    }

    static int pop_front() {
        if (size == 0) {
            return -1;
        }

        int value = deque[front + 1];
        front++;
        size--;
        return value;
    }

    public static int pop_back() {
        if (size == 0) {
            return -1;
        }
        int value = deque[back];
        back--;
        size--;
        return value;
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        }
        return 0;
    }

    public static int front() {
        if (size == 0) {
            return -1;
        }
        return deque[front + 1];
    }

    public static int back() {
        if (size == 0) {
            return -1;
        }
        return deque[back];
    }
}
