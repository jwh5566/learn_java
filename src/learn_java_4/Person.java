package learn_java_4;
/** 
 * @author ���� : jwh5566
 * @version ����ʱ�䣺2017��10��18�� ����3:51:41 
 * ��˵�� 
 */
public abstract class Person {
	public abstract String getDescription();
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
