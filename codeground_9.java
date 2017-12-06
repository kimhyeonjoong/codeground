
import java.util.Scanner;

/*
 *  독재자 김씨는 자신을 추앙하는 A,B ㄷ 가문의 힘을 얻어 거대한 영토를 다스리게 되었다.
 *  김씨는 자신이 소유한 영토에 속한 각 지역에 두 가문 사람들을 관리자로 삼으려 한다.
 *  하지만 인접한 두 지역의 관리자가 같은 가문 출신이면 세력을 합쳐 반란을 일으킬 수 있다.
 *  지역이 나뉜 경우 김씨는 인접한 두 지역에 같은 가문 출신의 사람을 배정하지 않고
 *  관리자를 임명 할 수 있다. 하지만 같은 가문의 사람이 붙어 있는 영토는 불가능하다.
 *  이 문제는 인접한 지역의 데이터가 주어졌을 때 과연 반란의 위험없이 김씨만 행복한 세상을 만들 수 있는지를
 *  판별하는 문제이다.
 * 
 *  점수 : 100점
 *  해결방법 : 1. 인접한 a와b를 불리언값으로 번갈아가며 준다.
 *  			2. 불리언값으로 인접한 곳에 대한 검사를 한다.
 */
class codeground_9 {
	public static void main(String args[]) throws Exception	{
        
		Scanner sc = new Scanner(System.in);

		int T;
		int test_case;

		T = sc.nextInt();        
		for(test_case = 1; test_case <= T; test_case++) {
				// 이 부분에서 알고리즘 프로그램을 작성하십시오. 기본 제공된 코드를 수정 또는 삭제하고 본인이 코드를 사용하셔도 됩니다.
	        	int n = sc.nextInt();
	        int l = sc.nextInt();
	        int x[] = new int [l];
	        int y[] = new int [l];
	        boolean A[] = new boolean [n+1];
	        for(int i=0 ; i<n+1 ; i++){
	        		A[i] = false;
	        }
	        for(int i=0 ; i<l ; i++){
	        		x[i] = sc.nextInt();
	        		y[i] = sc.nextInt();
	        		A[y[i]] = !A[x[i]];
	        }
	        int result = 1;
	        for(int i=0 ; i<l ; i++){
	        		if(A[x[i]]==A[y[i]]){
	        		result = 0;
	            }
	        }
	        
	        
	
	        // 이 부분에서 정답을 출력하십시오.
			System.out.println("Case #" + test_case);
			System.out.println(result);
		}
	}
}