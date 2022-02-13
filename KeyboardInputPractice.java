package com.kh.practice;
import java.util.Scanner;
public class KeyboardInputPractice {

	public void myCalculator() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수:" );
		int i1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번째 정수:" );
		int i2 = sc.nextInt();
		sc.nextLine();
					
		System.out.println("더하기 결과: "+ (i1+i2));
		System.out.println("빼기 결과: "+(i1-i2));
		System.out.println("곱하기 결과: "+(i1*i2));
		System.out.println("나누기 결과: "+(i1/i2));
		
	}
	
}
