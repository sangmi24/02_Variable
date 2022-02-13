package com.kh.variable;

public class A_Variable {
	
	//시급과 근무시간과 근무일수를 곱해서 월급을 계산하여 출력하는 메소드
	public void printSalary() {
		
		System.out.println("=====변수 사용 전====="); //메소드	
		//계산 시 필요한 정보들  (시급은 얼만지, 근무시간은 하루에 몇시간인지, 근무일수는 한달에 몇일인지)
		System.out.println("시급: 9160 원");
		System.out.println("근무시간: 6 시간 ");
		System.out.println("근무일수: 15 일");
		
	    //월급 = 시급*근무시간*근무일수 
	    // 김갑생: OOOOOO원 형식으로 출력
		
	    //1. 자바에서 곱셈 연산은 x로 표시하지 않고 *로 표시한다.
		//2. 자바에서 문자열을 ""(쌍따옴표)로 묶어서 표현하고, 숫자는 그냥 표현하면 된다.
		//3. 자바에서 서로 다른 형태의 값을 여러개 연이어서 붙이고 싶을 경우에는 +기호로 쓴다. 
	    System.out.println("강민수: "  + 9160 * 6 * 15  + " 원"); 
	    //여기서 우리가 원하는 값은? 계산된 결과인 824400원
	    System.out.println("김동현: " +  9160 * 6 * 15 + " 원");
	    System.out.println("김유진: " +  9160 * 6 * 15 + " 원");
	    System.out.println("김한솔: " +  9160 * 6 * 15 + " 원");
	    System.out.println("김현우: " +  9160 * 6 * 15 + " 원");
	    
	    //변수를 사용해보자
	    System.out.println(); // 줄바꿈만 이루어짐
	    //System.out.print("\n");//같은 역할
        
	    System.out.println("===== 변수 사용후 =====");
	    //맛보기로 변수를 선언하고 값을 대입해보기
	    int pay = 9200; // 시급을 담아두는 변수
	    int time = 6; //근무시간을 담아두는 변수
	    int day = 15; //근무일수를 담아두는 변수
	    
	    //변수의 이름을 가지고 출력해보기
	    System.out.println("시급: " + pay + " 원");
	    System.out.println("근무시간: "  + time +  " 시간");
	    System.out.println("근무일수: " + day +  " 일");
	    
	    //월급 = 시급 * 근무시간 * 근무일수
	    System.out.println("문정인: "+ pay * time * day + " 원" );
	    System.out.println("박경아: "+ pay * time * day + " 원" );
	    System.out.println("박민규: "+ pay * time * day + " 원" );
	    
	    /*
	     *  *변수를 사용하는 이유
	     *  1. 변수는 우선적으로 값에 의미를 부여할 목적으로 사용 (가독성이 좋아진다.)
	     *  2. 단 한번만 값을 기록하고 필요할 때마다 계속 이름만 불러서 사용할 목적으로 씀(재사용성이 좋아진다.)
	     *  3. 유지보수(AS)를 보다 쉽게 할 수 있다. 
	     */
	    
	} //printSalary 메소드 영역 끝

	//변수의 선언
	public void declareVariable() {
		
		/*
		 * *변수의 선언
		 * 값을 기록하기 위한 변수를 메모리 공간에 확보해 두겠다.
		 * ==> 일정 용량을 가진 상자를 만들겠다.
		 * [표현법] 자료형 변수명;
		 * 
		 * 자료형: 변수의 크기 및 모양을 지정하는 부분
		 * 변수명: 변수의 이름을 정하는 부분
		 * 
		 * - 변수 선언시 주의할 점
		 * 1. 변수명은 소문자로 시작하게끔 이름을 지어줄것 (단, 낙타봉표기법을 지킬것)
		 * 2. 같은 영역({ 공간 안  }) 안에서는 동일한 변수명으로 선언 불가하다.(이름이 중복될 수 없다.)
		 * 3. 해당 영역({       }) 안에 선언된 변수는 그 해당 영역 안에서만 사용이 가능하다.
		 *     즉, 다른 메소드에서는 사용이 불가하다. => 지역변수 개념 
		 */
		
		//-----자료형에 대한 개념 -----
		// 1. 논리형 (true /false => 논리값)
		boolean isTrue; //1byte
		
		// 2. 숫자형
		//2_1.정수형
		byte bNum;  //1byte (-128~127) 
		short sNum; //2byte 
		int iNum; //4byte (-21억xxx ~ 21억xxx) => 정수형 자료형중 기본자료형
		long lNum; //8byte 
		
		//2_2.실수형: 사이즈에 따라 소숫점 아래의 더 많은 숫자들을 표현할 수 있다.
		float fNum; //4byte => 소숫점 아래 7자리까지 표현 가능
		double dNum; //8byte => 소숫점 아래 15자리까지 표현 가능, 실수형 자료형 중 기본자료형
                     //         소숫점이 더 길수록 정밀한 표현이 가능하기 때문에 기본자료형이다.
		
		//3. 문자형
		char ch; //2byte 
		
		// ----- 여기까지는 총 8개의 기본자료형   -----
		
		//4.문자열형 (참조자료형)
		 String str; 
		 
		 //----- 여기까지 총 9개의 박스가 생성이 된것 (메모리의  Stack영역에) -----
		 
		 /*
		  * 이미 만들어진 변수에 값을 대입 (=박스에 값을 담기)
		  * [표현법] 변수명 = 값; 
		  */
		 
		 isTrue = true;
		 
		 bNum = 1;
		 sNum = 2;
		 iNum = 4;
		 lNum = 8L;  //long 임을 대놓고 알려주기 위해 l 또는 L을 숫자 뒤에 같이 표기해주는 편(L을 더 권장)
		 
		 fNum = 4.0f; // 반드시 f를 붙여줘야 한다.
		 dNum = 8.0;  
		 
		 ch = 'A'; //자바에서 문자형 값의 경우는 반드시 ' ' (작은따옴표) 로 묶어서 표현한다.
		 str = "안녕하세요"; //자바에서 문자열형 값의 경우는 반드시 " " (쌍따옴표)로 묶어서 표현한다.
		 
		 //----각 변수에 담긴 값을 출력----
		 System.out.println("isTrue : " +isTrue );
		 System.out.println("bNum : " +bNum);
		 System.out.println("sNum : "+sNum);
		 System.out.println("iNum : "+iNum);
         System.out.println("lNum : "+lNum);
         System.out.println("fNUM : "+fNum);
         System.out.println("dNum : "+dNum);
         System.out.println("ch : "+ch);
         System.out.println("str : "+str);
         
	} //declareVariable 메소드 영역 끝
	
	// 변수 선언과 동시에 대입 = 변수를 초기화 시킨다.
	public void initVariable() {
		
		/*
		 * 변수 선언과 동시에 값 대입 (=초기화)
		 * [표현법] 자료형 변수명 =값;
		 */
		
		//1.논리형
		boolean isTrue = 3 + 5 < 1 ;  //1byte
		// 3 + 5 < 1 : 3 + 5가 1보다 작습니까? => 아니요, 더 큽니다. => false
		//결과가 true 아니면 false 값으로 나올수 있는 수식도 boolean 타입의 변수에 담길 수 있다.
		
		//2_1.정수형
		byte bNum = 1; //1byte
		short sNum = 2; //2byte
		int iNum = 4; //4byte
		long lNum = 8L; //8byte
		
		//2_2.실수형
		float fNum = 4.0f; //4byte
		double dNum = 8.0; //8byte
		
		//3.문자형
		char ch = '김'; //2byte
		
		//4.문자열(참고자료형)
		String str = "자바 공부중 ";
		
		//각 변수에 담긴 값 출력
		System.out.println("isTrue :"+ isTrue);
		System.out.println("bNum :"+bNum);
		System.out.println("sNum :"+sNum);
		System.out.println("iNum :"+iNum);
		System.out.println("lNum :"+lNum);
		System.out.println("fNum :"+fNum);
		System.out.println("dNum :"+ dNum);
		System.out.println("ch :"+ ch);
		System.out.println("str :"+str);
		
	}//intitVariable 메소드 영역 끝
	
	//상수(constant)
	public void constant() {
		
		//기존의 변수
		int age = 20; //선언과 동시에 대입
		
		System.out.println("age : "+ age );
		
		//변수의 특징: 값을 바꿀수 있다.
		age = 25; //대입
		System.out.println("변경된 age : " +age);
		
		/*
		 * *상수: 변하지 않는 값
		 *       한번 기록된 값이 변경 불가하다.
		 *  => 항상 고정적인 값을 기록할 때 사용
		 *     예) 파이 : 원주율 
		 * 상수 선언 시 주의할점
		 * 1. final 키워드를 붙여서 선언
		 * 2. 상수명은 항상 대문자로 
		 * 
		 * [표현법] final 자료형 상수명 = 값;
		 */
		 
		final int AGE = 20;
		
		System.out.println("상수 AGE : " + AGE);
		
		//이미 값이 대입되어 있는 상태에서 상수에 새로운 값을 대입
		//AGE =25;
		//The final local variable AGE cannot be assigned. 발생
		//final 키워드가 붙은 지역변수인 AGE는 대입 당할 수 없다.
		// => 상수에 이미 값이 있을 경우 대입 자체가 안됨.
		
	}
	
	
}
