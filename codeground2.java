/* 아래 기본 제공된 코드를 수정 또는 삭제하고 본인이 코드를 사용하셔도 됩니다.
   단, 사용하는 클래스명이 Solution 이어야 하며, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해 볼 수 있습니다. 

삼성 프로그래밍 경진대회는 권위 있는 대회이다.
대회는 여러 라운드를 통해서 진행되며, 모든 라운드에 총 n명의 응시자가 있다.
각 라운드 별로 1등은 n점, 2등은 n-1점 순으로 순차적으로 점수를 얻게 되고 뒤에서 2등은 2점, 뒤에서 1등은 1점을 얻게 된다.
그리고 각 라운드 별로 동점자는 없으며, "종합 점수(각 라운드 마다 받은 점수의 합)"가 가장 높은 사람이 최종 우승하게 된다.
마지막 라운드 직전까지의 종합 점수가 주어졌을 떄, 최종 우승할 가능성이 있는 "응시자의 수"를 구하는 프로그램을 작성하시오.
각 라운드 별로 동점자는 없지만, 종합 점수에서는 동점자가 있을 수가 있으며, 또한 "공동 우승자"가 있을 수 있음에 유의하라.


-제한 시간 : 전체 테스트 케이스는 5개 이하이다. 전체 수행 시간은 1초 이내. (java 2초 이내)

-메모리 사용 제한 : heap, global, static 총계 256MB, stack 1MB

*/
import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;


/*  결과 : 100점
    해답 포인트
    1. 먼저 소팅하여 오름차순으로 정렬한다.
    2. 가장 낮은 수 부터 가장 큰 배점으로 점수를 부여해본다.
    3. 부여받은 점수 중에 가장 큰 점수가 가장 낮은 점수의 사람이 우승한 경우이다.
    4. 그렇다면 최종직전 점수에 가장 큰 점수를 더한 값이 가장 낮은 점수에 사람이 우승할 점수 보다 높으면 우승 가능자이다.

*/
class Solution {
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
        	int people;
            int result=0;
            people = sc.nextInt();
            int score[] = new int[people];
            for(int i=0 ; i<people ; i++){
            	score[i] = sc.nextInt();
            }
            Arrays.sort(score);
            int secondscore[] = new int[people];
            int max = 0;            
            for(int i=0 ; i<people ; i++){
                if((score[i]+people-i) > max){
                	max = score[i]+people-i;
                }
            }
    
            for(int i=0 ; i<people ; i++){
                if(score[i]+people >= max){
                	result += 1;
                }
            }
            

			// 이 부분에서 정답을 출력하십시오.
			System.out.println("Case #" + test_case);
            System.out.println(result);
		}
	}
}