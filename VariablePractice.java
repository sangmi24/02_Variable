package com.kh.practice1.example;

import java.util.Scanner;//��ĳ�� import��Ŵ

public class VariablePractice {

	public void method1() {
		//�̸�(String), ����(char),����(int),Ű(double)�� ����ڿ��� �Է� �޾� ������ ����
		//������ ��� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);//����ϱ�
		System.out.print("�̸��� �Է��ϼ��� :");//�̸� �Է� ����
		String name = sc.nextLine();//name�̶�� ��������� 
		
		System.out.print("���̸� �Է��ϼ��� :");//���� �Է� ����
		int age = sc.nextInt();//age ���� ����� 
		sc.nextLine(); //nextInt �� �浹�� ���ϱ����� ��
		
		System.out.print("������ �Է��ϼ���(��/��) : ");//���� �Է� ����
		char gender = sc.nextLine().charAt(0); //�����Ѱ� �Է�char.At(); ����.
		
		System.out.print("Ű�� �Է��ϼ���(cm): "); //Ű �Է� ����
		double height =sc.nextDouble(); //height ���� ����
		
		
		System.out.println("Ű  "+ height+"��   "+ age+"�� "+ gender+"��  "+ name+"��   �ݰ����ϴ�^^");
	}
	public void method2() {
		//Ű����� ���� �ΰ��� �Է� �޾� �μ��� ��, ��, ��, �������� ���� ����ϼ���.
		//(HINT: +, - , * , /)
		Scanner sc= new Scanner(System.in);  //����ϱ�
		System.out.print("ù ��° ������ �Է��ϼ��� : "); //ù��° ���� �Է� ����
		int num1 = sc.nextInt();  //num1 ���� ����
		
		System.out.print("�� ��° ������ �Է��ϼ��� : "); //�ι�° ���� �Է� ����
		int num2 = sc.nextInt();  //num2 ���� ����
		
		System.out.println();//���� ����
		System.out.println("���ϱ� ��� : "+(num1 + num2)  ); //����2�� ����
		System.out.println("���� ��� : "+ (num1 - num2)  ); //����2�� �M
		System.out.println("���ϱ� ���: "+(num1 * num2)  ); //���� 2�� ����
		System.out.println("������ ���: "+(num1 / num2)  ); //���� 2�� ����	
	}
	public void method3() {
		//Ű����� ����, ���� ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���.
		//*���� (����=����*����,  �ѷ�= (����+����)*2  )
		Scanner sc = new Scanner(System.in);//���
		System.out.print("����: "); //���� �Է� ����
		Double w =sc.nextDouble();//���� ����
		
		System.out.print("����: ");//���� �Է� ����
		Double v =sc.nextDouble(); //���� ����
		
		System.out.println();//���� ����
		System.out.println("���� : "+(w * v)  ); //����= ����*����
		System.out.println("�ѷ� : "+(w+v)*2  ) ; //�ѷ�= (����+����)*2	
	}
	public void method4() {
		//���� ���ڿ� ���� Ű����� �Է� �޾� ���� ���� ������ ����ϼ���.
		//HINT : charAt(�ε���) �޼ҵ� Ȱ���غ���
		
		Scanner sc= new Scanner(System.in); //����ϱ�
		System.out.print("���ڿ��� �Է��ϼ���  :"); //�Է� ����
		String str = sc.nextLine(); 
		
		//���ڿ��κ��� ���ڸ� ����: ���ڿ�.charAt(����������� ��ġ)
		char first = str.charAt(0); //���� �ϳ� �̾ƾ� �ؼ� charAt���
		char second = str.charAt(1);  //���� ����
		char third = str.charAt(2);
		
		System.out.println("ù ��° ���� : "+first); //���
		System.out.println("�� ��° ���� : "+second);
		System.out.println("�� ���� ���� : "+third);
		
		
	}
	
	
}













