package cn.titaniume.base.chapter03.loopstatementfor;
/*
	�������1-10֮������֮��
		0+1=1
			1+2=3
				3+3=6
					6+4=10
						10+5=15
							...

		��Ϊÿһ�ε��ۼӽ�����Ǳ仯�ģ�����Ҫ����һ��������ר�����ڼ�¼ÿ���ۼӵĽ����
		����������Ҫ��1��2��3��4...Ҳ�Ǳ仯�ģ���������ҲҪ����һ�������������������ѭ�����ܵõ�ÿ��ֵ��
*/
class ForTest2 {
	public static void main(String[] args) {
		//�����
		//System.out.println(1+2+3+4+5+6+7+8+9+10);
	
		//��ѭ���������
		int sum = 0;

		for(int x=1; x<=10; x++) {
			//x=1,2,3,4,...10

			//sum = sum + x; //sum=0 + 1 = 1;
			//sum = sum + x; //sum=1 + 2 = 3;

			//sum = sum + x;
		
			sum += x;
		}

		System.out.println("1-10�ĺ��ǣ�"+sum);
	}
}