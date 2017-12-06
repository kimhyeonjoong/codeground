
import java.util.Scanner;
import java.io.FileInputStream;

/* 
 * n개의 자연수로 이루어진 수열과 자연수 s가 주어졌을 때, 합이 s보다 같거나 큰 수열의
 * 부분배열 중 크기가 가장 작은 부분배열의 크기를 구하는 문제다.
 * 예를 들어, 수열 5,1,3,5,10,7,4,9,2,8가 주어지고, s가 15라면 [10,7]이 합이
 * s보다 같거나 큰 부분배열 중 크기가 가장 작은 부분배열이다. 그러므로 답은 2가 된다.
 * 
 * 점수 : 90점
 * 해결방법 : 	1. 배열의 맨 앞부터 더한다.
 * 		    2. s보다 큰지 검사하며 카운트를 한다.
 * 			3. 배열의 가장 앞의 수를 제외하고 다시 더하며 1,2번을 반복한다.
 * 
 * 문제점 : 더하는 것에 부분적인 반복이 일어난다. 
 */

class codeground_8 {
    public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		int T;
		int test_case;
		int s;
		int count;
		T = sc.nextInt();        
        int[] sy;
        int sum;
        int n;
		for(test_case = 1; test_case <= T; test_case++) {
			// 이 부분에서 알고리즘 프로그램을 작성하십시오. 기본 제공된 코드를 수정 또는 삭제하고 본인이 코드를 사용하셔도 됩니다.
        	    n = sc.nextInt();
            s = sc.nextInt();
			count=n;
            sy = new int[n];
            for(int i=0;i<n;i++)
            	sy[i]=sc.nextInt();
            
            for(int i=0;i<n;i++)
            {
                sum = 0;
                for(int j=i;j<n;j++)
                {
                	sum += sy[j];
                    if(s<=sum)
                    {
                    	if(count>j+1-i)
                			count=j+1-i;
                       	break;
                    }
                }
            }
            if(count==n)
            		count = 0;
			// 이 부분에서 정답을 출력하십시오.
            System.out.println("#testcase" + test_case);
			System.out.println(count);
			
		}
	}
}