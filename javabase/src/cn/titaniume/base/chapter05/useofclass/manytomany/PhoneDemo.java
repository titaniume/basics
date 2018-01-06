package cn.titaniume.base.chapter05.useofclass.manytomany;
class PhoneDemo {
	public static void main(String[] args) {
		//创建对象
		Phone p = new Phone();

		//使用成员变量
		System.out.println("品牌是："+p.brand);
		System.out.println("价格是："+p.price);
		System.out.println("颜色是："+p.color);
		System.out.println("----------------");

		//给成员变量赋值
		p.brand = "三星";
		p.price = 2999;
		p.color = "蓝色";

		//再次使用成员变量
		System.out.println("品牌是："+p.brand);
		System.out.println("价格是："+p.price);
		System.out.println("颜色是："+p.color);
		System.out.println("----------------");

		//调用成员方法
		//String name = "马云";
		//p.call(name);
		p.call("马云");
		p.sendMessage();
	}
}
