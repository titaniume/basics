package cn.titaniume.base.chapter01.relationaloperators;

/*
	&&��&������? ǰ���ж�·Ч����ֻҪ�����false���ұ߲�ִ�С������ߣ�ȫ��ִ�С�
	||��|������? ǰ���ж�·Ч����ֻҪ�����true���ұ߲�ִ�С������ߣ�ȫ��ִ�С�
*/
class OperatorDemo2 {
	public static void main(String[] args) {
		
		
		/*&��&&�����������߼�������������ʾ�߼��루and��������������ߵı��ʽ�Ľ����Ϊtrueʱ��������������Ϊtrue������ֻҪ��һ��Ϊfalse������Ϊfalse��
		&&�����ж�·�Ĺ��ܣ��������һ�����ʽΪfalse�����ټ���ڶ������ʽ�����磬����if(str != null && !..equals(����))���ʽ����strΪnullʱ��
		����ı��ʽ����ִ�У����Բ������NullPointerException�����&&��Ϊ&������׳�NullPointerException�쳣��If(x==33 & ++y>0) y��������
		If(x==33 && ++y>0)��������
		&����������λ���������&���������ߵı��ʽ����boolean����ʱ��&��ʾ��λ�����������ͨ��ʹ��0x0f����һ����������&���㣬����ȡ�����������4��bitλ��
		���磬0x31 & 0x0f�Ľ��Ϊ0x01��*/
		int a = 10;
		int b = 20;
		int c = 30;

		//&:�߼���	��false��false
		System.out.println(a>b & a>c); //false & false = false
		System.out.println(a>b & a<c); //false & true = false
		System.out.println(a<b & a>c); //true & false = false
		System.out.println(a<b & a<c); //true & true = true
		System.out.println("--------");

		//&&:
		System.out.println(a>b && a>c); //false && false = false
		System.out.println(a>b && a<c); //false && true = false
		System.out.println(a<b && a>c); //true && false = false
		System.out.println(a<b && a<c); //true && true = true
		System.out.println("--------");

		//|:�߼���	��true��true
		System.out.println(a>b | a>c); //false | false = false
		System.out.println(a>b | a<c); //false | true = true
		System.out.println(a<b | a>c); //true | false = true
		System.out.println(a<b | a<c); //true | true = true
		System.out.println("--------");

		//||:
		System.out.println(a>b || a>c); //false || false = false
		System.out.println(a>b || a<c); //false || true = true
		System.out.println(a<b || a>c); //true || false = true
		System.out.println(a<b || a<c); //true || true = true
		System.out.println("--------");

		int x = 3;
		int y = 4;
		//System.out.println((x++)>3 & (y++)>4); //false & false = false
		//System.out.println(x);//4
		//System.out.println(y);//5
		System.out.println((x++)>3 && (y++)>4);
		System.out.println(x);//4
		System.out.println(y);//4
	}
}
