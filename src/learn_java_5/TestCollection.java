package learn_java_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;

/** 
 * @author ���� : jwh5566
 * @version ����ʱ�䣺2017��10��24�� ����11:27:00 
 * ��˵�� 
 */
public class TestCollection {
	@Test
	public void testCollection1() {
		Collection col1 = new ArrayList();
		System.out.println(col1.size());
		col1.add(123);
		col1.add("AA");
		col1.add(new Date());
		col1.add("BB");
		System.out.println(col1.size());
	}
}
