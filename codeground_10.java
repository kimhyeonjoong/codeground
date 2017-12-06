import java.util.ArrayList;
import java.util.Scanner;

class codeground_10 {

	public static void main(String args[]) throws Exception	{

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 0; test_case < T; test_case++) {
			int num;
			
			int div=2;
			num = sc.nextInt();
			int rst=num;
			while(true) {
				if(check(jinbeob(num,div))) {
					rst = div;
					break;
				}
				if((num+1)==div){
				    rst = num + 1;
				    break;
				}
				div++;
			}
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(rst);
		}
	}
	public static boolean check(String num) {
		boolean tof = true;
		String[] numarr = num.split(",");
		for(int i=0; i<numarr.length-1;i++) {
			if(!numarr[i].equals(numarr[i+1])) {
				tof=false;
			}
		}
		return tof;
	}
	public static String jinbeob(int num, int div) {
		String rst="";
		StringBuffer sb = new StringBuffer();
		int divresult=num;
		while(true) {
			if(divresult < div) {
				sb.append(divresult%div);
				break;
			}
			sb.append(divresult%div+",");
			divresult = divresult/div;
			
		}
		rst=sb.toString();
		sb.setLength(0);
		return rst;
	}
	
}