package cn.titaniume.base.chapter07.inherit;
/*
�̳��еĹ��췽����ϵ��
	���������еĹ��췽��Ĭ�϶�����ʸ����пղ����Ĺ��췽��

	Ϊʲô��?
		��Ϊ�����̳и����е����ݣ����ܻ���ʹ�ø�������ݡ�
		���ԣ������ʼ��֮ǰ��һ��Ҫ����ɸ������ݵĳ�ʼ����


��ô���ҿɲ����Է��ʸ��׵Ĵ��ι��췽����?
	���ԡ�ͨ��super(...)

ע�����
	A:ÿһ�����췽���ĵ�һ�����Ĭ�϶��ǣ�super()
	B:super(...)��������ʽ�ڹ��췽����ֻ�ܳ���һ�Ρ�
	C:�������û���޲ι��췽������ô������ֻ��
		a:ͨ��superȥ���ʸ���Ĵ��ι��췽����
		b:ͨ��thisȥ���ʱ�����������췽����
*/

class Fu1{
	
	public Fu1(){
		System.out.println("Fu1�޲ι���");
	}
	
	public Fu1(String name){
		System.out.println("hello");
	}
}

class Zi1 extends Fu1 {
	public Zi1() {
	//super();    //ָ����������޲ι���
	 //super("aaa");	//ָ��������вι��죬һ������
	 //this("aaa");		//ָ����������вι��죬һ������
	System.out.println("zi()");
	}

	public Zi1(String name) {
		// super();
		//super(name);
		// this();
		System.out.println("world");
	}

}
public class ExtendsDemo4 {
	public static void main(String[] args) {
		//�����������
		Zi1  z = new Zi1();
		System.out.println("-------------");
		Zi1 z2 = new Zi1("java");
	}
}
