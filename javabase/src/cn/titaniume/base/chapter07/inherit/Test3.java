package cn.titaniume.base.chapter07.inherit;

/*
	����֪ʶ��
		A:������ִ��˳��
			��̬����� --> �������� --> ���췽��
		B:�����ִ���ص�
			��̬�����ִֻ��һ��
			��������ÿ�ε��ù��췽����ִ��
*/
class Fu4 {
	static {
		System.out.println("��̬�����Fu");
	}

	{
		System.out.println("��������Fu");
	}

	public Fu4() {
		System.out.println("���췽��Fu");
	}
}

class Zi4 extends Fu4 {
	static {
		System.out.println("��̬�����Zi");
	}

	{
		System.out.println("��������Zi");
	}

	public Zi4() {
		System.out.println("���췽��Zi");
	}
}

class Test3 {
	public static void main(String[] args) {
		Zi4 z = new Zi4();
		Zi4 z2 = new Zi4();
	}
}
