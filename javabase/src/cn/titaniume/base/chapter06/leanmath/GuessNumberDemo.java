package cn.titaniume.base.chapter06.leanmath;

import java.util.Scanner;

/**
���󣺲�����С��Ϸ

������
	A:ϵͳ����һ��1-100֮����������
		int number = (int)(Math.random()*100)+1;
	B:����¼������,��Scannerʵ��
	C:�����������ݽ��бȽ�
		��	��ʾ����
		С	��ʾС��
		��	��ϲ�㣬������
	D:Ϊ�˱�֤�����ܹ����У����Ǿͼ���ѭ����ʵ�ֶ�β¡�ֱ�����С�
*/
public class GuessNumberDemo {

	public static void main(String[] args) {
		//ϵͳ����һ��1-100֮����������
		int rand=(int)(Math.random()*100)+1;
		//System.out.println(rand);
		while(true){
			//����¼������,��Scannerʵ��
			Scanner sc = new Scanner(System.in);	
			System.out.println("����������:[1~100֮�������:]");
			int guessnum = sc.nextInt();
			
			
			//�����������ݽ��бȽ�
			
			if(guessnum > rand){
				System.out.println("��µ�����"+guessnum+"̫����");
			}else if(guessnum < rand){
				System.out.println("��µ�����"	+guessnum+"̫С��");
			}else{
				System.out.println("��ϲ�㣬�����˰���");
				break;
			}
			
		}
	}

}
