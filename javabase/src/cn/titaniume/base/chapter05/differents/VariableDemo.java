package cn.titaniume.base.chapter05.differents;
/*
	��Ա�����;ֲ�����������
		A:�����е�λ�ò�ͬ
			��Ա���� ���з�����
			�ֲ����� �����ڻ��߷���������
		B:���ڴ��е�λ�ò�ͬ
			��Ա���� ���ڴ�
			�ֲ����� ջ�ڴ�
		C:�������ڲ�ͬ
			��Ա���� ���Ŷ���Ĵ��ڶ����ڣ����Ŷ������ʧ����ʧ
			�ֲ����� ���ŷ����ĵ��ö����ڣ����ŷ����ĵ�����϶���ʧ
		D:��ʼ��ֵ��ͬ
			��Ա���� ��Ĭ�ϵĳ�ʼ��ֵ
			�ֲ����� û��Ĭ�ϵĳ�ʼ��ֵ�������ȶ��壬��ֵ������ʹ�á�
......
		ע�⣺
			�����ͬ���ı�����һ�����þͽ�ԭ��
*/
class VariableDemo {
	//��Ա����
	int x;

	public static void main(String[] args) {
		//�ֲ�����
		int y;
		//System.out.println(y);

		VariableDemo vd = new VariableDemo();
		System.out.println(vd.x);
		test();
	}
	
	public static void test(){
		int x = 12;
		System.out.println(x);
	}
}