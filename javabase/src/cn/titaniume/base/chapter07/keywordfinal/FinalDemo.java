package cn.titaniume.base.chapter07.keywordfinal;



/*
�ܶ�ʱ�����ǿ��ܲ����������޸��ҵ����ݡ����ʱ�����ô����?
������������java���ṩ��һ��״̬���η���final��

final:���յ���˼��

���ã�
	���������࣬��Ա��������Ա������

�ص㣺
	�ࣺ�౻final���Σ�˵�������������࣬���ܱ��̳С�
	��Ա������������final���κ󣬾ͱ���˳�����ֵ���ܱ��޸ġ�
	��Ա�������������ܱ�������д��
*/
/*final*/ class Fu {
	public int num = 10;
	public final int num2 = 20;

	public final void getResource() {
		System.out.println("�����Ǿ��ܵ���Դ,���ܱ���д");
	}
	
	public void show() {
		num = 100;
		System.out.println(num);
		//num2 = 200;
		System.out.println(num2);
	}
}

class Zi extends Fu {
	
/*	public void getResource() {
		System.out.println("���������ʲô�͸�ʲô");
	}
	*/
}
public class FinalDemo {

	public static void main(String[] args) {
		Zi z = new Zi();
		z.getResource();
		z.show();

	}

}
