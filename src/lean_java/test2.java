package lean_java;

import java.util.Arrays;

/** 
 * @author ���� : jwh5566
 * @version ����ʱ�䣺2017��10��11�� ����3:14:55 
 * ��˵�� 
 */
public class test2 {
	public static void main(String[] args) {
		int [] aa = {1, 2 ,3, 4, 5};
		int [] bb = Arrays.copyOf(aa, 10);
		for (int i = 0; i< bb.length; i++)
			System.out.println(bb[i]);
	}
}
