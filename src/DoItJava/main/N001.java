package DoItJava.main;

import java.util.Scanner;

public class N001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //입력값을 String 형 변수 sNum에 저장한 후 char[]형 변수로 변환하기

        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        //String.toCharArray() 는 문자열을 한글자씩 쪼개서 이를 char[]배열에 넣어주는 것.
        int sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            sum+=cNum[i] -'0';
            //cNum[i]를 정수형으로 변환하면서 sum에 더해서 누적해주기.
            /*문자열을 숫자형으로 변경하려면 아스키코드를 사용하면 된다. 아스키코드에서 같은 의미의 문자와 숫자의 코드 값 차이는 48이다.
            예를 들어 문자 '1'을 숫자 1로 변환하려면 '1'-48 또는 '1'-'0'과 같이 연산하면 된다.*/

        }
        System.out.println(sum);
    }
}
