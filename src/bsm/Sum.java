package bsm;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		System.out.println("안녕하세요 적당히 바람이 시원해"); 
		System.out.println("합을 구하고싶은 두 수을 입력하세요"); 
		
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		s1= scanner.next();
		s2= scanner.next();
		
		int a, b ;
		a= Integer.parseInt(s1);
		b= Integer.parseInt(s2);
		
		System.out.println("두수의 합은 "+(a+b)+" 입니다");
		scanner.close();
		
	}

}
