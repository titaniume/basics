package cn.titaniume.base.chapter06.objpractice.regtanclecase;

/**
 * 定义一个长方形类定义周长和面积方法，然后定义一个Test进行测试
 * @author titaniume
 * 2018年1月6日下午1:52:05
 */
class Regtancle{
	
	private int length;
	private int width;
	
	public Regtancle(){}
	public Regtancle(int length,int width){
		this.length = length;
		this.width = width;
	}
	
	public  void setLength(int length){
		this.length = length;
	}
	
	public int getLength(){
		return length;
	}
	
	public void setWidth(int width){
		this.width = width;
	}
	public int getWidth(){
		return width;
	}
	
	/**
	 * 计算周长
	 * @param length
	 * @param width
	 * @return
	 */
	public int perimeter(){
		
		return (length + width)/2;
	}
	
	
	/**
	 * 计算面积
	 * @param length
	 * @param width
	 * @return
	 */
	public int area(){
		
		return length * width;
	}

}


public class TestRegtancle {

	public static void main(String[] args) {
		
		//无参调用
		Regtancle reg = new Regtancle();
		reg.setLength(18);
		reg.setWidth(20);
		int perimeter = reg.perimeter();
		System.out.println("周长是:"+perimeter);
		
		int area = reg.area();
		System.out.println("面积是:"+area);

		
		//带参
		Regtancle reg2 = new Regtancle(18, 20);
		int perimeter2 = reg2.perimeter();
		System.out.println("周长是:"+perimeter2);
		
		int area2 = reg2.area();
		System.out.println("面积是:"+area2);

	}

}
