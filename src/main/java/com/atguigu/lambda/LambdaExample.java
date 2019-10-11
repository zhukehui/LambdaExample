package com.atguigu.lambda;

@FunctionalInterface
interface Calculate {
	
	//void method();
	
	int add(int x,int y);
	
	default int div(int x,int y) {
		return x / y ;
	}
	
	default int div2(int x,int y) {
		return x / y ;
	}
	
	static int mul(int x , int y) {
		return x * y ;
	}
	static int mul2(int x , int y) {
		return x * y ;
	}
	
}

/**
 * Lambda Express（前提是函数式接口，只有一个方法）
 *
 * 2.1 拷贝小括号 (...) ，写死右箭头 -> ，落地大括号 { 重写接口的方法体 }
 * 2.2 注解@FunctionalInterface表示此接口为函数式接口，只能有一个抽象类
 * 2.3 default方法 可以有多个
 * 2.4 static方法 可以有多个
 *
 */

public class LambdaExample {

	public static void main(String[] args) {
		
		/*
		 * Calculate calculate = new Calculate() {
		 * 
		 * @Override public void method() { System.out.println("*****hello*****"); } };
		 * calculate.method();
		 */
		
		Calculate calculate =(int x,int y) -> {
			System.out.println("*****hello*****");
			return x + y;
		};
		System.out.println(calculate.add(2, 5));
		System.out.println(calculate.div(10, 5));
		System.out.println(calculate.div2(10, 2));
		System.out.println(Calculate.mul(2, 5));
		System.out.println(Calculate.mul2(2, 5));
	}

}
