import java.util.Scanner;
/*
 * 스타벅스는 하나의 문화다.
 * 그렇기 때문에 이 세상에 있는 문제들은 스타벅스와 연관이 있기도 하다.
 * 그런 여러 문제 중 하나로, 어떤 커피를 구매할 것이냐가 있다.
 * A사의 신입사원 김커피씨는 점심 시간이 끝나가면서 상사에게 커피를 사오라는 명령을 받았다.
 * 김커피씨는 법인 카드를 최대 k원 이용할 수 있다.
 * 김커피씨가 근무중인 부서에는 n명의 사람들이 있는데, 각각 원하는 커피의 종류가 정해져 있다.
 * 스타벅스에는 m개의 커피 종류가 있는데, 커피마다 1~m까지의 번호가주어져 있다.
 * 스타벅스 커피들의 가격과, 부서 사람들의 커피 기호와, 법인 카드 지출의 한계치인 k가 주어졌을 때,
 * 김커피씨가 n명 모두가 행복하게 주어진 돈으로 커피를 구매할 수 있을지 구하는 프로그램을 작성하라.
 * 
 * 결과 : 100점
 * 해답포인트 : 1. 배열두개를 이용한다.
 * 			 2. 사람들의 주문배열의 값을 커피 종류의 인자값으로 전달한다.
 * 			 3. 그 값들을 더하여 연산해서 결과를 낸다.
 */
class codeground_7 {
	static char Answer;

	public static void main(String args[]) throws Exception	{

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int N,M,K,sum;
		
		for(int test_case = 0; test_case < T; test_case++) {
			N = sc.nextInt();
			M = sc.nextInt();
			K = sc.nextInt();
			
			int [] order = new int[N];
			int [] price = new int[M+1];
			
			for(int i=0; i<N ; i++) {
				order[i] = sc.nextInt();
			}
			
			for(int i=1; i<M+1 ; i++) {
				price[i] = sc.nextInt();
			}
			sum = 0;
			for(int i=0; i<N; i++) {
				sum += price[order[i]];
			}
				
			if(K<sum)
				Answer = 'N';
			else
				Answer = 'Y';
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	} 	
}