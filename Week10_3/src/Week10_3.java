//구분자를 이용하여 split() 과 StringTokenizer()  비교

import java.util.*;
public class Week10_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("comma(,)를 이용하여 한 줄로 입력하세요. >> ");
		String s = input.nextLine();
		
		System.out.println("**SPLIT 사용");
		String[] sarr = s.split(",");
		
		for(int i = 0; i < sarr.length; i++) {
			System.out.print(sarr[i] + " ");
		}
		
		System.out.println("\n토큰 수 : " + sarr.length);
		

		System.out.println("\n**STRINGTOKENIZER 사용");
		StringTokenizer st = new StringTokenizer(s, ",");
		int count = st.countTokens();
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() + " ");
		}
		System.out.println("\n토큰 수 : " + count);
	}

}
