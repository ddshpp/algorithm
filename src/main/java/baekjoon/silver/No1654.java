package baekjoon.silver;

import java.util.Scanner;

public class No1654 {
    public static void main(String[] args) {
        /**
         요새, 문제풀다가 혼자힘으로 못푼경우가 허다했다...
         결국 검색하거나 힌트를 구해야한다던지... 봐서 이해라도 찰떡같이 되면 다행이지...

         아무튼 그렇게 자신감이 떨어지는 요즘

         이건 진짜 나 혼자 풀어냈다!

         이게 뭐가 어렵냐 호들갑이냐 할수있겠지만
         그건 상관없고

         아무튼 너무 기뻐서 아주~~아주~~ 특별히 이렇게 코멘트를 남긴다
         */
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();

        String[] firstInputs = firstInput.split(" ");
        int k = Integer.parseInt(firstInputs[0]);
        int n = Integer.parseInt(firstInputs[1]);

        int[] lanCables = new int[k];
        for (int i = 0; i < k; i++) {
            lanCables[i] = Integer.parseInt(scanner.nextLine());
        }

        long solution = solution(lanCables, k, n);
        System.out.println(solution);
    }

    public static long solution(int[] lanCables, int k, int n) {
        /**
         우선 가능여부 떠나서
         입력받은 랜선들을 다 합치고, 구해야하는 랜선갯수로 나눴다
         그러면 어찌됐건 수학적인? 정답의 최대치는 알수있으니까

         랜선길이 합친거 -> sumLanCables
         수학적인? 정답 = 랜선최대길이 = max

         이후 2가지를 체크했는데
         1. 길이 다합친게 n보다 작으면 쪼개봤자 0보다 작으니 0을 리턴 (ex 랜선은 90cm인데 100개로 쪼개야한다던지...) (정답은 센티미터 단위의 정수이기때문)
         2. 수학적인정답이 1이면 그냥 1로 쪼개면 되니까 1리턴
         */
        long sumLanCables = 0;
        for (int lanCable : lanCables) {
            sumLanCables += lanCable;
        }

        long max = sumLanCables / n;

        if (sumLanCables < n) return 0;
        if (max == 1) return 1;


        /**
         위의 과정을 지났으면 본격적인 계산에 들어간다

         문제는 여자처자해서 n개 쪼갤수있는 최댓값을 구해야하는 문제다

         계산은 특정길이로 쪼갠걸 세어봐서 -> count
         count가 n보다 같거나 많으면 -> 우선성공! -> 하지만 쪼갠값이 최갯값이 아닐수도있으니 특정길이 증가
         count가 n보다 작으면 -> 실패! -> 너무 길게 자른거니 특정길이 감소

         (위의 과정을 잘생각해보면, 실패한길이 > 성공한길이 인걸 알수있다)

         이 과정을 하면서, 점차 랜선의 범위를 좁혀갈껀데
         좁혀가면서
         n개 쪼개기가 성공한 랜선길이와, 실패했던 랜선길이를 저장해둘것이다 -> success,fail
         이후 실패한길이-성공한길이가 1이라면

         과정은 끝난다

         아래는 그 풀이다
         */


        long half = max / 2;

        long success = 0;
        long fail = 0;

        /**
         count = 쪼갠갯수 세는용도
         half = max / 2 = 범위를 조정할 변수 = 이후 half = (half + 1) / 2 형태로 조정

         success = 성공했던 길이 저장용
         fail = 실패했던 길이 저장용

         실패길이-성공길이 = 1 이 아니라면 무한반복!!!!!!
         */
        while (fail - success != 1) {

            //쪼개서 count증가 
            int count = 0;
            
            for (int i = 0; i < k; i++) {
                count += lanCables[i] / max;
            }

            //n개 이상 쪼개졌다면 길이 증가
            if (count >= n) {
                success = max;
                max += half;
                half = (half + 1) / 2;
            }
            // n개 이하로 쪼개졌다면 길이 감소
            else {
                fail = max;
                max -= half;
                half = (half + 1) / 2;
            }
        }
        
        //정답출력!!
        return success;
    }
}
