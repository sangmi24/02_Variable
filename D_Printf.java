package com.kh.variable;

public class D_Printf {

	/*
	 * *출력문 종류
	 * System.out.println(출력하고자하는값); => 값을 출력 후에 줄바꿈을 한번 해주는 역할
	 * System.out.print(출력하고자하는값); => 단순히 값을 출력만 해줌(줄바꿈x)
	 * 
	 * * 새롭게 배울 출력문 printf
	 * [ 표현법]  
	 * System.out.printf("출력하고자하는형식", 출력하고자하는값);
	 * => f 는 format (형식) 을 의미
	 * => 형식에 맞춰서 값들이 출력이 되고 줄바꿈은 이러나지 않음 
	 * => 문자열 안에 그 값들이 들어갈 자리를 다음과 같은 형식으로 잡아줘야 한다.
	 * 
	 * 형식 (빵꾸뚫어놓는 거..)  
	 * %d  : 정수가 들어갈 자리  
	 * %f  : 실수가 들어갈 자리
	 * %c  : 문자가 들어갈 자리  
	 * %s  : 문자열이 들어갈 자리
	 */
	
	public void printfTest() {
		
		// 정수 테스트 (%d)
		int iNum1 = 10;
		int iNum2 = 20;
		
		// iNum : xx , iNum2 : xx 이런 형식으로 출력
		//1. println 사용
		System.out.println("iNum1 : "+ iNum1 +", iNum2 : "+iNum2);
		
		//2.printf 사용
		System.out.printf("iNum1 : %d, iNum2 : %d \n",iNum1, iNum2 );
		//정수값이므로 %d 라는 형식으로 자리를 잡아준다.
		//단, 줄바꿈 기능이 없기 때문에 개행문자 \n을 추가하여 줄바꿈을 해줘야 한다.
		
		
		// 10 + 20 = 30 을 출력해보자
		// 1. println 사용
		System.out.println(iNum1 +" + "+ iNum2 + " = " + (iNum1 + iNum2));
		
		//2. printf 사용
		System.out.printf("%d + %d = %d \n" , iNum1, iNum2, (iNum1 + iNum2));
		
		//  함께 사용할 수 있는 옵션
		System.out.printf( "%5d \n", iNum1 );  // %5d : 5칸의 공간 중 오른쪽 정렬
		System.out.printf("%-5d \n",iNum2);      // %-5d : 5칸의 공간 중 왼쪽 정렬 (음수) 
		System.out.printf("%5d \n",100);   
		
		//실수 테스트(%f)
		double dNum = 4.27546789;
		
		//dNum : xxx 형식
		System.out.printf("dNum: %f \n", dNum); //dNum: 4.275468 
		// %f : 소숫점 아래 7번째 줄에서 반올림이 되어 소숫점 아래 6번째 까지만 출력이 된다. 
        
		System.out.printf("dNum : %.1f \n", dNum); //dNum : 4.3
		//%.1f : 소숫점 아래 2번째 줄에서 반올림이 소숫점 아래 1번째 까지만 출력이 된다.
		// .자리수 로 제어 가능
		
		//문자와 문자열 테스트 ( %c, %s)
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c\t%s \n", ch, str); // a Hello
		// \t : tab 키를 한번 누른 효과 
		// \n : enter 키를 한번 누른 효과
		
		// 옵션
		System.out.printf("%C %S", ch,str); // %C , %S : 영어 알파벳일 경우 대문자로 출력
		
		/*
		 * printf : 포멧 단 한번 제시로 간판하게 출력 가능하다. 
		 *          단, 지정한 포맷의 갯수와 종류, 뒤에 오는 변수의 갯수와 종류가 정확이 맞아 떨어져야만 한다. 
		 */
		
		
		
		
		
		
		
		
	}
	
}
