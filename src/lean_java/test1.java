package lean_java;

import java.util.Arrays;

/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月11日 下午2:06:41 
 * 类说明 
 */
public class test1 {
	public static void main(String[] args) {
		String[] names = new String[10];
		for (int i = 0; i< names.length; i++)
			names[i] = ""+i;
		System.out.println(Arrays.toString(names));
	}
}
