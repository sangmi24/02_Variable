package com.kh.variable;

public class C_Cast {

	/*
	 * *형변환
	 * 값의 자료형을 바꾸는 개념
	 * 
	 * 컴퓨터 상에서 값 처리 규칙
	 * 1. = (대입연산자) 을 기준으로 왼쪽과 오른쪽은 같은 자료형이어야 한다.
	 *     => 즉, 같은 자료형에 해당하는 값만 대입이 가능
	 *     => 다른 자료형의 값을 대입하고자 한다면 "형변환"이 필수
	 * [ 표현법 ] 자료형 변수명 = (바꿀자료형)값;     
	 *     
	 * 2. 같은 자료형 끼리만 연산이 가능하다.
	 *    => 즉, 다른 자료형끼리 연산을 수행하고싶을 경우에는 "형변환" 이 필수 
	 * [ 표현법] 값 + (바꿀자료형)값;   
	 * 
	 * 형변환의 종류  
	 * 1. 자동형변환 => 자동으로 형변환이 진행되기 때문에 내가 직접 코드상으로 형변환 할 필요가 없음 
	 *                 작은  바이트의 자료형 값 -> 큰 바이트의 자료형 변수에 담을 경우 
	 * 2. 강제형변환 => 자동형변환이 진행되지 않는 경우 내가 직접 강제로 형변환 해야하는 경우
	 *                  큰 바이트의 자료형 값   -> 작은 바이트의 자료형 변수에 담을 경우
	 *                강제형변환을 명시적변환 이라고도 부른다.         
	 *          
	 * [ 표현법 ]  (바꿀자료형)자료형을바꾸고싶은값;                     
	 *   => (바꿀자료형): 형변환 연산자 , Cast 연산자                                            
	 */
	
	// 자동형변환: 작은 바이트의 자료형 값-> 큰 바이트의 자료형 변수에 담을 경우 발생
	public void autoCasting() {
		
		// 자동형변환이 되는 case
		//1. int(4byte) -> double (8byte) 
		int i1 = 10;
		double d1 =/*  (double)생략됨 */i1;
		
		System.out.println("d1 : "  +d1);
		// 자동으로 형변환이 되었다.
		// 그런데 int는 정수, double은 실수이므로
		// d1 10 -> 10.0 으로 형변환이 된다.
		
		int i2 =12;
		double d2 = 3.3;
		
		double result2 = /* (double) */i2 + d2; // 12.0 + 3.3=15.3 
		
		System.out.println("result2 " +result2);
		
		//2. int(4byte) -> long(8byte)
		int i3 = 1000;
		long l3 = /* (long) */i3;   // 1000
		
		long l4 = /* (long) */2000; // L을 붙이지 않아도 문제가 없는 이유: 자동형변환이 되기 때문에    
		
		System.out.println("l3  : "+ l3);
		System.out.println("l4  : "+ l4);
		
		//특이케이스3. long(8byte정수) -> float(4byte실수) 
	    //정수가 실수로 변환될 경우 큰 사이즈의 정수가 작은 사이즈의 실수로 변환이 가능하다.
		// 4byte float 형은 사실 long 형보다 담을 수 있는 값의 범위가 크기 때문에 가능하다.
		
		long l5 = 1000000000;
		float f5 = /*(float) */l5; //1.0E9 =1000000000.0
		
		System.out.println("f5: "+f5);
		
		//특이케이스4. char(2byte문자) <-> int(4byte정수) 양방향 형변환 가능
		char ch =/* (char) */ 65;
		
		System.out.println("ch : "+ ch);  //'A' 
		
		int num = /* (int) */'A';
		
		System.out.println("num :" +num);  //65
		
		System.out.println((int)'김');  // 44608
		
		/*
		 * 참고) 아스키코드표 
		 * 각 문자별로 고유한 숫자값으로 대치되서 표현되는 개념 ( 0 ~ 127, 영문자 대소문자 알파벳, 숫자 , 특수문자  )
		 * 'A' = 65 / 'a' = 97
		 * 
		 * 참고) 유니코드표
		 * 각 문자별로 고유한 숫자값으로 대치되서 표현되는 개념
		 * 아스키코드표의 확장된 개념 (0 ~ 65xxx, 영어, 숫자, 특수문자, 그 이외의 언어 )
		 */
		
		int sum = 'A' + 10 ;  // 65 + 10 = 75
		
		System.out.println("sum : "+ sum); //문자와 정수 사이에 산술연산이 가능하다. 
		System.out.println("sum : "+ (char)sum ); //알파벳 별로 고유값을 확인 가능하다. 
		
		//특이케이스5. byte, short끼리의 연산 
		byte b1 = 1; 
		byte b2 = 10;
		
		byte result = (byte)(b1 + b2);// int 형의 결과를 강제로 byte형으로 변환  
		//byte 나 short 연산시 무조건 int(4byte)로 취급
		
	}//autoCasting 메소드 영역 끝
			
     // 강제(명시적) 형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 형변환 할경우(무조건 형변환 연산자를 붙여야 할 경우 )
	public void forceCasting() {
		
		//강제형변환 해야하는case
		
		//1. double(8byte) -> float(4byte)
		float f1 = 4.0f; //항상 f를 붙여줘야 함.
		
		double d2 = 8.0;
		float f2 = (float)d2;
		
		//2. double(8byte) -> int (4byte)
		double d3 = 10.89;
		int i3 = (int)d3; // 10.89 -> 10
		
		System.out.println("i3 : "+i3);
		// 강제 형변환 시 주의사항
		// 데이터 손실이 일어날  수 있다. 강제형변환은 신중히 해야한다. 
		//=> 소숫점 아래 내용이 절삭되었다.
		
		int iNum = 10;
		double dNum = 5.89;
		
		 // int iSum = iNum+ dNum ;
		//iNum +dNum : iNum이 상대적으로 큰 사이즈인 double 형으로 자동형변환이 되고
		//             dNum과 덧셈연산이 행해진 상태 => 그래서 지금 double 형태이다. 
		
		//해결방법
		//1. 연산결과를 int형에 맞춰서 강제 형변환시키기 
		  int iSum = (int)(iNum +dNum);
		  
		  System.out.println("iSum : "+ iSum); // 15.89 -> 15
		  
	   //2. 덧셈 연산 전에 dNum을 int형으로 강제형변환 후에 덧셈 연산을 수행
	   //=> 자동형변환은 작은 바이트가 큰 바이트로 변환되기 떄문에
	   //   원래대로라면 iNum이 double 로 변환 후에 덧셈이 실행되는 순서
	   //=> 그런데 그 전에 일부러 dNum 을 int형으로 강제로 변환시키고 나서 덧셈 연산을 수행
		  int iSum2 = iNum +(int)dNum ; // 10 +5.89 -> 10+5
		  
		  System.out.println("iSum : " + iSum2); //15
		  
	   //3. 결과값을 double 형 변수에 담기
	   //=>  이경우, 데이터 손실이 없어서 정확한 값이 담긴다.
		  double dSum = iNum + dNum ; //10.0 +5.89 
		  System.out.println("dSum : " +dSum); //15.89 
		  
		/*
		 * 강제형변환을 주로 하는 경우
		 * Type mismatch: cannot convert from xxx to xxx 오류 발생시
		 */
	}
	
	
	
	
	
	
}









