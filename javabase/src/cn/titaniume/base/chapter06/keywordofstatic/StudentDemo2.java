package cn.titaniume.base.chapter06.keywordofstatic;


/*
static:��̬�ؼ��֡�

���ã�
	�������γ�Ա�����ͳ�Ա����

�ص㣺
	A:������ļ��ض�����	
	B:�����ڶ������
	C:��������ж�����
		��Ҳ�������ж��Ƿ�ʹ�þ�̬�ؼ��ֵ�����

		��ˮ�������Ա���̬����
		ˮ���������Ա���̬����
	D:����ͨ����������
		���ǵĵ��üȿ����Ƕ��󣬻�����������
*/
class Students {
public void show() {
	System.out.println("show");
}

public static void show2() {
	System.out.println("show2");
}
}
public class StudentDemo2 {

	public static void main(String[] args) {
		Students s = new Students();
		s.show();
		s.show2();

		Students.show2();
		//Student.show();

	}

}
