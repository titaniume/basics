package cn.titaniume.base.chapter03.loopstatementwhile;

/*
 �ҹ����ɽ������������壺8848m����������һ���㹻���ֽ�ţ����Ϊ��0.01m��
 ���ʣ����۵����ٴΣ��Ϳ��Ա�֤��Ȳ��������������ĸ߶�?

 ������
 A:��ʼ������
 �ҹ����ɽ������������壺8848m����������һ���㹻���ֽ�ţ����Ϊ��0.01m��
 B:ͳ�Ʊ���
 ���۵����ٴ�
 C:�ж�����
 ֽ�ź��<=8848
 D:�仯������
 ֽ�ź��ÿ�۵�һ������ǰ��2��
 */
class WhileTest {
	public static void main(String[] args) {
	
		//��ʼ������
		int end = 884800;
		int start = 1;
		
		//����ͳ�Ʊ���
		int count = 0;
		
		//whileѭ��
		while(start <=end){
			count ++;
			
			//ֽ�ź��û�۵�һ����֮ǰ��2��
			start*=2;
			
		}
		System.out.println("��Ҫ�۵�:"+count+"��");
		
		//��forѭ��
		int counts =0;
		for (int x=1,y =884800; x <=y; x*=2) {
			counts++;
		}
		System.out.println("��Ҫ�۵�:"+counts+"��");
	}
}