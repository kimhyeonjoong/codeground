/* 아래 기본 제공된 코드를 수정 또는 삭제하고 본인이 코드를 사용하셔도 됩니다.
   단, 사용하는 클래스명이 Solution 이어야 하며, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해 볼 수 있습니다. */


   /*
   초등학생인 정우는 시험 기간을 맞아 공부를 시작해야 한다.
정우가 다니는 학교에서는 총 n개의 과목에 대해 시험을 보는데,
공부할 시간이 부족한 정우는 그중 k개의 과목만을 골라서 공부한다고 한다.
그리고, 정우는 매우 특이한 학생이어서, 어떤 과목을 공부한다면 그 과목에 대해서는 항상 동일한 점수를 받게 된다고 한다.
정우는 시험 점수 총합을 최대화하기 위해 k개의 과목을 골라야 한다.
하지만, 모든 과목을 공부할 시간이 없는 정우는, 당신에게 “최대 합계 점수” 를 받을 수있는 k개의 과목을 골라 달라고 한다.
k개 과목을 골랐을 때 정우가 받을 수 있는 최대 합계점수를 구하는 프로그램을 작성하라.
   */
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

/*  결과 : 100점
	해답포인트
	1. 점수들을 정렬한다.
	2. 선택할 k개 만큼 반복하며 큰 점수들을 합산한다.

*/
class codeground_3 {
	public static void main(String args[]) throws Exception	{
		/* 아래 메소드 호출은 앞으로 표준입력(키보드) 대신 input.txt 파일로 부터 읽어오겠다는 의미의 코드입니다.
		   만약 본인의 PC 에서 테스트 할 때는, 입력값을 input.txt에 저장한 후 이 코드를 첫 부분에 사용하면,
		   표준입력 대신 input.txt 파일로 부터 입력값을 읽어 올 수 있습니다.
		   또한, 본인 PC에서 아래 메소드를 사용하지 않고 표준입력을 사용하여 테스트하셔도 무방합니다.
		   단, Codeground 시스템에서 "제출하기" 할 때에는 반드시 이 메소드를 지우거나 주석(//) 처리 하셔야 합니다. */
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));
        
		Scanner sc = new Scanner(System.in);

		int TC;
		int test_case;

		TC = sc.nextInt();        
		for(test_case = 1; test_case <= TC; test_case++) {
			// 이 부분에서 알고리즘 프로그램을 작성하십시오.
        	int totalsubject;
            int selectsubject;

            totalsubject = sc.nextInt();
            selectsubject = sc.nextInt();
            int score[] = new int[totalsubject];
            
            for(int i=0 ; i<totalsubject ; i++){
            	score[i] = sc.nextInt();
            }
        
        	Arrays.sort(score);
			int maxsubject;
            int result = 0;
            
            for(int i=1 ; i<=selectsubject ; i++){
            	maxsubject = totalsubject - i;
                result += score[maxsubject];
            }

			// 이 부분에서 정답을 출력하십시오.
			System.out.println("Case #" + test_case);
			System.out.println(result);
		}
	}
}