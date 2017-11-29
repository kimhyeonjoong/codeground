package com;
import java.util.ArrayList;
import java.util.Scanner;

class Solution {
	static int Answer;

	public static void main(String args[]) throws Exception	{

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int num;
		int div=2;
		int i=0;
		int check=0;
		int rst;
		int divresult;
		for(int test_case = 0; test_case < T; test_case++) {
			num = sc.nextInt();
			divresult = num;
			//while(num<=div) {
				while(true) {
					check = divresult%div;
					divresult = divresult/div;
					if(divresult < div) {
						check = divresult%div;
						break;
					}
			//	}
			//	div++;
				
			//}
					System.out.println(check);

			//System.out.println("Case #"+(test_case+1));
			//System.out.println(Answer);
				}
		}
	}
	
}