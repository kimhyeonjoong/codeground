import java.util.Scanner;

/*
 * 세계적인 천재 정민이는 놀라운 로봇을 만들어 냈지만 전날 번개가 로봇에 떨어져서 로봇이 이상해져 버렸다.
 * 이제 이 로봇은 안녕 밖에 말할 줄 모른다. "안녕"
 * 슬픈 정민이는 이 로봇을 업데이트해준다.
 * 오늘 추가한 언어는 영어이다. 이제 이 로봇은 hello라고 말할수 있다.
 * 주어진 문자열에서 몇개의 문자를 골라 재배치 할 수 있다고 할 때
 * 만들 수 있는 hello의 개수는 최대 몇 개까?
 * 이전에 다른 hello를 만들기 위해 사용한 문자는 다음에 hello를 만들 때는 사용할 수 없다고 하자.
 * 
 * 결과 : 100점
 * 해답포인트 : 1. 입력받은 문자열을 h,e,l,o가 몇개인지 셈한다.
 * 			 2. l은 2번사용되기때문에 2로 나눈다.
 * 			 3. h, e, l, o 중 가장 적은 숫자의 알파벳을 찾는다. 
 */
class codeground6 {
	static int Answer;

	public static void main(String args[]) throws Exception	{

		Scanner sc = new Scanner(System.in);


		int T = sc.nextInt();
		int h,e,l,o, result;
		for(int test_case = 0; test_case < T; test_case++) {
			String hello = sc.next();
			h=0;e=0;l=0;o=0;
			
			for(int i=0; i<hello.length(); i++) {
				switch (hello.charAt(i)) {
					case 'h' :
						h++;
						break;
					case 'e' :
						e++;
						break;
					case 'l' :
						l++;
						break;
					case 'o' :
						o++;
						break;
				}
			}
			l /= 2;
			
			result = Math.min(Math.min(h, e) , Math.min(l, o));
			Answer = result;
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}