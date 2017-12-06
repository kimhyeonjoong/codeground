/*
초등학교 학생인 정우와 석환이는 최근 학교에서 두 이진수의 XOR 연산에 대해 배웠다. 둘은 매우 영특한 학생이라 새로 배운 연산을 갖고 이리저리 장난치기 시작했다.
다만 석환이는 정우에게 일을 시키는 것을 좋아하는지라 다음과 같은 제안을 했다.
"내가 N개의 10진수를 주면, 주어진 숫자들 중에서'홀수'번만 나타나는 숫자들을 모두 XOR한 결과를 구해줘."
예를 들어 '2,5,3,3'이 주어질 경우'2'와'5'는 1번(홀수 번)나타나고 '3'은 2번(짝수 번)나타나므로
홀 수 번 나타난 '2'와'5'를 XOR한 결과를 구해야 하고,
'2,5,3,3,2,4,5,3'이 주어질 경우 '2'와 '5'는 2번 나타나고, '3'은 3번 '4타는 1번 나타나므로
홀수 번 나타난 '3'과 '4'를 XOR한 결과를 구해야 한다.
정우는 제안을 수락했지만, 가면 갈수록 매번 XOR연산을 수행하는 일에 지치고 있다.
정우를 도와서 주어진 문제를 해결하는 프로그램을 작성하시오.

-제한 시간 : 전체 테스트 케이스는 20개 이하이다. 전체 수행 시간은 1초 이내. (java 2초 이내)

-메모리 사용 제한 : heap, global, static 총계 256MB, stack 1MB
*/
/* 아래 기본 제공된 코드를 수정 또는 삭제하고 본인이 코드를 사용하셔도 됩니다.
   단, 사용하는 클래스명이 Solution 이어야 하며, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해 볼 수 있습니다. */

/* 결과 : 100점
   해답 포인트
   1. 0과 XOR연산을 하면 연산의 결과는 하기 전과 같다. 
   2. 같은 2진수를 XOR연산을 2번 하게 되면 0이 된다.
*/
import java.util.Scanner;
import java.io.FileInputStream;

class codeground_1 {
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
            int round;
            round = sc.nextInt();
            int bits;
            int result=0;
            for(int i=0 ; i<round ; i++){
                bits = sc.nextInt();
                result ^= bits;
            }


			// 이 부분에서 정답을 출력하십시오.
			System.out.println("Case #" + test_case);
            System.out.println(result);
			
		}
	}
}