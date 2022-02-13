package com.kh.variable;

public class C_Cast {

	/*
	 * *����ȯ
	 * ���� �ڷ����� �ٲٴ� ����
	 * 
	 * ��ǻ�� �󿡼� �� ó�� ��Ģ
	 * 1. = (���Կ�����) �� �������� ���ʰ� �������� ���� �ڷ����̾�� �Ѵ�.
	 *     => ��, ���� �ڷ����� �ش��ϴ� ���� ������ ����
	 *     => �ٸ� �ڷ����� ���� �����ϰ��� �Ѵٸ� "����ȯ"�� �ʼ�
	 * [ ǥ���� ] �ڷ��� ������ = (�ٲ��ڷ���)��;     
	 *     
	 * 2. ���� �ڷ��� ������ ������ �����ϴ�.
	 *    => ��, �ٸ� �ڷ������� ������ �����ϰ����� ��쿡�� "����ȯ" �� �ʼ� 
	 * [ ǥ����] �� + (�ٲ��ڷ���)��;   
	 * 
	 * ����ȯ�� ����  
	 * 1. �ڵ�����ȯ => �ڵ����� ����ȯ�� ����Ǳ� ������ ���� ���� �ڵ������ ����ȯ �� �ʿ䰡 ���� 
	 *                 ����  ����Ʈ�� �ڷ��� �� -> ū ����Ʈ�� �ڷ��� ������ ���� ��� 
	 * 2. ��������ȯ => �ڵ�����ȯ�� ������� �ʴ� ��� ���� ���� ������ ����ȯ �ؾ��ϴ� ���
	 *                  ū ����Ʈ�� �ڷ��� ��   -> ���� ����Ʈ�� �ڷ��� ������ ���� ���
	 *                ��������ȯ�� ��������ȯ �̶���� �θ���.         
	 *          
	 * [ ǥ���� ]  (�ٲ��ڷ���)�ڷ������ٲٰ�������;                     
	 *   => (�ٲ��ڷ���): ����ȯ ������ , Cast ������                                            
	 */
	
	// �ڵ�����ȯ: ���� ����Ʈ�� �ڷ��� ��-> ū ����Ʈ�� �ڷ��� ������ ���� ��� �߻�
	public void autoCasting() {
		
		// �ڵ�����ȯ�� �Ǵ� case
		//1. int(4byte) -> double (8byte) 
		int i1 = 10;
		double d1 =/*  (double)������ */i1;
		
		System.out.println("d1 : "  +d1);
		// �ڵ����� ����ȯ�� �Ǿ���.
		// �׷��� int�� ����, double�� �Ǽ��̹Ƿ�
		// d1 10 -> 10.0 ���� ����ȯ�� �ȴ�.
		
		int i2 =12;
		double d2 = 3.3;
		
		double result2 = /* (double) */i2 + d2; // 12.0 + 3.3=15.3 
		
		System.out.println("result2 " +result2);
		
		//2. int(4byte) -> long(8byte)
		int i3 = 1000;
		long l3 = /* (long) */i3;   // 1000
		
		long l4 = /* (long) */2000; // L�� ������ �ʾƵ� ������ ���� ����: �ڵ�����ȯ�� �Ǳ� ������    
		
		System.out.println("l3  : "+ l3);
		System.out.println("l4  : "+ l4);
		
		//Ư�����̽�3. long(8byte����) -> float(4byte�Ǽ�) 
	    //������ �Ǽ��� ��ȯ�� ��� ū �������� ������ ���� �������� �Ǽ��� ��ȯ�� �����ϴ�.
		// 4byte float ���� ��� long ������ ���� �� �ִ� ���� ������ ũ�� ������ �����ϴ�.
		
		long l5 = 1000000000;
		float f5 = /*(float) */l5; //1.0E9 =1000000000.0
		
		System.out.println("f5: "+f5);
		
		//Ư�����̽�4. char(2byte����) <-> int(4byte����) ����� ����ȯ ����
		char ch =/* (char) */ 65;
		
		System.out.println("ch : "+ ch);  //'A' 
		
		int num = /* (int) */'A';
		
		System.out.println("num :" +num);  //65
		
		System.out.println((int)'��');  // 44608
		
		/*
		 * ����) �ƽ�Ű�ڵ�ǥ 
		 * �� ���ں��� ������ ���ڰ����� ��ġ�Ǽ� ǥ���Ǵ� ���� ( 0 ~ 127, ������ ��ҹ��� ���ĺ�, ���� , Ư������  )
		 * 'A' = 65 / 'a' = 97
		 * 
		 * ����) �����ڵ�ǥ
		 * �� ���ں��� ������ ���ڰ����� ��ġ�Ǽ� ǥ���Ǵ� ����
		 * �ƽ�Ű�ڵ�ǥ�� Ȯ��� ���� (0 ~ 65xxx, ����, ����, Ư������, �� �̿��� ��� )
		 */
		
		int sum = 'A' + 10 ;  // 65 + 10 = 75
		
		System.out.println("sum : "+ sum); //���ڿ� ���� ���̿� ��������� �����ϴ�. 
		System.out.println("sum : "+ (char)sum ); //���ĺ� ���� �������� Ȯ�� �����ϴ�. 
		
		//Ư�����̽�5. byte, short������ ���� 
		byte b1 = 1; 
		byte b2 = 10;
		
		byte result = (byte)(b1 + b2);// int ���� ����� ������ byte������ ��ȯ  
		//byte �� short ����� ������ int(4byte)�� ���
		
	}//autoCasting �޼ҵ� ���� ��
			
     // ����(������) ����ȯ : ū ũ���� �ڷ����� ���� ũ���� �ڷ������� ����ȯ �Ұ��(������ ����ȯ �����ڸ� �ٿ��� �� ��� )
	public void forceCasting() {
		
		//��������ȯ �ؾ��ϴ�case
		
		//1. double(8byte) -> float(4byte)
		float f1 = 4.0f; //�׻� f�� �ٿ���� ��.
		
		double d2 = 8.0;
		float f2 = (float)d2;
		
		//2. double(8byte) -> int (4byte)
		double d3 = 10.89;
		int i3 = (int)d3; // 10.89 -> 10
		
		System.out.println("i3 : "+i3);
		// ���� ����ȯ �� ���ǻ���
		// ������ �ս��� �Ͼ  �� �ִ�. ��������ȯ�� ������ �ؾ��Ѵ�. 
		//=> �Ҽ��� �Ʒ� ������ ����Ǿ���.
		
		int iNum = 10;
		double dNum = 5.89;
		
		 // int iSum = iNum+ dNum ;
		//iNum +dNum : iNum�� ��������� ū �������� double ������ �ڵ�����ȯ�� �ǰ�
		//             dNum�� ���������� ������ ���� => �׷��� ���� double �����̴�. 
		
		//�ذ���
		//1. �������� int���� ���缭 ���� ����ȯ��Ű�� 
		  int iSum = (int)(iNum +dNum);
		  
		  System.out.println("iSum : "+ iSum); // 15.89 -> 15
		  
	   //2. ���� ���� ���� dNum�� int������ ��������ȯ �Ŀ� ���� ������ ����
	   //=> �ڵ�����ȯ�� ���� ����Ʈ�� ū ����Ʈ�� ��ȯ�Ǳ� ������
	   //   ������ζ�� iNum�� double �� ��ȯ �Ŀ� ������ ����Ǵ� ����
	   //=> �׷��� �� ���� �Ϻη� dNum �� int������ ������ ��ȯ��Ű�� ���� ���� ������ ����
		  int iSum2 = iNum +(int)dNum ; // 10 +5.89 -> 10+5
		  
		  System.out.println("iSum : " + iSum2); //15
		  
	   //3. ������� double �� ������ ���
	   //=>  �̰��, ������ �ս��� ��� ��Ȯ�� ���� ����.
		  double dSum = iNum + dNum ; //10.0 +5.89 
		  System.out.println("dSum : " +dSum); //15.89 
		  
		/*
		 * ��������ȯ�� �ַ� �ϴ� ���
		 * Type mismatch: cannot convert from xxx to xxx ���� �߻���
		 */
	}
	
	
	
	
	
	
}








