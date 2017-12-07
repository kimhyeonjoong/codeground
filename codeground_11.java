import java.util.Scanner;
/*
 * 주식거래문제
 * 
 * 당신은 세계적으로 유명한 증권 회사에서 일하고 있다.
 * 당신의 임무는 고객과 회사의 이익을 극대화하는 투자 전략을 개발하는 것이다. 회사의 주 수입은 거래 
 * 수수료로, 고객이 주식을 사고 팔 때마다 정액의 수수료를 회사에 지급한다. 즉, 수수료는 거래 금액과
 * 무관하게 거래 횟수에 비례한다.
 * 
 * 따라서, 회사의 이익을 극대화하기 위해서는 고객이 가능한 한 자주 주식을 사고 팔수록 좋다. 그러나
 * 이렇게 하면 회사의 이익을 저지미나 고객의 이익을 해칠 수 있고, 고객이 다른 회사로 떠날 수 있기
 * 때문에 고객이 이익을 보면서 주식을 최대한 자주 사고 팔게 해야 한다.
 * 
 * 전략을 개발하기 위해서 지난 n일의 특정한 한 회사의 주식 가격 변동을 가지고 회사와 투자자의
 * 이익을 모두 만족시키는 전략을 마련하려고 한다, 매일매일 고객은 아무것도 안하거나, 주식을 사거나,
 * 가진 주식을 모두 팔거나 셋 중 하나만 할 수 있다. 구체적으로, 매일 오전 10시 주식 가격을 보고
 * 고객은 다음과 같이 행동한다.
 * - 현재 주식을 가지고 있지 않다면, 주식을 구입할 수 있다. 단, 가격이 고객이 바로 직전에 주식을
 * 판 값보다 낮아야 한다.
 * - 현재 주식을 가지고 있다면, 이 날의 주식 가격이 고객이 주식을 산 날보다 높다면 고객은 가진
 * 주식을 모두 팔아서 이익을 실현시킬 수 있다. 만약 이 날의 주식 가격이 고개개이 주식을 산 날과
 * 같거나, 그보다 낮다면 고객은 절대로 가진 주식을 팔지 않는다.
 * - 주식을 가지고 있는 상태에서 주식을 또 구입할 수는 없다.
 * 이 전략에 따라 고객이 짝수 번 주식 거래를 한다면, 싼 값에 사고 비싼 값에 팔고를 반복하기 때문에
 * 고객은 반드시 이익을 보게 된다. 수수료는 금액이 작아서 무시할 수 있다. 회사 입장에서는, 이 조건을
 * 만족하면서 주식 거래를 최대한 자주 하면 가장 많은 수수료를 받을 수 있다. 따라서 주식 거래 횟수의
 * 최대값을 구하고자 한다.
 * 
 * 점수 : 0 점
 * 해결책 : 1. 먼저 주식을 가지고 있을때와 없을때로 구분한다.
 * 	      2. 주식이 없을때는 이어진 다음수가 더 큰 날의 주식을 산다.
 * 	      3. 주식이 있을때는 주식을 산날과 그날 뒤로의 가격을 비교하며 판다.
 * 	      4. 주식을 팔때는 주식 거래일자를 2일 늘린다.  
 */

class codeground_11 {

	public static void main(String args[]) throws Exception	{

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			int N = sc.nextInt();
			int dayPrice[] = new int[N]; 
			for(int i=0; i<N ; i++ ) {
				dayPrice[i] = sc.nextInt();
			}
			int cnt=0;
			int deal=0;
			int stock=-1;
			int beforedeal=1000000000;
			while(cnt<N-1) {
				if(stock==-1) { // 주식이 없을 때,
					for(int i=cnt; i<N-1 ; i++) {
						if(dayPrice[i] < dayPrice[i+1] && dayPrice[i] < beforedeal) {
							stock = i; // i번째 주식을 삼.
							break;
						}
						cnt++;
					}
				}else{ // 주식이 있을 때,
					for(int j=stock; j<N-1 ; j++) {
						if(dayPrice[stock] < dayPrice[j+1]) {
							deal+=2;
							cnt = j+2;
							stock = -1;
							beforedeal = dayPrice[j+1];
							break;
						}
					}
				}
			}
			
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(deal);
		}
	}
	
}