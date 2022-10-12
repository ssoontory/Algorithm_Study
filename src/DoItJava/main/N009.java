package DoItJava.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N009 {
    static int checkArr[]; //문제의 조건!
    static int nowArr[];
    static int checknum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int tl = Integer.parseInt(st.nextToken());  //tl : Total Length 전체 길이!
        int pl = Integer.parseInt(st.nextToken());  //pl : part length
        int result = 0;

        char A[] = new char[tl]; // 처음 받아올 문자열 데이터 (전체)
        checkArr = new int[4]; // "ACGR" 순서대로 저장된 데이터
        nowArr = new int[4]; // 현재 상태배열. 현재 네 부분문자게 어떻게 되어있는지
        checknum = 0; //현재 배열중에 몇개가 비밀번호 배열에 만족하는지를 나타내주는 수.

        A = br.readLine().toCharArray();
        //배열 A는 바로 입력받은 값 대입해준다.

        st = new StringTokenizer(br.readLine()); //ACGR 최소 갯수 받을 준비
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checknum++;
                //받아온 checkArr[i] 에 해당하는 값이 0이면, 굳이 신경 슬 필요가 없기 때문에 checknum ++ 해주기!
            }
        }

        for (int i = 0; i < pl; i++) {
            Add(A[i]);
        }
        if (checknum == 4) {
            result++;
        }

        //슬라이딩 윈도우 처리 부분
        for (int i = pl; i < tl; i++) {
            int j = i - pl;
            Add(A[i]);
            Remove(A[j]);

            if (checknum == 4)
                result++;
        }

        System.out.println(result);
        br.close();
    }

        private static void Add(char c) {
            //새로들어온 문자를 처리하는 함수
            switch (c){
                case 'A':
                    nowArr[0] ++;
                    if(nowArr[0] == checkArr[0]){
                        checknum++;
                    }break;
                case 'C' :
                    nowArr[1] ++;
                    if(nowArr[1] == checkArr[1]){
                        checknum++;
                    }break;
                case 'G':
                    nowArr[2] ++;
                    if(nowArr[2] == checkArr[2]){
                        checknum++;
                    }break;
                case 'T':
                    nowArr[3] ++;
                    if(nowArr[3] == checkArr[3]){
                        checknum++;
                    }break;

            }
        }


        private static void Remove(char c){
            //새로들어온 문자를 처리하는 함수
            switch (c){
                case 'A':
                    if(nowArr[0] == checkArr[0]){
                        checknum--;
                        nowArr[0] --;
                    }break;
                case 'C' :
                    if(nowArr[1] == checkArr[1]){
                        checknum--;
                        nowArr[1] --;
                    }break;
                case 'G':
                    if(nowArr[2] == checkArr[2]){
                        checknum--;
                        nowArr[2] --;
                    }break;
                case 'T':
                    if(nowArr[3] == checkArr[3]){
                        checknum--;
                        nowArr[3] --;
                    }break;

            }
        }
    }



