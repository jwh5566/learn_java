package learn_java_4;
/** 
 * @author ���� : jwh5566
 * @version ����ʱ�䣺2017��10��18�� ����4:01:31 
 * ��˵�� 
 */
public class Student extends Person{
	private String major;
	
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public String getDescription() {
		return "a student majoring in " + major;
	}
	
	
}
