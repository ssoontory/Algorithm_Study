package DoItJava.main;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N004 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 두개의 변수 표의크기인 N 과 M 개의 정수 받아오기!
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //N개의 크기만큼 원본 배열 A 만들기!
        int A[][] = new int[N+1][N+1];
        for (int i = 1; i <N+1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < N+1; j++) {
                A[i][j] =Integer.parseInt(st.nextToken());
            }
        }

        //점화식을 이용해서 구간 합 구하는 이차원 배열 설정
        int D[][] = new int[N+1][N+1];
        for (int i = 1; i < N+1; i++) {
            for (int j = 1; j < N+1; j++) {
                //구간 합 구하기!
                D[i][j] = D[i][j-1] + D[i-1][j] -D[i-1][j-1] + A[i][j];
            }
        }


        //좌표값 받아서 값 구해보기

        for (int i = 0; i <M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = D[x2][y2] - D[x1-1][y2] -D[x2][y1-1] + D[x1-1][y1-1];
            System.out.println(result);
        }
    }
}
