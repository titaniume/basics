package cn.titaniume.base.chapter07.inherit;


/*
�̳м�ĳ�Ա������ϵ��
	���ֲ�ͬ���ǳ��ļ򵥣�һ����֪��ʹ�õ���˭��
	������ͬ���ͽ�ԭ��

ʹ�ñ�����ʱ�򣬻����Ҿֲ���Χ��
�����ֱ��ʹ�ó�Ա�������ӹؼ��֣�this���ɡ�
�����ֱ��ʹ�ø���ĳ�Ա�������ӹؼ��֣�super���ɡ�
*/


class Father{
	public int age = 18;
}

class Son extends Father{
	public int num = 10;
	public int age = 25;
	
	public void show(){
		int age = 60;
		System.out.println(age); //�ֲ���Χ
		System.out.println(this.age); //�����Ա��Χ
		System.out.println(super.age); //�����Ա��Χ
		System.out.println(num);
	}
}

	
public class ExtendsDemo3 {

	public static void main(String[] args) {
		Son s = new Son();
		s.show();

	}

}
