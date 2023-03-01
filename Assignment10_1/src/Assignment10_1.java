//0 ~ 3 의 입력을 받아 가위바위보를 하고, 끝내기(3)를 입력하면 프로그램이 끝나도록 완성하세요.

import java.util.*;
public class Assignment10_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Random rd = new Random();
		int answer, com;

		while(true) {
			System.out.print("하나를 선택하시오 : 가위(0), 바위(1), 보(2), 끝내기(3) >> ");
			answer = input.nextInt();
			com = rd.nextInt(4);
			
			if(answer > 3 || answer < 0) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			} else if (answer == 3) {
				System.out.println("게임 끝");
				System.exit(0);
			}
			
			if(com == 0) {
				System.out.println("컴퓨터는 가위를 냈습니다.");
				
				if(answer == 1) {
					System.out.println("당신이 이겼습니다.");
				} else if(answer == 2) {
					System.out.println("컴퓨터가 이겼습니다.");
				} else {
					System.out.println("비겼습니다.");
				}
			} else if(com == 1) {
				System.out.println("컴퓨터는 바위를 냈습니다.");
				
				if(answer == 0) {
					System.out.println("컴퓨터가 이겼습니다.");
				} else if(answer == 2) {
					System.out.println("당신이 이겼습니다.");
				} else {
					System.out.println("비겼습니다.");
				}
			} else {
				System.out.println("컴퓨터는 보를 냈습니다.");
				
				if(answer == 0) {
					System.out.println("당신이 이겼습니다.");
				} else if(answer == 1) {
					System.out.println("컴퓨터가 이겼습니다.");
				} else {
					System.out.println("비겼습니다.");
				}
			}
		}
	}
}