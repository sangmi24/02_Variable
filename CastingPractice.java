package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {

	public void method1() {
		//Ű����� ���� �ϳ��� �Է� �޾� �� ���ڿ� �� ������ �����ڵ� ���� ����ϼ���.
		
		Scanner sc =new Scanner(System.in); //��ĳ��
		
		System.out.print("���� : ");  //�Է�����
		char alpa = sc.nextLine().charAt(0);  //���ڸ� ���� �� 
		int ialpa = (int)alpa;  //char�� int�� ��ȯ
		
		System.out.println();
		System.out.println("A Unicode :"+ialpa);	
	}
	public void method2() {
		//�Ǽ������� ����, ����, ���� �� ������ ������ �Է� �޾� ������ ����� ���.
		//�� �� ������ ����� ���������� ó��.
		
		Scanner sc = new Scanner(System.in);//��ĳ��
		System.out.print("���� : ");  //�Է� ����
		double k = sc.nextDouble(); //�Ǽ��� ���� 
		
		System.out.print("����: "); //�Է� ����
		double e = sc.nextDouble();
		
		System.out.print("����: "); 
		double m = sc.nextDouble();
		
		int ik = (int)k;  //double�Ǽ��� k�� int������ ��ȯ 
		int ie = (int)e;
		int im = (int)m;
		System.out.println();
		System.out.println("���� : "+(ik+ie+im));
		System.out.println("���: "+(ik+ie+im)/3);	
	}
	public void method3() {
		//���� �� �ʱ�ȯ�� 5���� ������ ������ �˸��� ��Ģ����(+ - * / )��
		//����ȯ�� �̿��Ͽ� �ּ��� ���� ���� ���� ���� �������� �ڵ带 �ۼ��ϼ���.
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum =3.0f;
		
		double dNum = 2.5;
		
		char ch='A';
		
		System.out.println(iNum1 -(iNum2*2) ); //2
		System.out.println((int)dNum); //2
		
		System.out.println( (double)((iNum2*2)+ (int)dNum) ); //10.0
		System.out.println((double)iNum1); //10.0
		
		System.out.println(  ((double)iNum1 / iNum2) ); //2.5  
		System.out.println(dNum);  //2.5
		
		System.out.println((int)fNum); //3
        System.out.println( (int)(iNum1/ fNum)  ); //3
        
        System.out.println(  iNum1/fNum  ); //3.3333333
		System.out.println( (double)(iNum1)/fNum  ); //3.333333333333335 �ٽ�
		
		System.out.println( ch ); //'A' 
		System.out.println( (int)ch ); //65
		System.out.println( (int)ch + iNum1 ); // 75
		System.out.println(   (char)( (int)ch+iNum1)  );  //'K'
		
		
	}
	
	
	
}







