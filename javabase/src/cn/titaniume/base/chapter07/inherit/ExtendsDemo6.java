package cn.titaniume.base.chapter07.inherit;

/*
�̳м�ĳ�Ա������ϵ��
	��ͬ���ƣ��ǳ��򵥣�һ����֪������˭
	��ͬ���ƣ�
		����������
		���ڸ�����
		...
		�Ҳ����ͱ���
*/

class Fu2{
	public void show (){
		System.out.println("show fu2");
	}
}

class Zi2 extends Fu2{
	public void method() {
		System.out.println("method zi");
	}

	public void show() {
		System.out.println("show zi");
	}
}


public class ExtendsDemo6 {

	public static void main(String[] args) {
		Zi2 z = new Zi2();
		z.show();
		
		z.method();

	}

}
