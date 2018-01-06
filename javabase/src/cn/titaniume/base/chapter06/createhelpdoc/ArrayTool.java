package cn.titaniume.base.chapter06.createhelpdoc;


/**
 * �������������в����Ĺ�����
 * @author titaniume
 * 2018��1��6������2:40:44
 */
public class ArrayTool {
	
	
	//�ѹ��췽��˽��
	private ArrayTool(){}
	
	/**
	 * ���������ʽ��:[Ԫ��1,Ԫ��2....]
	 * @param arr ��Ҫ������������
	 */
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(i==arr.length-1){
				System.out.print(arr[i]);
			}else{
				System.out.print(arr[i]+" ,");
			}
		}
		System.out.println("]");
	}
	
	/**
	 * ��ȡ�����е����ֵ
	 * @param arr ��Ҫ�����ֵ������
	 * @return  �������ֵ
	 */
	public static int getMax(int[] arr){
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}

}
