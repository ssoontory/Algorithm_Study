package DoItJava.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*한 줄 읽어옴. 그 한줄에는 배열개수 질의개수 두 가지가 들어있음.*/
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());

        /*long형 S배열을 정의. 1부터 시작하기 위해 S[0] = 0 배열 길이는 suNo+1 로 설정*/
        long[] S = new long[suNo+1];

        /*또 한 줄 읽어옴. 거기에는 배열의 값들이 줄줄이 들어오게됨. 그래서 suNo 수대로 값을 부분합 S[] 배열에 넣음*/
        st  = new StringTokenizer(br.readLine());

        for (int i = 1; i < suNo; i++) {
            S[i] = S[i -1] + Integer.parseInt(br.readLine());
        }

        /*또 한 줄 읽어옴. 거기에는 질의의 숫자만큼 반복하는 한줄이 들어올텐데, 값을 2번 뽑을 수 있고 그걸 각각 i와 j에 대입*/
        for (int q = 0; q < quizNo; q++) {
            st  = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(br.readLine());
            int j = Integer.parseInt(br.readLine());
            System.out.println(S[j] - S[i-1]);
        }
    }
}
