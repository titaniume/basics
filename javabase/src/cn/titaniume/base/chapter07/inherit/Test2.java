package cn.titaniume.base.chapter07.inherit;

/*
	����֪ʶ��
		A:�̳м�Ĺ��췽����ϵ
			����������󣬻���ȥ���ʸ���Ĺ��췽�����Ը�������ݽ��г�ʼ����
		B:�̳м�ĳ�Ա������ϵ
			�ͽ�ԭ��
		C:this��super��ʹ��
		D:һ����ĳ�ʼ������
			��Ա������ʼ��
				Ĭ��
				��ʾ
				���췽��
*/
class Fu3{
	public int num = 10;
	public Fu3(){
		System.out.println("fu");
	}
}
class Zi3 extends Fu3{
	public int num = 20;
	public Zi3(){
		System.out.println("zi");
	}
	public void show(){
		int num = 30;
		System.out.println(num);
		System.out.println(this.num);
		System.out.println(super.num);
	}
}
class Test2 {
	public static void main(String[] args) {
		Zi3 z = new Zi3();  
		z.show();
	}
}