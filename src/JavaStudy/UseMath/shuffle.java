package JavaStudy.UseMath;

import java.util.Arrays;

public class shuffle {
    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < 100; i++) {
            int n = (int)(Math.random()*10); //0~9 중 랜덤으로 하나의 수 뽑기! 인덱스라서 0도 포함함
            int tmp = numArr[0];  //배열 첫번째 수를 int tmp에 대입
            numArr[0] = numArr[n];   //그리고 배열 첫번째 인덱스에 해당하는 수를 numArr[랜덤숫자] 값으로 덮음
            numArr[n] = tmp; //그리고 랜덤한 숫자에 해당하는 인덱스의 값에 아까 저장해둔 numArr[0] 값을 넣어줌

            //이렇게 100번을 반복해줌......
        }
        System.out.println(Arrays.toString(numArr));
    }
}
