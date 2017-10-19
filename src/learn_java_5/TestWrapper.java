package learn_java_5;

import org.junit.Test;

/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月19日 下午2:12:25 
 * 类说明 
 */
public class TestWrapper {
	
	@Test
	public void test1() {
		int i = 10;
		System.out.println(i);
		Integer i1 = new Integer(i);
		System.out.println(i1.toString());
		
		Boolean b1 = new Boolean("true");
		System.out.println(b1);
		
		String str1 = String.valueOf(i);
	}
	
	@Test
	public void test2() {
		System.out.println(1111111);
	}
}
