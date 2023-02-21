package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No2775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //테스트케이스를 입력받고
        int testNumber = Integer.parseInt(scanner.nextLine());

        //2차원리스트를 만들어 각 리스트에 층과 호수를 입력받아 넣는다
        List<List<Integer>> input = new ArrayList<>();
        for (int i = 0; i < testNumber; i++) {
            input.add(new ArrayList<>());
            input.get(i).add(Integer.valueOf(scanner.nextLine()));
            input.get(i).add(Integer.valueOf(scanner.nextLine()));
        }

        //리턴받아와 출력
        List<Integer> solution = solution(testNumber, input);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static List<Integer> solution(int testNumber, List<List<Integer>> input) {
        //정답을 담아넘길 리스트를 하나 만들고
        List<Integer> result = new ArrayList<>();

        //테스트케이스만큼 수행하는 반복문
        for (int i = 0; i < testNumber; i++) {

            //각각 층과 호수를 꺼내온다
            int floor = input.get(i).get(0);
            int roomNumber = input.get(i).get(1);

            //계산을 위한 임시 2차원 리스트를 하나만든다. 건물이라고 보면된다 (+1의 이유는 0층도 존재하기 때문)
            List<List<Integer>> temp = new ArrayList<>(floor + 1);

            //층만큼 반복할텐데 문제에는 0층도 존재하니 반복범위를 잘 신경쓰자
            for (int k = 0; k <= floor; k++) {

                //각층에 방에 있는 사람숫자를 담을 임시 리스트하나 생성
                List<Integer> tempFloor = new ArrayList<>();

                //방호수만큼 반복하는데 문제에는 1번방부터 존재하지만 계산을 위해 0번방도 존재한다 가정하고 만들었다(어차피 0번방 쓸모없으니 만들어도 무방)
                for (int j = 0; j <= roomNumber; j++) {
                    
                    //만약 0층이라면 1번방엔 1명, 2번방엔 2명 ... 이렇게 넣어주고 
                    if (k == 0) {
                        tempFloor.add(j);
                    } 
                    //계산편의상 0번방이라면 0명을 넣어주고
                    else if (j == 0) {
                        tempFloor.add(j);
                    } 
                    //0층이 아닌경우 넣는 코드 / 예를들어 3층의 5번방은 = (3층의4번방 + 2층의5번방) 
                    else {
                        int sum = tempFloor.get(j - 1) + temp.get(k - 1).get(j);
                        tempFloor.add(sum);
                    }
                    
                    //끝방까지 계산다 했으면 = 해당층은 끝난거니까 건물리스트에(temp) 층의 리스트를 넣어준다
                    if (j == roomNumber) {
                        temp.add(tempFloor);
                    }
                }
            }
            
            //문제는 k층의 n번 방의 몇명이 사는지 구하는거니까 아래와 같이 정답리스트에 추가해준다
            result.add(temp.get(floor).get(roomNumber));
        }
        
        //테스트케이스만큼 반복을하여 정답들이 쌓였으니 통채로 리턴
        return result;
    }
}
