package cn.titaniume.base.chapter03.loopstatementnested;
/*
	�����ڿ���̨����žų˷���

		1*1=1
		1*2=2	2*2=4
		1*3=3	2*3=6	3*3=9
		...
		1*9=9	2*9=18	3*9=27	4*9=36	...

	ת���ַ���
		\t	tab����λ��
*/
class ForForDemo3 {
	public static void main(String[] args) {
		
		//��һ���������Ǵ�ӡ������
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + "\t");
			}
			System.out.println();
		}
		//������������Ҫ��*�滻Ϊ���ʽ
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+ "\t");
			}
			System.out.println();
		}
	}
}