package com.kh.practice;
import java.util.Scanner;
public class KeyboardInputPractice {

	public void myCalculator() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ����:" );
		int i1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�ι�° ����:" );
		int i2 = sc.nextInt();
		sc.nextLine();
					
		System.out.println("���ϱ� ���: "+ (i1+i2));
		System.out.println("���� ���: "+(i1-i2));
		System.out.println("���ϱ� ���: "+(i1*i2));
		System.out.println("������ ���: "+(i1/i2));
		
	}
	
}
