package com.kh.practice1.example;

import java.util.Scanner;//스캐너 import시킴

public class VariablePractice {

	public void method1() {
		//이름(String), 성별(char),나이(int),키(double)를 사용자에게 입력 받아 각각의 값을
		//변수에 담고 출력하세요.
		
		Scanner sc = new Scanner(System.in);//출력하기
		System.out.print("이름을 입력하세요 :");//이름 입력 유도
		String name = sc.nextLine();//name이라는 변수만들기 
		
		System.out.print("나이를 입력하세요 :");//나이 입력 유도
		int age = sc.nextInt();//age 변수 만들기 
		sc.nextLine(); //nextInt 와 충돌을 피하기위해 씀
		
		System.out.print("성별을 입력하세요(남/여) : ");//성별 입력 유도
		char gender = sc.nextLine().charAt(0); //문자한개 입력char.At(); 쓴다.
		
		System.out.print("키를 입력하세요(cm): "); //키 입력 유도
		double height =sc.nextDouble(); //height 변수 만듬
		
		
		System.out.println("키  "+ height+"인   "+ age+"살 "+ gender+"자  "+ name+"님   반갑습니다^^");
	}
	public void method2() {
		//키보드로 정수 두개를 입력 받아 두수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		//(HINT: +, - , * , /)
		Scanner sc= new Scanner(System.in);  //출력하기
		System.out.print("첫 번째 정수를 입력하세요 : "); //첫번째 정수 입력 유도
		int num1 = sc.nextInt();  //num1 변수 생성
		
		System.out.print("두 번째 정수를 입력하세요 : "); //두번째 정수 입력 유도
		int num2 = sc.nextInt();  //num2 변수 생성
		
		System.out.println();//한줄 비우기
		System.out.println("더하기 결과 : "+(num1 + num2)  ); //변수2개 더함
		System.out.println("빼기 결과 : "+ (num1 - num2)  ); //변수2개 뻄
		System.out.println("곱하기 결과: "+(num1 * num2)  ); //변수 2개 곱함
		System.out.println("나누기 결과: "+(num1 / num2)  ); //변수 2개 나눔	
	}
	public void method3() {
		//키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		//*참고 (면적=가로*세로,  둘레= (가로+세로)*2  )
		Scanner sc = new Scanner(System.in);//출력
		System.out.print("가로: "); //가로 입력 유도
		Double w =sc.nextDouble();//가로 변수
		
		System.out.print("세로: ");//세로 입력 유도
		Double v =sc.nextDouble(); //세로 변수
		
		System.out.println();//한줄 띄우기
		System.out.println("면적 : "+(w * v)  ); //면적= 가로*세로
		System.out.println("둘레 : "+(w+v)*2  ) ; //둘레= (가로+세로)*2	
	}
	public void method4() {
		//영어 문자열 값을 키보드로 입력 받아 앞의 문자 세개를 출력하세요.
		//HINT : charAt(인덱스) 메소드 활용해보기
		
		Scanner sc= new Scanner(System.in); //출력하기
		System.out.print("문자열을 입력하세요  :"); //입력 유도
		String str = sc.nextLine(); 
		
		//문자열로부터 문자를 추출: 문자열.charAt(몇번쨰문자의 위치)
		char first = str.charAt(0); //문자 하나 뽑아야 해서 charAt사용
		char second = str.charAt(1);  //변수 생성
		char third = str.charAt(2);
		
		System.out.println("첫 번째 문자 : "+first); //출력
		System.out.println("두 번째 문자 : "+second);
		System.out.println("세 번쩨 문자 : "+third);
		
		
	}
	
	
}













