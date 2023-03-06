package baekjoon.silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class No10828 {
    static List<Integer> list = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNumber = Integer.parseInt(br.readLine());

        for (int i = 0; i < testNumber; i++) {
            String input = br.readLine();

            switch (input) {
                case "pop":
                    int pop = pop();
                    System.out.println(pop);
                    break;
                case "size":
                    int size = size();
                    System.out.println(size);
                    break;
                case "empty":
                    int empty = empty();
                    System.out.println(empty);
                    break;
                case "top":
                    int top = top();
                    System.out.println(top);
                    break;

                default: {
                    String[] s = input.split(" ");
                    int value = Integer.parseInt(s[1]);
                    List<Integer> push = push(value);
                    break;
                }
            }
        }
    }

    public static List<Integer> push(int num) {
        list.add(num);
        return list;
    }

    public static int pop() {
        if (list.size()==0) {
            return -1;
        }else {
            int temp = list.get(list.size()-1);
            list.remove(list.size()-1);
            return temp;
        }
    }

    public static int size() {
        int size = list.size();
        return size;
    }

    public static int empty() {
        if (list.size()==0) {
            return 1;
        }else {
            return 0;
        }
    }

    public static int top() {
        if (size() == 0) {
            return -1;
        }else {
            int temp = list.get(list.size() - 1);
            return temp;
        }
    }
}
