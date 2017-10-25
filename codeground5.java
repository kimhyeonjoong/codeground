
import java.util.Scanner;

/*
 * 태준이는 항상 걱정이 많다. 집에서 나와 학교를 가는 도중에도 가스 밸브는 잘 잠궜는지,
 * 불을 잘 껏는지, 문은 잘 잠궜는지 등의 걱정을 끊임없이 한다.
 * 이런 태준이의 문제는 걱정이 많다는 점이 아니라, 걱정을 하는 동안에는 집으로 돌아간다는 점이다.
 * 그래서 태준이가 집에서 나온 후 1분마다 A미터를 학교 방향으로 이동한 다음,
 * 걱정을 하느라 B미터를 집 방향으로 이동한다. 결국, 태준이는 매일같이 수업에 지각을 하게 되었다.
 * 태준이를 도와 집에서 나와 학교까지 걱정을 하며 걸어가는데 걸리는 시간을 알아내자.
 * 
 * 결과 : 100점
 * 해답포인트 : 1. 먼저 A를 이동한다.
 * 			 2. 도착했는지 검사한다.
 * 			 3. 도착하지 않았다면 집으로 돌아간다.
 */
class codeground5 {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int A,B,D,crtlocat,time;
		for(int test_case = 0; test_case < T; test_case++) {
			A = sc.nextInt();
			B = sc.nextInt();
			D = sc.nextInt();
			crtlocat = 0;
			time = 0;
			
			while(true) {
				crtlocat += A;
				time++;
				if(D<=crtlocat)
					break;
				crtlocat -= B;
			}
			Answer = time;
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}