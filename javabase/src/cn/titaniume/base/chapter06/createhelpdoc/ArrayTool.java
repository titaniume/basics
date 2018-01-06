package cn.titaniume.base.chapter06.createhelpdoc;


/**
 * 这是针对数组进行操作的工具类
 * @author titaniume
 * 2018年1月6日下午2:40:44
 */
public class ArrayTool {
	
	
	//把构造方法私有
	private ArrayTool(){}
	
	/**
	 * 遍历数组格式是:[元素1,元素2....]
	 * @param arr 需要被遍历的数组
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
	 * 获取数组中的最大值
	 * @param arr 需要求最大值的数组
	 * @return  返回最大值
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
