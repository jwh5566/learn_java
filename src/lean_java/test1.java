package lean_java;

import java.util.Arrays;

/** 
 * @author ���� : jwh5566
 * @version ����ʱ�䣺2017��10��11�� ����2:06:41 
 * ��˵�� 
 */
public class test1 {
	public static void main(String[] args) {
		String[] names = new String[10];
		for (int i = 0; i< names.length; i++)
			names[i] = ""+i;
		System.out.println(Arrays.toString(names));
	}
}
