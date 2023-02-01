package baekjoon.bronze;

import java.util.Scanner;

public class no_1157 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //문자열 입력받아서 전부 대문자로 만들기
        String input = scanner.nextLine();
        input = input.toUpperCase();

        //입력받은 문자열을 쪼개담을 배열을 만들고
        int[] inputAscii = new int[input.length()];
        //알파갯 갯수 셀용도로 알파뱃갯수만큼 빈 배열 만들어둠
        int[] alphaCase = new int[26];
        //최대값구하는용
        int max = alphaCase[0];

        //입력받은 문자열의 문자를 아스키코드로 바꾸는 작업
        for (int i = 0; i < input.length(); i++) {
            inputAscii[i] = (int)input.charAt(i);
        }

        //대문자 A의 아스키코드 구하는중...
        char bigA = 'A';
        int alphaNumber = (int)bigA;

        //입력받은 아스키코드 배열을 각각 알파뱃방에 넣는중(숫자세는용)
        for (int i = 0; i < inputAscii.length; i++) {
            int j = inputAscii[i]-alphaNumber;
            alphaCase[j] ++;
        }

        //제일 많이 나온 갯수를 찾는중...
        for (int i = 0; i < alphaCase.length; i++) {
            if(max<alphaCase[i]) {
                max = alphaCase[i];
            }
        }

        //제일 많이나온 알파뱃이 무엇인지 찾아내자
        int count =0;
        int maxAscii =0;
        for (int i = 0; i < alphaCase.length; i++) {
            if(max == alphaCase[i]) {
                count ++;
                maxAscii = i;
            }
        }

        if (count > 1) {
            System.out.println("?");
        }else {
            System.out.println((char) (maxAscii+65));
        }
    }
}
