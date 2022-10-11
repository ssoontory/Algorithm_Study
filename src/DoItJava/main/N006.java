package DoItJava.main;

import java.util.Scanner;

public class N006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int start_index =  1;
        int end_index =  1;
        int sum = 1;

        while (end_index != N){
            if (sum == N) {
                //현재 연속 합이 N과 같은 경우
                count++;
                end_index++;
                sum = sum + end_index;
            } else if (sum > N) {
                //현재 연속 합이 N보다 큰 경우
                sum = sum -start_index;
                start_index++;
            } else {
                //현재 연속 합이 N보다 작은 경우
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);
        }

    }

