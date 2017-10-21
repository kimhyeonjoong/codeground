package com.hotjoong.javatutorials.eclipse;

/* 아래 기본 제공된 코드를 수정 또는 삭제하고 본인이 코드를 사용하셔도 됩니다.
단, 사용하는 클래스명이 Solution 이어야 하며, 가급적 Solution.java 를 사용할 것을 권장합니다.
이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해 볼 수 있습니다. */
import java.util.Scanner;
import java.io.FileInputStream;
import java.lang.Math;
/*
 * 정우가 다트핀을 n번 던졌을 때 얻은 총 점수를 구하여라.
 *
 * 결과 : 100점
 * 해답포인트  1. 다트판의 배수 점수 범위를 구해놓는다.
 * 			2. 입력좌표값이 어느 배수의 점수 범위인지 구한다.
 * 			3. math함수를 이용하여 입력표값이 몇도 범위인지 구한다.
 * 			4. 해당 각도의 범위의 점수와 배수를 계산하여 합계를 더한다.
 */
class codeground4 {
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
         int a,b,c,d,e;
         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();
         d = sc.nextInt();
         e = sc.nextInt();
         int dartround;
         dartround = sc.nextInt();
         int x,y;
         double distance;
         int sum=0;
         int score[] = {6,13,4,18,1,20,5,12,9,14,11,8,16,7,19,3,17,2,15,10};
         double theta;
         int multiple=1;
         
         for(int i=0 ; i<dartround ; i++){
         	x = sc.nextInt();
             y = sc.nextInt();
             distance = Math.sqrt((double)(x*x) + (double)(y*y));

         	if(distance<a){
         		sum += 50;
                 continue;
             }else if(distance>a && distance<b){
					multiple = 1;
             }else if(distance>b && distance<c){
             	multiple = 3;
             }else if(distance>c && distance<d){
             	multiple = 1;
             }else if(distance>d && distance<e){
             	multiple = 2;
             }else{
             	continue;
             }

             theta = Math.atan2(y,(double)x);
             theta *= (180/Math.PI);
             if(theta<0){
                 theta += 360;
             }
             theta += 9;
             theta = (theta + 360)%360;
             int t = (int)(theta/18);
             int add = multiple*score[t];
				sum += add;

         }

         
     

			// 이 부분에서 정답을 출력하십시오.
			System.out.println("Case #" + test_case);
			System.out.println(sum);
		}
	}
}
