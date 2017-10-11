package lean_java;

import java.util.Arrays;

/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月11日 下午3:14:55 
 * 类说明 
 */
public class test2 {
	public static void main(String[] args) {
		int [] aa = {1, 2 ,3, 4, 5};
		int [] bb = Arrays.copyOf(aa, 10);
		for (int i = 0; i< bb.length; i++)
			System.out.println(bb[i]);
	}
}
