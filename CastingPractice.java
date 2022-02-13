package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {

	public void method1() {
		//키보드로 문자 하나를 입력 받아 그 문자와 그 문자의 유니코드 값을 출력하세요.
		
		Scanner sc =new Scanner(System.in); //스캐너
		
		System.out.print("문자 : ");  //입력유도
		char alpa = sc.nextLine().charAt(0);  //문자만 뽑을 때 
		int ialpa = (int)alpa;  //char을 int로 변환
		
		System.out.println();
		System.out.println("A Unicode :"+ialpa);	
	}
	public void method2() {
		//실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력.
		//이 떄 총점과 평균은 정수형으로 처리.
		
		Scanner sc = new Scanner(System.in);//스캐너
		System.out.print("국어 : ");  //입력 유도
		double k = sc.nextDouble(); //실수형 변수 
		
		System.out.print("영어: "); //입력 유도
		double e = sc.nextDouble();
		
		System.out.print("수학: "); 
		double m = sc.nextDouble();
		
		int ik = (int)k;  //double실수인 k를 int정수로 변환 
		int ie = (int)e;
		int im = (int)m;
		System.out.println();
		System.out.println("총점 : "+(ik+ie+im));
		System.out.println("평균: "+(ik+ie+im)/3);	
	}
	public void method3() {
		//선언 및 초기환된 5개의 변수를 가지고 알맞은 사칙연산(+ - * / )과
		//형변환을 이용하여 주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요.
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
		System.out.println( (double)(iNum1)/fNum  ); //3.333333333333335 다시
		
		System.out.println( ch ); //'A' 
		System.out.println( (int)ch ); //65
		System.out.println( (int)ch + iNum1 ); // 75
		System.out.println(   (char)( (int)ch+iNum1)  );  //'K'
		
		
	}
	
	
	
}







