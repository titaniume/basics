package cn.titaniume.base.chapter03.loopstatementnested;
/*
	���������һ��4��5�е�����(*)ͼ����

			*****
			*****
			*****
			*****

	����������⣺
		System.out.println("*");
			�ڵ�ǰ�����*�������С�

		System.out.print("*");
			�����ڵ�ǰ�����*

	ѭ��Ƕ���У�
		��ѭ����������
		��ѭ����������
*/
class ForForDemo {
	public static void main(String[] args) {
		//��ʽһ:
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		
		System.out.println("----------");
		//��ʽ��
		//��ѭ���Ľ�һ�����5��*
		//��һ��
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		System.out.println();

		//�ڶ���
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		System.out.println();

		//������
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		System.out.println();

		//������
		for(int x=0; x<5; x++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("------------");
		//ʹ��Ƕ��ѭ��
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}